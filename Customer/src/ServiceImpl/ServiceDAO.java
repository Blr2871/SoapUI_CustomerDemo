package ServiceImpl;

import entity.AccountEntity;
import entity.CustomerEntity;
import entity.UserEntity;

public interface ServiceDAO {
	
	public  AccountEntity getAccount(int accountID);
	
	public UserEntity getUser(int UserID);
	
	public CustomerEntity getCustomerByMSISDN(int MSISDN);
	
	public CustomerEntity getCustomerByAccount(int accountID);
	
	public CustomerEntity getCustomerByUser(int userID);

}
