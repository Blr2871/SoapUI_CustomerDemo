package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserEntity {
	
	@Id
	@Column(name="userid")
	private int UserID;
	
	@Column(name="firstname")
	private String FirstName;
	
	@Column(name="lastname")
	private String LastName;
	
	@Column(name="address")
	private String Address;
	
	@Column(name="language")
	private String Language;

	

	

	public int getUserID() {
		return UserID;
	}





	public void setUserID(int userID) {
		this.UserID = userID;
	}





	public String getFirstName() {
		return FirstName;
	}





	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}





	public String getLastName() {
		return LastName;
	}





	public void setLastName(String lastName) {
		this.LastName = lastName;
	}





	public String getAddress() {
		return Address;
	}





	public void setAddress(String address) {
		this.Address = address;
	}





	public String getLanguage() {
		return Language;
	}





	public void setLanguage(String language) {
		this.Language = language;
	}





	public UserEntity(int userID, String firstName, String lastName, String address, String language) {
		super();
		this.UserID = userID;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Address = address;
		this.Language = language;
	}
	
	





	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}





	@Override
	public String toString() {
		return "UserEntity [UserID=" + UserID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Address="
				+ Address + ", Language=" + Language + "]";
	}

	
	
	

}
