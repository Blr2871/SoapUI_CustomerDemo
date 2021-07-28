package entity;
import javax.persistence.Column;
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;


@Entity
@Table(name="accountdetails")
public class AccountEntity {
	@Id
	@Column(name="accountid")
	private int accountid; 
	
	@Column(name="remainingbalance")
	private int remainingbalance;
	
	@Column(name="expirydate")
	private String expirydate;
	
	@Column(name="planid")
	private String planid;

	
	

	
	public AccountEntity(int accountID, int remainingBalance, String expiryDate, String planID) {
		super();
		this.accountid = accountID;
		this.remainingbalance = remainingBalance;
		this.expirydate = expiryDate;
		this.planid = planID;
	}




	public AccountEntity() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "AccountEntity [AccountID=" + accountid + ", RemainingBalance=" + remainingbalance + ", ExpiryDate="
				+ expirydate + ", PlanID=" + planid + "]";
	}




	public int getAccountid() {
		return accountid;
	}




	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}




	public int getRemainingbalance() {
		return remainingbalance;
	}




	public void setRemainingbalance(int remainingbalance) {
		this.remainingbalance = remainingbalance;
	}




	public String getExpirydate() {
		return expirydate;
	}




	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}




	public String getPlanid() {
		return planid;
	}




	public void setPlanid(String planid) {
		this.planid = planid;
	}
	
	
	
	
	
}
	
	