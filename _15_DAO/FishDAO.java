package _15_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import _15_DTO.FishDTO;

// fishdata 테이블 CRUD
public class FishDAO {
	private String userName = "system";		// 아이디
	private String password = "11111111";	// 비밀번호
	// jdbc : JDBC 라이브러리
	// oracle : 오라클 연결
	// thin : 자바 연결
	// @localhost : 컴퓨터 내부 아이피
	// 1521 : 포트번호
	// orcl : DB이름
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String driverName = "oracle.jdbc.driver.OracleDriver";	// 드라이버 이름
	private Connection conn = null;		// 커넥션 자원 변수
	
	public FishDAO() {
		init();
	}
	
	// 드라이버 로드
	private void init() {
		try {
			Class.forName(driverName);
			// System.out.println("오라클 드라이버 로드 성공");
			System.out.println("Oracle Driver Load Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 커넥션을 가져오는 공통 코드를 메서드로 정의
	private boolean conn() {
		try {
			conn = DriverManager.getConnection(url, userName, password);
			// System.out.println("커넥션 자원 획득 성공");
			System.out.println("Connection Resources Load Success");
			return true;	// 커넥션 자원을 정상적으로 획득한 경우 true
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;		// 커넥션 자원을 획득하지 못할 경우 false
	}
	// 등록
	public void add(FishDTO fdto) {
		if (conn()) {
			try {
				String sql = "INSERT INTO fishdata VALUES (?,?,DEFAULT)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, fdto.getId());
				pstmt.setString(2, fdto.getPwd());
				// 쿼리문 실행
				// pstmt.executeUpdate();
				// 쿼리문 실행 후 리턴값을 가져와서 다음 처리 작업 정의
				int resultInt = pstmt.executeUpdate();
				// 트랜잭션 처리 commit(저장) rollback(취소)
				if (resultInt > 0) {
					conn.commit();
				} else {
					conn.rollback();
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
						e.printStackTrace();
					}
				}
			}
		} else {
			System.out.println("Database Connection Fail");
		}
	}
	// 삭제
	public void delete(String delId) {
		if (conn()) {
			try {
				String sql = "DELETE FROM fishdata WHERE id=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, delId);
				pstmt.executeUpdate();
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
			System.out.println("Database Connection Fail");
		}
	}
	// 검색
	public FishDTO selectOne(String findId) {
		if (conn()) {
			try {
				String sql = "SELECT * FROM fishdata WHERE id=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, findId);
				ResultSet rs = pstmt.executeQuery();
				// 쿼리 결과가 튜플 하나일 경우에도 이렇게 사용해도 된다. (while문)
				while (rs.next()) {
					FishDTO fishTemp = new FishDTO();
					fishTemp.setId(rs.getString("id"));
					fishTemp.setPwd(rs.getString("pwd"));
					fishTemp.setIndate(rs.getString("indate"));
					return fishTemp;
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
		}
		return null;
	}
	// 전체보기
	public ArrayList<FishDTO> selectAll() {
		ArrayList<FishDTO> fList = new ArrayList<FishDTO>();
		if (conn()) {
			try {
				String sql = "SELECT * FROM fishdata";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				// ResultSet : 테이블 형식으로 데이터를 가져온다.
				ResultSet rs = pstmt.executeQuery();
				// next()메서드는 rs에서 참조하는 테이블 내 튜플을 순차적으로 하나씩 접근하는 메서드이다.
				while (rs.next()) {
					FishDTO fishTemp = new FishDTO();
					// rs가 접근한 튜플에서 id,pwd,indate 컬럼의 값을 가져온다.
					fishTemp.setId(rs.getString("id"));
					fishTemp.setPwd(rs.getString("pwd"));
					fishTemp.setIndate(rs.getString("indate"));
					fList.add(fishTemp);
				}
				return fList;
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
			System.out.println("Database Connection Fail");
		}
		return fList;
	}
	// 수정
	public void update(FishDTO fdto) {
		if (conn()) {
			try {
				String sql = "UPDATE fishdata SET pwd=? WHERE id=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, fdto.getPwd());
				pstmt.setString(2, fdto.getId());
				pstmt.executeUpdate();
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
			System.out.println("Database Connection Fail");
		}
	}
}
