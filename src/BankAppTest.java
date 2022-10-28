import java.util.Scanner;

public class BankAppTest {

	public static void main(String[] args) {
		
		BankApp ba = new BankApp();
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------");// 깔끔하게 보이려고 데코용 으로 만든거
		System.out.println("-         은행 업무 관리 시스템                   -");
		System.out.println("---------------------------------");
		
		while(true) {
		ba.info();//호출을 한거   
		int choice =sc.nextInt();
		if(choice ==1) {
			ba.createAccount();
		}else if(choice == 2) {
			ba.accountList();
		}else if(choice == 3) {
			ba.deposit();
		}else if(choice == 5) {
			break;
		}else if(choice == 4) {
			ba.withdraw(); 
		}
	}
	System.out.println("업무를 종료 합니다.");
		
		
		
		
		
		
		
		
	}

}
