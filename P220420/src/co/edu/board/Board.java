package co.edu.board;

//field > 게시글번호 / 제목 / 내용 / 작성자 / 작성일시
//클래스 > Board , BoardApp(등록, 수정,삭제,상세조회, 목록) 구현클래스 < BoardService 인터페이스
//BoardExe(메인) < 컨트롤 역할
//<ArrayList<Board> 컬렉션사용
//1.글등록 2.글수정 3.글삭제 4.글조회(작성자기준)


public class Board {

	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private String date;
	
	
	public Board(int boardNo, String title, String content, String writer, String date) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}


	
	public int getBoardNo() {
		return boardNo;
	}


	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getDate() {
		return date;
	}


	public void setDay(String day) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", date=" + date + "]";
	}
}
