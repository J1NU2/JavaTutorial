package _15_1_DAO_미션1008;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import _15_1_DTO_미션1008.IdeaDTO;

public class IdeaDAO {
	// 멤버변수
	// 드라이버 이름 : Oracle Driver 사용
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	// 커넥션 자원을 가져올 때, 해당되는 정보를 변수에 저장
	private String userName = "system";		// 아이디
	private String password = "11111111";	// 비밀번호
	/* jdbc : JDBC 라이브러리
	 * oracle : 오라클 연결
	 * thin : 자바 연결
	 * @localhost : 컴퓨터 내부 아이피
	 * 1521 : 포트번호(Oracle)
	 * orcl : DB명
	 */
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private Connection conn = null;			// 커넥션 자원 변수
	public static IdeaDAO idao = null;		// 자기 자신의 객체 주소 변수
	
	// 생성자
	private IdeaDAO() {
		init();
	}
	// 하나의 객체를 공유하기 위한 싱글톤 작업
	public static IdeaDAO getInstance() {
		if (idao == null) {
			idao = new IdeaDAO();
		}
		return idao;
	}
	// 프로그램 시작 시 드라이버 로드
	private void init() {
		try {
			Class.forName(driverName);
			System.out.println("드라이버 로드 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		}
	}
	// 커넥션 자원을 가져오는 메서드, 획득 성공(true)/실패(false)
	private boolean conn() {
		try {
			conn = DriverManager.getConnection(url, userName, password);
			System.out.println("커넥션 자원 획득 성공");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("커넥션 자원 획득 실패");
			return false;
		}
	}
	// 아이디어 등록 기능 수행
	// IdeaDAO 클래스의 suggest메서드 호출 시 IdeaDTO의 정보를 넘겨줘야한다.
	public void suggest(IdeaDTO idto) {
		if (conn()) {
			try {
				// 컬럼 : no, title, content, author
				String sql = "INSERT INTO idea VALUES (idea_no.nextval,?,?,?)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, idto.getTitle());
				pstmt.setString(2, idto.getContent());
				pstmt.setString(3, idto.getAuthor());
				
				int rsInt = pstmt.executeUpdate();
				// 실행 리턴값이 1이상이면 레코드가 반영됐다는 뜻
				// 반영됐으면 저장(commit), 아니라면 취소(rollback)
				if (rsInt > 0) {
					conn.commit();		// 트랜잭션 저장
				} else {
					conn.rollback();	// 트랜잭션 취소
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (conn != null) {
					try {
						conn.close();
						System.out.println("커넥션 자원 반납 성공");
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("커넥션 자원 반납 실패");
					}
				}
			}
		} else {
			System.out.println("커넥션 연결 실패");
		}
	}
	// 아이디어 수정 기능 수행
	// IdeaDAO 클래스의 update메서드 호출 시 수정할 IdeaDTO의 정보와 번호(modNo)를 넘겨줘야한다.
	public void update(IdeaDTO idto, int modNo) {
		if (conn()) {
			try {
				String sql = "UPDATE idea SET title=?, content=? WHERE no=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, idto.getTitle());
				pstmt.setString(2, idto.getContent());
				pstmt.setInt(3, modNo);
				
				int rsInt = pstmt.executeUpdate();
				// 실행 리턴값이 1이상이면 레코드가 반영됐다는 뜻
				// 반영됐으면 저장(commit), 아니라면 취소(rollback)
				if (rsInt > 0) {
					conn.commit();		// 트랜잭션 저장
				} else {
					conn.rollback();	// 트랜잭션 취소
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (conn != null) {
					try {
						conn.close();
						System.out.println("커넥션 자원 반납 성공");
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("커넥션 자원 반납 실패");
					}
				}
			}
		} else {
			System.out.println("커넥션 연결 실패");
		}
	}
	// 아이디어 삭제 기능 수행
	// IdeaDAO 클래스의 delete메서드 호출 시 삭제할 번호(delNo)를 넘겨줘야한다.
	public void delete(int delNo) {
		if (conn()) {
			try {
				String sql = "DELETE FROM idea WHERE no=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, delNo);
				
				int rsInt = pstmt.executeUpdate();
				// 실행 리턴값이 1이상이면 레코드가 반영됐다는 뜻
				// 반영됐으면 저장(commit), 아니라면 취소(rollback)
				if (rsInt > 0) {
					conn.commit();		// 트랜잭션 저장
				} else {
					conn.rollback();	// 트랜잭션 취소
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (conn != null) {
					try {
						conn.close();
						System.out.println("커넥션 자원 반납 성공");
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("커넥션 자원 반납 실패");
					}
				}
			}
		} else {
			System.out.println("커넥션 연결 실패");
		}
	}
	// 아이디어 전체보기 기능 수행
	// IdeaDAO 클래스의 selectAll메서드 호출 시 리스트(ArrayList)를 넘겨준다.
	public ArrayList<IdeaDTO> selectAll() {
		ArrayList<IdeaDTO> iList = new ArrayList<IdeaDTO>();
		if (conn()) {
			try {
				String sql = "SELECT * FROM idea";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					IdeaDTO idea = new IdeaDTO();
					idea.setNo(rs.getInt(1));					// 번호
					idea.setTitle(rs.getString("title"));		// 제목
					idea.setContent(rs.getString("content"));	// 내용
					idea.setAuthor(rs.getString("author"));		// 작성자
					iList.add(idea);
				}
				return iList;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (conn != null) {
					try {
						conn.close();
						System.out.println("커넥션 자원 반납 성공");
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("커넥션 자원 반납 실패");
					}
				}
			}
		} else {
			System.out.println("커넥션 연결 실패");
		}
		return iList;
	}
	// 특정 아이디어 검색하기 기능 수행
	// IdeaDAO 클래스의 selectFindList메서드 호출 시 리스트(ArrayList)를 넘겨준다.
	public ArrayList<IdeaDTO> selectFindList(String find) {
		ArrayList<IdeaDTO> iList = new ArrayList<IdeaDTO>();
		if (conn()) {
			try {
				String sql = "SELECT * FROM idea WHERE "
						+ "INSTR(title, ?) > 0 OR INSTR(content, ?) > 0";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, find);
				pstmt.setString(2, find);
				
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					IdeaDTO idea = new IdeaDTO();
					idea.setNo(rs.getInt(1));					// 번호
					idea.setTitle(rs.getString("title"));		// 제목
					idea.setContent(rs.getString("content"));	// 내용
					idea.setAuthor(rs.getString("author"));		// 작성자
					iList.add(idea);
				}
				return iList;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (conn != null) {
					try {
						conn.close();
						System.out.println("Connection Resources Return Success");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			System.out.println("커넥션 연결 실패");
		}
		return iList;
	}
	// 수정/삭제 시 특정 아이디어를 검색하는 메서드
	// IdeaDAO 클래스의 selectOne메서드 호출 시 특정 IdeaDTO의 정보를 넘겨준다.
	public IdeaDTO selectOne(int findNo) {
		if (conn()) {
			try {
				String sql = "SELECT * FROM idea WHERE no=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, findNo);
				
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					IdeaDTO idea = new IdeaDTO();
					idea.setNo(rs.getInt(1));					// 번호
					idea.setTitle(rs.getString("title"));		// 제목
					idea.setContent(rs.getString("content"));	// 내용
					idea.setAuthor(rs.getString("author"));		// 작성자
					return idea;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (conn != null) {
					try {
						conn.close();
						System.out.println("Connection Resources Return Success");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			System.out.println("커넥션 연결 실패");
		}
		return null;
	}
}
