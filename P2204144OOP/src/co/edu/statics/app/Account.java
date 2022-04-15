package co.edu.statics.app;

public class Account {
	// 필드: 문자:계좌번호(고유), 문자:예금주, 정수: 잔액정보
	private String ano;
	private String owner;
	private int balance;
	
	
	// 생성자:	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}


	// Getter, Setter
	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void getInfo() {
		System.out.println("-----------------------------------");
		System.out.println("계좌번호     예금주      잔액");
		System.out.printf("%-10s %-3s %10d \n", this.ano, this.owner, this.balance);
	}


	
}
