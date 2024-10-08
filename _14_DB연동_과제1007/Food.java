package _14_DB연동_과제1007;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Food {
	// CRUD 코드 작성 순서 생각하기
	// 1. 드라이버 로드는 1번만 진행한다.
	// 2. CRUD 작업이 있을 때마다 다음 과정을 생각한다.
	// 	2-1. 커넥션 가져오기
	//	2-2. 쿼리문 만들기
	//	2-3. 쿼리문 완성하기, 매핑하기(Mapping)
	//	2-4. 쿼리문 전송하여 오라클에서 실행하기
	//	2-5. 오라클에서 리턴값 전송하기
	//	2-6. 자바에서 받은 리턴값(2-5) 처리하기
	//	2-7. (★중요) 커넥션 자원 반납하기
	
	// 입력 개체
	Scanner in = new Scanner(System.in);
	
	// 생성자
	Food() {
		// 드라이버 로드는 1번만 진행한다.
		// 1번만 진행하기 때문에 생성자에서 처리한다.
		init();
		
		menu();		// 메뉴선택 메서드
	}
	// 프로그램 시작 시 드라이버 로드
	private void init() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// System.out.println("오라클 드라이버 로드 성공");
			System.out.println("Oracle Driver Load Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 메뉴
	private void menu() {
		while (true) {
			String selNum = null;
			
			System.out.println("◆ 내가 좋아하는 음식 저장하기 ◆");
			System.out.println("▶ 0.프로그램 종료하기");
			System.out.println("▶ 1.음식 추가하기");
			System.out.println("▶ 2.음식 삭제하기");
			System.out.println("▶ 3.음식 수정하기");
			System.out.println("▶ 4.음식 전체보기");
			
			System.out.print("▷ 번호 선택 : ");
			selNum = in.nextLine();
			
			if (selNum.equals("0")) {
				System.out.println("\n프로그램을 종료합니다.");
				break;
			} else if (selNum.equals("1")) {
				System.out.println("\n음식 메뉴를 추가합니다.");
				insert();
			} else if (selNum.equals("2")) {
				System.out.println("\n음식 메뉴를 삭제합니다.");
				delete();
			} else if (selNum.equals("3")) {
				System.out.println("\n음식 메뉴를 수정합니다.");
				update();
			} else if (selNum.equals("4")) {
				System.out.println("\n음식 메뉴를 확인합니다.");
				select();
			} else {
				System.out.println("\n잘못된 번호입니다.");
			}
		}
	}
	// 커넥션 자원을 가져오는 메서드
	private Connection connect() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection
					// jdbc : JDBC 라이브러리
					// oracle : 오라클 연결
					// thin : 자바 연결
					// @localhost : 컴퓨터 내부 아이피
					// 1521 : 포트번호
					// orcl : DB이름
					("jdbc:oracle:thin:@localhost:1521:orcl",
					"system",		// 아이디
					"11111111");	// 비밀번호
			// System.out.println("커넥션 자원 획득 성공");
			System.out.println("Connection Resources Load Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	// 음식 추가하기
	private void insert() {
		FoodDTO food = new FoodDTO();
		
		System.out.println("\n▷ 음식 이름을 입력해주세요.");
		System.out.print("▷ 음식 이름 : ");
		String name = in.nextLine();
		
		System.out.println("\n▷ 음식 종류를 입력해주세요.");
		System.out.print("▷ 음식 종류 : ");
		String type = in.nextLine();
		
		System.out.println("\n▷ 음식을 만든 사람을 입력해주세요.");
		System.out.print("▷ 만든 사람 : ");
		String maker = in.nextLine();
		
		System.out.println("\n▷ 음식점 이름을 입력해주세요.");
		System.out.print("▷ 음식점 이름 : ");
		String shop = in.nextLine();
		
		food.setName(name);
		food.setType(type);
		food.setMaker(maker);
		food.setShop(shop);
		
		Connection conn = null;
		try {
			// 커넥션 자원 가져오기
			conn = connect();
			
			// 쿼리문 만들기
			String sql = "INSERT INTO food VALUES(?,?,?,?)";
			
			// 쿼리문 연결하기
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// 쿼리문 완성하기, 매핑하기(Mapping)
			pstmt.setString(1, food.getName());
			pstmt.setString(2, food.getType());
			pstmt.setString(3, food.getMaker());
			pstmt.setString(4, food.getShop());
			
			// 실행 후 리턴값 가져오기
			// executeUpdate
			//	- INSERT/DELETE/UPDATE(DML) : 반영된 레코드 건수 반환
			//	- CREATE/DROP(DDL) : -1 반환
			int result = pstmt.executeUpdate();
			
			if (result == 0) {
				conn.rollback();	// 작업 취소,복구
			} else {
				conn.commit();		// 작업 저장
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 커넥션 자원 반납하기
			if (conn != null) {
				try {
					conn.close();
					// System.out.println("커넥션 자원 반납 성공");
					System.out.println("Connection Resources Return Success");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			System.out.println("\n음식을 등록하였습니다.");
		}
	}
	
	// 음식 삭제하기
	private void delete() {
		System.out.println("\n▷ 삭제할 음식 이름을 입력해주세요.");
		System.out.print("▷ 음식 이름 : ");
		String name = in.nextLine();
		
		while (true) {
			System.out.println("\n◇ 삭제할 음식 이름은 '" + name + "' 입니다.");
			System.out.println("▷ 해당 음식을 삭제하실건가요?");
			System.out.print("▷ 예(Y)/아니오(N) : ");
			String check = in.nextLine();
			
			if (check.equals("Y") || check.equals("y")) {
				break;
			} else if (check.equals("N") || check.equals("n")) {
				System.out.println("\n취소했습니다.");
				return;
			} else {
				System.out.println("\n잘못된 입력입니다.");
			}
		}
		
		Connection conn = null;
		try {
			// 커넥션 자원 가져오기
			conn = connect();
			
			// 쿼리문 만들기
			// String sql = "DELETE FROM food WHERE name='?'";
			// 위 SQL문은 에러가 발생한다. (에러 : SQLException)
			// 부적합한 열 인덱스, 열 인덱스에 문제가 발생했다는 뜻이다.
			// 왜? 발생하는가?
			// SQL문에서는 조건(WHERE) 작성 시 따옴표('')를 사용하지만,
			// 자바에서 SQL문 작성 시 따옴표도 문자로 취급하여 열 인덱스 에러가 발생한다.
			// 그렇기 때문에 아래와 같이 변경해줘야 에러가 발생하지 않는다.
			String sql = "DELETE FROM food WHERE name=?";
			
			// 쿼리문 연결하기
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// 쿼리문 완성하기, 매핑하기(Mapping)
			pstmt.setString(1, name);
			
			// 실행 후 리턴값 가져오기
			int result = pstmt.executeUpdate();		// 반영된 레코드 수 반환
			
			if (result == 0) {
				conn.rollback();	// 작업 취소,복구
			} else {
				System.out.println("\n'"+ name + "'이(가) 삭제되었습니다.");
				conn.commit();		// 작업 저장
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 커넥션 자원 반납하기
			if (conn != null) {
				try {
					conn.close();
					// System.out.println("커넥션 자원 반납 성공");
					System.out.println("Connection Resources Return Success");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	// 음식 수정하기
	private void update() {
		System.out.println("\n▷ 수정할 음식 이름을 입력해주세요.");
		System.out.print("▷ 음식 이름 : ");
		String name = in.nextLine();
		
		System.out.println("\n▷ 어떤 이름으로 수정하실건가요?");
		System.out.print("▷ ("+ name +") => ");
		String changeName = in.nextLine();
		
		while (true) {
			System.out.println("\n◇ '" + name + "' → '" + changeName + "'");
			System.out.println("▷ 해당 음식 이름을 변경하실건가요?");
			System.out.print("▷ 예(Y)/아니오(N) : ");
			String check = in.nextLine();
			
			if (check.equals("Y") || check.equals("y")) {
				break;
			} else if (check.equals("N") || check.equals("n")) {
				System.out.println("\n취소했습니다.");
				return;
			} else {
				System.out.println("\n잘못된 입력입니다.");
			}
		}
		
		Connection conn = null;
		try {
			// 커넥션 자원 가져오기
			conn = connect();
			
			// 쿼리문 만들기
			// String sql = "UPDATE food SET name='?' WHERE name='?'";
			// 위 SQL문은 에러가 발생한다. (에러 : SQLException)
			// 부적합한 열 인덱스, 열 인덱스에 문제가 발생했다는 뜻이다.
			// 왜? 발생하는가?
			// SQL문에서는 조건(SET,WHERE) 작성 시 따옴표('')를 사용하지만,
			// 자바에서 SQL문 작성 시 따옴표도 문자로 취급하여 열 인덱스 에러가 발생한다.
			// 그렇기 때문에 아래와 같이 변경해줘야 에러가 발생하지 않는다.
			String sql = "UPDATE food SET name=? WHERE name=?";
			
			// 쿼리문 연결하기
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// 쿼리문 완성하기, 매핑하기(Mapping)
			pstmt.setString(1, changeName);
			pstmt.setString(2, name);
			
			// 실행 후 리턴값 가져오기
			int result = pstmt.executeUpdate();		// 반영된 레코드 수 반환
			
			if (result == 0) {
				conn.rollback();	// 작업 취소,복구
			} else {
				System.out.println("\n'" + name + "'이(가) '" + changeName + "'(으)로 변경되었습니다.");
				conn.commit();		// 작업 저장
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 커넥션 자원 반납하기
			if (conn != null) {
				try {
					conn.close();
					// System.out.println("커넥션 자원 반납 성공");
					System.out.println("Connection Resources Return Success");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	// 음식 전체보기
	private void select() {
		Connection conn = null;
		try {
			// 커넥션 자원 가져오기
			conn = connect();
			
			// 쿼리문 만들기
			String sql = "SELECT * FROM food";
			
			// 쿼리문 연결하기
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// 실행 후 리턴값 가져오기
			// SELECT문은 executeUpdate가 아닌 executeQuery 메서드를 사용한다.
			// 쿼리문을 실행하고 결과를 ResultSet 객체로 반환한다.
			ResultSet result = pstmt.executeQuery();
			
			// 출력
			// getString(n)
			// 쿼리문에서 지정한 테이블 컬럼의 n번째 값을 String 자료형으로 가져온다는 뜻이다.
			// 다른 자료형으로도 가져올 수 있다.
			while (result.next()) {		// next() 메서드는 다음 행이 있으면 true를, 없으면 false를 반환한다.
				System.out.println("◇ " + result.getString(1) + " / "
										+ result.getString(2) + " / "
										+ result.getString(3) + " / "
										+ result.getString(4));
			}
			result.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 커넥션 자원 반납하기
			if (conn != null) {
				try {
					conn.close();
					// System.out.println("커넥션 자원 반납 성공");
					System.out.println("Connection Resources Return Success");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
