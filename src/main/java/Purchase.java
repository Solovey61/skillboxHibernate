import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PurchaseList")
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "course_name")
	private String courseName;

	@Column(name = "price")
	private int price;

	@Column(name = "subscription_date")
	private Date subscriptionDate;

}

//  SELECT Students.id student_id,
//		student_name student,
//		Courses.id course_id,
//		course_name course,
//		registration_date
//  FROM PurchaseList
//  JOIN Students ON student_name = Students.name
//  JOIN Courses ON course_name = Courses.name;
