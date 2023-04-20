package hibernateSamples.songHibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Song song1 = new Song();
		song1.setId(1);
		song1.setSongName("Kya kare");
		song1.setArtist("Ashok");

		session.beginTransaction();
		session.save(song1);
		session.getTransaction().commit();

		System.out.println(" Song saved ---check db");
	}
}
