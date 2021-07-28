package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customerdetails")
public class CustomerEntity {
	
	
	@Column(name="uuid")
	private String UUID;
	
	@Id
	@Column(name="msisdn")
	private int MSISDN;
	
	@ManyToOne
	@JoinColumn(name="accountid")
	private AccountEntity AccountID;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private UserEntity UserID;

	
	

	public String getUUID() {
		return UUID;
	}




	public void setUUID(String uUID) {
		this.UUID = uUID;
	}




	public int getMSISDN() {
		return MSISDN;
	}




	public void setMSISDN(int mSISDN) {
		this.MSISDN = mSISDN;
	}




	public AccountEntity getAccountID() {
		return AccountID;
	}




	public void setAccountID(AccountEntity accountID) {
		this.AccountID = accountID;
	}




	public UserEntity getUserID() {
		return UserID;
	}




	public void setUserID(UserEntity userID) {
		this.UserID = userID;
	}




	public CustomerEntity(String uUID, int mSISDN, AccountEntity accountID, UserEntity userID) {
		super();
		this.UUID = uUID;
		this.MSISDN = mSISDN;
		this.AccountID = accountID;
		this.UserID = userID;
	}




	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "CustomerEntity [UUID=" + UUID + ", MSISDN=" + MSISDN + ", AccountID=" + AccountID + ", UserID=" + UserID
				+ "]";
	}

	

}
