package homework8.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Embeddable;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mysql.jdbc.PreparedStatement;



public class HiberateTest {

	SessionFactory sessionFactory = null;
	Transaction transaction = null;
	Session session = null;

	@Before
	public void init() {
		// 1.创建
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		// 2.开启sessioon
		session = sessionFactory.openSession();
		// 3.开启事务
		transaction = session.beginTransaction();
	}

	@After
	public void distory() {
		transaction.commit();
		// 6.关闭Session
		session.close();
		// 7.关闭工厂
		sessionFactory.close();
	}


	@Test
	public void test22() {

	}




}
