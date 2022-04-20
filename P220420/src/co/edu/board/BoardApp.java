package co.edu.board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp implements BoardService{

	//Board클래스의 인스턴스를 담겠다(배열로 들어옴)
	ArrayList<Board> boards = new ArrayList<Board>();
	
	//추가
	@Override
	public void addBoard(Board board) {
		boards.add(board);
	}

	//수정
	@Override
	public void modBoard(int boardNo) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < boards.size(); i++) {
			if(boards.get(i).getBoardNo() == boardNo) {
				System.out.println("변경할 제목을 입력하세요");
				String cgTitle = sc.nextLine();
				System.out.println("변경할 내용을 입력하세요");
				String cgContent = sc.nextLine();
				
				boards.get(i).setTitle(cgTitle);
				boards.get(i).setTitle(cgContent);
				
			}
		}
	}

	//삭제
	@Override
	public void remBoard(int boardNo) {
		for (int i = 0; i < boards.size(); i++) {
			if(boards.get(i).getBoardNo() == boardNo) {	
				boards.remove(i);
				System.out.println("삭제완료");
			}
		}
	}

	//상세조회
	@Override
	public void deBoard(String writer) {
		for (int i = 0; i < boards.size(); i++) {
			if(boards.get(i).getWriter().equals(writer)) {
				System.out.println(boards.get(i).toString());
			}
		}
	}

	//목록
	@Override
	public void listBoard(Board board) {
		for (int i = 0; i < boards.size(); i++) {
			System.out.println(boards.get(i).toString());
		}
	}

}
