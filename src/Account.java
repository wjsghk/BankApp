//���¹�ȣ ,�����ָ�, �Աݾ�, ���ڷ� ,��ݰ��ɾ�(����)�� ��Ÿ���� 

public class Account {
	String ano;//���¹�ȣ 
	String owner;//�̸�
	int balance;//�ʱ�ݾ�
	double rate;//������
	int amount;//��ݰ��ɾ�(����)
	
	public Account(String ano, String owner, int balance,double rate) {//Source Ŭ�� -> ���ʷ� �������� using filed->gernate Ŭ���ϸ� ������
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.rate =rate;
		
	}
	
	String getAno() {//get,set�� ���� �ؼ� �����ϴ� �κ��� ���� �ȹ�� �κ��̶� ���߿� ��￹��
		return ano;//������ �����ڿ��� ������ ����  void���� �����ڴ� ������ �Ⱦ���.
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
