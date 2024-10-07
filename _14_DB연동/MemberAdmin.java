package _14_DB연동;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberAdmin {
	// ojdbc6으로 개발하는 순서
	// 1. 드라이버 로드를 1번 진행한다.
	// 2. CRUD작업이 있을 때 마다 다음 과정을 생각한다.
	// 	2-1. 커넥션 가져오기
			// 오라클에서 작업하기 전에 커넥션 자원을 획득해야 한다.
			// 커넥션 자원은 한정적이기 때문에 사용 후 반납하는 것이 좋다.(2-7)
			// 오라클은 커넥션 자원을 유한으로 만들어 놓고 공유해서 사용하도록 한다.
	//	2-2. 쿼리문 만들기
	//	2-3. 쿼리문 완성하기(Mapping)
	//	2-4. 쿼리문 전송하여 오라클에서 실행하기
	// 	2-5. 오라클에서 리턴값 전송
	// 	2-6. 자바에서 2-5에서 받은 리턴값 처리
	// 	2-7. 커넥션 자원 반납 (★중요)
	
	MemberAdmin() {
		// 드라이버 로드는 1번만 하면 되므로, 생성자에서 작업
		init();
		insert();
	}

	private void init() {
		// 오라클 드라이버 로드 코딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 로드 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void insert() {
		MemberDTO m = new MemberDTO();
		m.setId("ppp");
		m.setName("park");
		m.setAge(22);
		
		Connection conn = null;
		// 2-1. 커넥션 자원 가져오기
		try {
			conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl",
					"system",		// 아이디
					"11111111");	// 비밀번호
			System.out.println("커넥션 자원 획득 성공");
			// 2-2. 쿼리문 만들기
			// 현재는 입력받은 데이터 값을 모르니까 물음표(?)로 표시
			String sql = "INSERT INTO memberone VALUES(?,?,?,DEFAULT)";
//			String sql = "insert into memberone values(?,?,?,default)";
			
			// 쿼리문을 커넥션을 통해서 연결해라.
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// 2-3. 쿼리문 완성하기(Mapping), 매핑하기
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getName());
			pstmt.setInt(3, m.getAge());
			// 실행 후 리턴 값 가져오기
			int result = pstmt.executeUpdate();
			if  (result == 0) {
				conn.rollback();
			} else {
				conn.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 커넥션 자원 반납하기
			if (conn != null) {
				try {
					conn.close();	// 자원 반납
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
