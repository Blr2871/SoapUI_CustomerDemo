package ServiceImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entity.AccountEntity;
import entity.CustomerEntity;
import entity.UserEntity;
import util.HibernateUtil;

public class Service implements ServiceDAO {
	
	public static void main(String[]args) {}

	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();

	AccountEntity accountEntity = null;

	UserEntity userEntity = null;

	CustomerEntity customerEntity = null;

	//// Account By ID

	public AccountEntity getAccount(int accountID) {

		accountEntity = session.get(AccountEntity.class, accountID);

		if (accountEntity != null) {
			System.out.println("\nEmployee Record= " + accountEntity.toString());
		}

		t.commit();

		return accountEntity;

	}

	///////// User By ID

	public UserEntity getUser(int UserID) {

		userEntity = session.get(UserEntity.class, UserID);

		if (accountEntity != null) {

			System.out.println("\nUser Record= " + userEntity.toString());
		}

		t.commit();

		return userEntity;

	}

	//// get customer by msisdn

	public CustomerEntity getCustomerByMSISDN(int MSISDN) {

		customerEntity = session.get(CustomerEntity.class, MSISDN);

		if (customerEntity != null) {

			System.out.println("\nUser Record= " + customerEntity.toString());
		}

		t.commit();

		return customerEntity;

	}

	//// get customer by account

	public CustomerEntity getCustomerByAccount(int accountID) {

		customerEntity = session.get(CustomerEntity.class, accountID);

		if (customerEntity != null) {

			System.out.println("\nUser Record= " + customerEntity.toString());
		}

		t.commit();

		return customerEntity;

	}

	//// get customer by user

	public CustomerEntity getCustomerByUser(int userID) {

		customerEntity = session.get(CustomerEntity.class, userID);

		if (customerEntity != null) {

			System.out.println("\nUser Record= " + customerEntity.toString());
		}

		t.commit();

		return customerEntity;

	}

}
