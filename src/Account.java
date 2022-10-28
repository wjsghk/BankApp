//계좌번호 ,계좌주명, 입금액, 이자률 ,출금가능액(이자)를 나타내라 

public class Account {
	String ano;//계좌번호 
	String owner;//이름
	int balance;//초기금액
	double rate;//이자율
	int amount;//출금가능액(이자)
	
	public Account(String ano, String owner, int balance,double rate) {//Source 클릭 -> 제너럴 컨스털터 using filed->gernate 클릭하면 생성됨
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.rate =rate;
		
	}
	
	String getAno() {//get,set를 구분 해서 생성하는 부분은 아직 안배운 부분이라 나중에 배울예정
		return ano;//참조형 생성자에는 리턴을 쓰고  void형의 생성자는 리턴을 안쓴다.
	}
	
	void setAno(String ano) {
		this.ano=ano;
	}
	
	String getOwner() {
		return owner;
	}
	
	void setOwner(String owner) {
		this.owner=owner;
	}
	
	int getBalance() {
		return balance;
    }
	
	void setBalance(int balance) {
		this.balance = balance;
	}
	
	double getRate() {
		return rate;
	}
	
	void setRate(double rate) {
		this.rate = rate;
	}
	
	int getAmount() {
		return amount;
    }
	
	void setAmount(int amount) {
		this.amount = amount;
	}
	void rateCal() {
		this.amount = balance + (int)(balance * getRate()/100);
	}
	
}
