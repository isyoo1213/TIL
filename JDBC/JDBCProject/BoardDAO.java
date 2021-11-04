package com.fastcampus.biz.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fastcampus.biz.common.JDBCUtil;

//DAO(Data Access Object 클래스) : 실질적인 DB 연동을 담당하는 클래스
public class BoardDAO {
	
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	//board관련 sql 명령어들

	private final String BOARD_INSERT= "insert into board(seq, title, writer, content) values ((select nvl(max(seq), 0) + 1 from board), ?, ?, ?)";
	private final String BOARD_UPDATE= "update board set title = ?, content = ? where seq = ?";
	private final String BOARD_DELETE= "delete board where seq = ?";
	private final String BOARD_GET= "select * from board where seq = ?";
	private final String BOARD_LIST= "select * from board order by seq desc";
	
	//board관련 crud 메서드 구현
	
	public void insertBoard(BoardVO vo) {
			
			try {

				conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
				stmt = conn.prepareStatement(BOARD_INSERT);
				stmt.setString(1, vo.getTitle());
				stmt.setString(2, vo.getWriter());
				stmt.setString(3, vo.getContent());
				int count = stmt.executeUpdate();//prepared사용할때 아규먼트로 sql 안넣어줌
				System.out.println(count+"건의 데이터 처리 성공!!");
				
			} catch(SQLException e){
				e.printStackTrace();			
			} finally {
				JDBCUtil.close(stmt, conn);
			}
	
	}
	
	public void updateBoard(BoardVO vo) {
		
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_UPDATE);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getContent());
			stmt.setInt(3,vo.getSeq());
			int count = stmt.executeUpdate();
			System.out.println(count+"건의 데이터 처리 성공!!");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
		
	}
	
	public void deleteBoard(BoardVO vo) {
		
		try {
			conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			stmt = conn.prepareStatement(BOARD_DELETE);
			stmt.setInt(1, vo.getSeq());
			int count = stmt.executeUpdate();//prepared사용할때 아규먼트로 sql 안넣어줌
			System.out.println(count+"건의 데이터 처리 성공!!");
			
		} catch(SQLException e){
			e.printStackTrace();			
		} finally {
			JDBCUtil.close(stmt, conn);
		}
		
	}
	
	public void getBoard(BoardVO vo) {
		
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_GET);
			stmt.setInt(1,vo.getSeq());
			rs = stmt.executeQuery();
			if(rs.next()) {
				System.out.print(rs.getInt("SEQ")+" : ");
				System.out.print(rs.getString("TITLE")+" : ");
				System.out.print(rs.getString("WRITER")+" : ");
				System.out.print(rs.getString("CONTENT")+" : ");
				System.out.print(rs.getString("REGDATE")+" : ");
				System.out.println(rs.getInt("CNT")+" : ");
			} else {
				System.out.println(vo.getSeq()+"번 게시글은 존재하지 않습니다.");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			//resultset도 close해줘야함
			JDBCUtil.close(rs, stmt, conn);
		}
		
	}
	
	//클라이언트가 이 메서드를 호출했을 때, 검색결과를 이 메서드에서 명시하지 말고, 그냥 넘겨버리자.
	public List<BoardVO> getBoardList(BoardVO vo) {
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_LIST);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board = new BoardVO();
			
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
				boardList.add(board);
			}
		
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return boardList;
		
	}
}

