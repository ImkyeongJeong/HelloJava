package co.edu;

import java.util.Iterator;

public class BoardList {
	
	// Board클래스 접근위한 변수
	private Board[] boards; 
	
	// 배열크기 초기화
	public void init(int size) {
		boards = new Board[size];
	}
	
	// 배열에 입력(매개값 받으면 Board[]에 추가)
	public int addBoard(Board board) {
		// 저장할 공간이 없을 때 false 
//		boolean check = false;
		int errorCase = -1; // 저장공간없음
		for (int i = 0; i < boards.length; i++) {
			
			if(boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {
				errorCase = 1; //동일한 값이 있을 경우 에러
				break;
			}
			if(boards[i] == null) {
				boards[i] = board;
				errorCase = 0; // 정상처리
				break;
			}
		}
		return errorCase;
	}
	
	// 수정: 게시글 번호로 찾아와서 내용, 제목 변경
	public boolean modifyBoard(Board board) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			//배열(boards)이 갖고 있는 값 중에서 BoardNo와 매개값으로 들어온 BoardNo랑 같은가
			if(boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				check = true;
				break;
			}
		}
		return check;
	}
	
	// 삭제: 게시글 번호로 찾아와 삭제
	public boolean removeBoard(int bNo) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			if(boards[i].getBoardNo() == bNo) {
				boards[i] = null;
				check = true;
				break;
			}
		}
		return check;
	}
	
	// 한건조회: 게시글 번호로 찾아와 조회
	public Board searchBoard(int bNo) {
		for (int i = 0; i < boards.length; i++) {
			if(boards[i].getBoardNo() == bNo) {
				int currentCnt = boards[i].getSearchCnt();
				boards[i].setSearchCnt(currentCnt + 1);
				return boards[i];		
			}
		}
		return null; //찾는 값 없으면 null 반환
	}
	
	// 작성자 조회
	public Board[] getWriterList(String writer) {
		for (int i = 0; i < boards.length; i++) {
			if(boards[i].getWriter().equals(writer)) {
				boards[i].getInfo();
			}
		}
		return null;
	}
	
	
	// 게시글목록
	public Board[] boardList() {
		return boards;
	}
	

}
