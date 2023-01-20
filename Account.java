package example1;

public class Account {
	private int accno;
	private int amt;

	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public void deposit(int depositAmt) {
		this.amt+=depositAmt;
	}
	public void checkBalance(){
		System.out.println("Your account balance is:"+amt);
	}
	public void withdraw(int withdrawlAmt) {
		this.amt-=withdrawlAmt;
	}

	}

	

	


