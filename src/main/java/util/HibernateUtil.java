package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import model.User;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			try {
				Configuration conf = new Configuration().configure().addAnnotatedClass(User.class);
				ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
				sessionFactory = conf.buildSessionFactory(registry);
				Session session = sessionFactory.openSession();
				return sessionFactory;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}

}
