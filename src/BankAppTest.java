import java.util.Scanner;

public class BankAppTest {

	public static void main(String[] args) {
		
		BankApp ba = new BankApp();
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------");// ����ϰ� ���̷��� ���ڿ� ���� �����
		System.out.println("-         ���� ���� ���� �ý���                   -");
		System.out.println("---------------------------------");
		
		while(true) {
		ba.info();//ȣ���� �Ѱ�   
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
	System.out.println("������ ���� �մϴ�.");
		
		
		
		
		
		
		
		
	}

}
