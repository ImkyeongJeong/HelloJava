package co.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardExe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// BoardList클래스에 정의해둔 필드와 메서드를 활용해서 board변수에 기능 추가
		BoardList boardList = new BoardList();
		boardList.init(5); //배열의 크기지정.

		while(true) {
			System.out.println("1.추가 2.수정 3.목록 4.삭제 5.한건조회 6.작성자조회 9.종료");
			System.out.print("선택> ");
			
			int menu = -1;
			//예외처리 try: 잘못된 처리라면, catch: 대신할 코드
			try {
				menu = sc.nextInt(); 
			} catch(InputMismatchException e) { 
				System.out.println("잘못된 처리를 시도했습니다.");
			}
			sc.nextLine();
			
			if(menu == 1) { // 추가
				System.out.println("글번호입력> ");
				int bNo = sc.nextInt();
				sc.nextLine();
				System.out.println("제목입력> ");
				String bTitle = sc.nextLine();
				System.out.println("내용입력> ");
				String bContent = sc.nextLine();
				System.out.println("작성자입력> ");
				String bWriter = sc.nextLine();
		
				// 생성자 호출
				Board newBod = new Board(bNo, bTitle, bContent, bWriter);
				
				int chk = boardList.addBoard(newBod);
				if(chk == 0) {
					System.out.println("입력 성공");
				} else if(chk == -1) {
					System.out.println("저장공간 없음");
				} else if(chk == 1) {
					System.out.println("이미 있는 번호");
				}
				
			} else if(menu == 2) { //수정
				System.out.print("수정할 글번호입력> ");
				int bNo = Integer.parseInt(sc.nextLine());
				System.out.print("변경할 제목입력> ");
				String title = sc.nextLine();
				System.out.println("변경할 내용입력");
				String content = sc.nextLine();
				Board cBoard = new Board(bNo, title, content, null);
				
				if(boardList.modifyBoard(cBoard)) {
					System.out.println("수정 완료");
				} else {
					System.out.println("수정 실패");
				}
				
			} else if(menu == 3) { //조회
				Board[] boards = boardList.boardList();
				System.out.println("게시글번호    제목                내용                작성자  조회수");
				System.out.println("===========================================================");
				//참조형 변수 참조배열
				for(Board board : boards) {
					//객체의 주소가 있다면
					if(board != null) { 
						board.getInfo();
					}
				}
				
			} else if(menu == 4) { //삭제
				System.out.println("삭제할 글번호입력> ");
				int bNo = Integer.parseInt(sc.nextLine());
				
				if(boardList.removeBoard(bNo)) {
					System.out.println("삭제 완료");
				} else {
					System.out.println("삭제 실패");
				}
				
			} else if(menu == 5) { //1건 조회
				System.out.println("조회할 글번호입력> ");
				int bNo = Integer.parseInt(sc.nextLine());
				
				Board getBoard = boardList.searchBoard(bNo);
				if(getBoard == null) {
					System.out.println("조회결과 없음");
				} else {
					getBoard.getDetailInfo();
				}
				
			} else if(menu == 6) {
				//동일한 작성자있으면 작성한 게시물 모두 가져오기
				System.out.println("작성자 입력> ");
				String sWriter = sc.nextLine();

				//sWriter랑 같은 값 return받은 sBoards의 내용이 writerList에 담겨있음
				Board[] writerList = boardList.getWriterList(sWriter);
				
				//writerList 배열 내용을 출력 (어떻게 갖고 오는지 getWriterList에 구현)
				System.out.println("게시글번호    제목                내용                작성자  조회수");
				System.out.println("===========================================================");
				//for(변수 : 배열변수) 향상된 변수
				for(Board board : writerList) { 
					if(board != null) {
						board.getInfo();
					}
				}
				
			} else if(menu == 9) {
				System.out.println("프로그램을 종료합니다.");
			} else {
				System.out.println("정확한 메뉴를 선택하세요.");
			}
			
		}
	}

}
