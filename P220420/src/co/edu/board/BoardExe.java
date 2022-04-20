package co.edu.board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardExe {

	public static void main(String[] args) {
		
		//BoardService인터페이스 BoardApp인스턴스 생성?
		BoardService boards = new BoardApp();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.글등록 2.글수정 3.글삭제 4.글조회(작성자기준) 5.전체목록 6.종료");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == boards.ADD) {
				System.out.println("게시글 번호를 입력하세요.");
				int boardNo = sc.nextInt();
				sc.nextLine();
				System.out.println("게시글 제목을 입력하세요.");
				String title = sc.nextLine();
				System.out.println("내용을 입력하세요.");
				String content = sc.nextLine();
				System.out.println("작성자를 입력하세요.");
				String writer = sc.nextLine();
				System.out.println("작성일자를 입력하세요.");
				String day = sc.nextLine();
				
				//위에서 입력받은 값들을 board변수에 대입 & Board클래스 생성자 호출하여 필드에 값 대입 
				Board board = new Board(boardNo, title, content, writer, day);
				
				//메소드 호출하여 board값을 매개로 전달
				boards.addBoard(board);
				
			} else if(menu == boards.MOD) {
				System.out.println("글번호를 입력하세요.");
				int boardNo = sc.nextInt();
				sc.nextLine();
				
				boards.modBoard(boardNo);
				
			} else if(menu == boards.DEL) {
				System.out.println("삭제할 게시글 번호를 입력하세요.");
				int boardNo = sc.nextInt();
				sc.nextLine();
				
				boards.remBoard(boardNo);
				
			} else if(menu == boards.D_BOARD) {
				System.out.println("조회할 작성자 이름을 입력하세요.");
				String writer = sc.nextLine();
				
				boards.deBoard(writer);
				
			} else if(menu == boards.ALL_LIST) {
				boards.listBoard(null);
				
			} else {
				break;
			}
		}
		System.out.println("종료합니다.");
	}

}
