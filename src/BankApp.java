import java.util.Scanner;

public class BankApp {
	Account[]acc = new Account[100];// 수많은 사람들이 이용하니까 하나하나 코딩을 할 수 없기 때문에 배열을 이용한다!!ex)100명 1000명 등등
	Scanner sc = new Scanner(System.in);
	
	//정보 출력하는기능
	void info() {
		System.out.println("---------------------------------");//데코레이션 용도로 하는거
		System.out.println("1.계좌생성   2.계좌목록  3.예금  4.출금  5.종료");
		System.out.println("---------------------------------");
		System.out.println("선택 : ");
		
	}
	//계좌생성 하는 기능
	void createAccount() {
		System.out.println("---------");
		System.out.println("계좌 생성 메뉴");
		System.out.println("---------");		
		System.out.println("계좌번호 : ");
		String ano = sc.next();//계좌 변환 
		
		if(findAccount(ano) !=null) {
			System.out.println("이미 계좌가 존재합니다.");
			return;}
		
		System.out.println("계좌주명 : ");
		String owner = sc.next();
		
		System.out.println("초기입금액 : ");
		int balance = sc.nextInt();
		
		System.out.println("이자를 입력 : ");
		double rate = sc.nextDouble();
		
		
		Account account = new Account(ano,owner,balance,rate);//계좌를 생성하는 용도로 사용
		//
		account.rateCal();//출금가능액(이자)구하는 기능 
		
		for(int i=0;i<acc.length;i++) {//배열의 반복문
			if(acc[i] ==null) {//acc[0] = account;//위에 배열의 첫번째 고객을 나타낸거	
				acc[i] = account;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
			
	}
	//계좌목록보기가능
	void accountList() {
		System.out.println("------------");
		System.out.println("계좌 목록 보기 메뉴");
		System.out.println("------------");
		
		System.out.println("계좌번호     계좌주          입금액  이자율   출금가능액(이자)");
		
		for(int i=0;i<acc.length;i++) {
			if(acc[i]==null){
				break;
			}
		
		System.out.println(acc[i].getAno()+"\t"+acc[i].getOwner()+"\t"+acc[i].getBalance()+" " + acc[i].getRate() + "% "
		+ acc[i].getAmount());
	}
}
		//예금기능
		void deposit() {
			System.out.println("------------");
			System.out.println("  예금 기능 메뉴   ");
			System.out.println("------------");
		    
			System.out.println("계좌번호 : ");
			String ano = sc.next();
			
			System.out.println("예금액  : ");
			int balance =sc.nextInt();
		
			//완성하기	
			Account account = findAccount(ano);	//찾아서 누적 해야돼서 객체 생성
		if(account == null) {
			System.out.println("계좌번호가 존재하지않습니다.");
		    return;// 반복문에 'break;'와 같은 기능 으로 조건문에는 '리턴'을 쓴다	
	   }
		account.setBalance(account.getBalance() + balance);//예금 누적 되는 코드
	    System.out.println("예금 처리가 정상적으로 되었습니다.");
	}
 
		//출금기능
		void withdraw() {
			System.out.println("------------");
		    System.out.println("  출금 기능 메뉴   ");
		    System.out.println("------------");
			
		    System.out.println("계좌번호 : ");
		    String ano =sc.next();
		    
		    System.out.println("출금액 : ");
		    int balance = sc.nextInt();
		    //완성하기
		    Account account = findAccount(ano);
		    if(account == null) {
		    	System.out.println("계좌번호가 존재하지않습니다.");
		    	return;
		    }
		    if(account.getBalance()<balance) {
		    	System.out.println("예금액이 부족합니다.");//출금 할 돈이 없을때
		    	return;
		    }
		    account.setBalance(account.getBalance() - balance);//출금 할 때
		    System.out.println("출금 처리가 정상적으로 되었습니다.");
		}
		
		
		
		
		Account findAccount(String ano){//계좌번호 생성하기 변수
			
			Account account = null;
			
			for(int i=0;i<acc.length;i++) {
				if(acc[i] !=null) {
					if(acc[i].ano.equals(ano)) {//문자열을 비교할때는'equals'를 쓴다  문자일때는 '=='
				   account = acc[i];
				   break;
				}
				
				}
			}
			return account;
			
		}
	}
