import java.util.Scanner;

public class BankApp {
	Account[]acc = new Account[100];// ������ ������� �̿��ϴϱ� �ϳ��ϳ� �ڵ��� �� �� ���� ������ �迭�� �̿��Ѵ�!!ex)100�� 1000�� ���
	Scanner sc = new Scanner(System.in);
	
	//���� ����ϴ±��
	void info() {
		System.out.println("---------------------------------");//���ڷ��̼� �뵵�� �ϴ°�
		System.out.println("1.���»���   2.���¸��  3.����  4.���  5.����");
		System.out.println("---------------------------------");
		System.out.println("���� : ");
		
	}
	//���»��� �ϴ� ���
	void createAccount() {
		System.out.println("---------");
		System.out.println("���� ���� �޴�");
		System.out.println("---------");		
		System.out.println("���¹�ȣ : ");
		String ano = sc.next();//���� ��ȯ 
		
		if(findAccount(ano) !=null) {
			System.out.println("�̹� ���°� �����մϴ�.");
			return;}
		
		System.out.println("�����ָ� : ");
		String owner = sc.next();
		
		System.out.println("�ʱ��Աݾ� : ");
		int balance = sc.nextInt();
		
		System.out.println("���ڸ� �Է� : ");
		double rate = sc.nextDouble();
		
		
		Account account = new Account(ano,owner,balance,rate);//���¸� �����ϴ� �뵵�� ���
		//
		account.rateCal();//��ݰ��ɾ�(����)���ϴ� ��� 
		
		for(int i=0;i<acc.length;i++) {//�迭�� �ݺ���
			if(acc[i] ==null) {//acc[0] = account;//���� �迭�� ù��° ���� ��Ÿ����	
				acc[i] = account;
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}
		}
			
	}
	//���¸�Ϻ��Ⱑ��
	void accountList() {
		System.out.println("------------");
		System.out.println("���� ��� ���� �޴�");
		System.out.println("------------");
		
		System.out.println("���¹�ȣ     ������          �Աݾ�  ������   ��ݰ��ɾ�(����)");
		
		for(int i=0;i<acc.length;i++) {
			if(acc[i]==null){
				break;
			}
		
		System.out.println(acc[i].getAno()+"\t"+acc[i].getOwner()+"\t"+acc[i].getBalance()+" " + acc[i].getRate() + "% "
		+ acc[i].getAmount());
	}
}
		//���ݱ��
		void deposit() {
			System.out.println("------------");
			System.out.println("  ���� ��� �޴�   ");
			System.out.println("------------");
		    
			System.out.println("���¹�ȣ : ");
			String ano = sc.next();
			
			System.out.println("���ݾ�  : ");
			int balance =sc.nextInt();
		
			//�ϼ��ϱ�	
			Account account = findAccount(ano);	//ã�Ƽ� ���� �ؾߵż� ��ü ����
		if(account == null) {
			System.out.println("���¹�ȣ�� ���������ʽ��ϴ�.");
		    return;// �ݺ����� 'break;'�� ���� ��� ���� ���ǹ����� '����'�� ����	
	   }
		account.setBalance(account.getBalance() + balance);//���� ���� �Ǵ� �ڵ�
	    System.out.println("���� ó���� ���������� �Ǿ����ϴ�.");
	}
 
		//��ݱ��
		void withdraw() {
			System.out.println("------------");
		    System.out.println("  ��� ��� �޴�   ");
		    System.out.println("------------");
			
		    System.out.println("���¹�ȣ : ");
		    String ano =sc.next();
		    
		    System.out.println("��ݾ� : ");
		    int balance = sc.nextInt();
		    //�ϼ��ϱ�
		    Account account = findAccount(ano);
		    if(account == null) {
		    	System.out.println("���¹�ȣ�� ���������ʽ��ϴ�.");
		    	return;
		    }
		    if(account.getBalance()<balance) {
		    	System.out.println("���ݾ��� �����մϴ�.");//��� �� ���� ������
		    	return;
		    }
		    account.setBalance(account.getBalance() - balance);//��� �� ��
		    System.out.println("��� ó���� ���������� �Ǿ����ϴ�.");
		}
		
		
		
		
		Account findAccount(String ano){//���¹�ȣ �����ϱ� ����
			
			Account account = null;
			
			for(int i=0;i<acc.length;i++) {
				if(acc[i] !=null) {
					if(acc[i].ano.equals(ano)) {//���ڿ��� ���Ҷ���'equals'�� ����  �����϶��� '=='
				   account = acc[i];
				   break;
				}
				
				}
			}
			return account;
			
		}
	}
