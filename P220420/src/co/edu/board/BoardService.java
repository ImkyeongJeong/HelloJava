package co.edu.board;

public interface BoardService {
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int D_BOARD = 4;
	public int ALL_LIST = 5;
	
	public void addBoard(Board board); 	//추가
	public void modBoard(int boardNo);	//수정
	public void remBoard(int boardNo);	//삭제
	public void deBoard(String writer);	//상세조회
	public void listBoard(Board board); //전체목록
}
