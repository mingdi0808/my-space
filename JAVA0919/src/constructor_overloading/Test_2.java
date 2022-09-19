package constructor_overloading;

public class Test_2 {

	public static void main(String[] args) {
		
		// 기본 생성자 호출
		Account acc = new Account();
		acc.showAccountInfo();

	}

}

class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	// 기본 생성자(111-1111-111, 홍길동, 0)
	public Account() {
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
	}

	// 계좌번호를 파라미터로 전달받고, 홍길동, 현재잔고는 0으로 초기화하는 생성자
	public Account(String accountNo) {
		this.accountNo = accountNo;
		ownerName = "홍길동";
		balance = 0;
	}

	// 계좌번호, 예금주명을 파라미터로 전달받고, 현재잔고는 0으로 초기화하는 생성자
	public Account(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		balance = 0;
	}

	// 계좌번호, 예금주명, 현재잔고를 파라미터로 전달받는 생성자
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
		
	// showAccountInfo() 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
	
}










