import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml")
				.build();
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();
//		Course course1 = session.get(Course.class, 1);
//		course1.getStudents().forEach(student -> System.out.println(student.getRegistrationDate().toString()));
//		Student student = session.get(Student.class, 3);
//		System.out.println(String.format("%-20s|%6d лет", student.getName(), student.getAge()));
//		Purchase purchase = session.get(Purchase.class, 1);
//		System.out.println(String.format("%-20s%8d", purchase.getCourseName(), purchase.getPrice()));
		sessionFactory.close();
	}
}
