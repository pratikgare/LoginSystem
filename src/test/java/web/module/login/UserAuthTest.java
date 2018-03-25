package web.module.login;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserAuthTest {
	public static void main(String[] args) {
		UserAuth user = new UserAuth();
		user.setId(2);
		user.setPassword("pass_shef");
		user.setSalt("salt1234");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
	}
}
