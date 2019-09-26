import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml")
				.build();
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();
		List<Purchase> courses = session.createQuery("From " + Purchase.class.getSimpleName()).getResultList();
		courses.forEach(c -> {
			List<Student> students = session.createQuery("from " + Student.class.getSimpleName() + " Where name='" + c.getStudentName() +"'" ).getResultList();
			students.forEach(s -> System.out.println(s.getId()));
		});

		sessionFactory.close();
	}
}
