import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "PurchaseList")
public class Purchase {
    @EmbeddedId
	private PurchaseID id;

	@Column(name = "price")
	private int price;

	@Column(name = "subscription_date")
	private Date subscriptionDate;

	public PurchaseID getId() {
		return id;
	}

	public String getStudentName() {
		return id.getStudentName();
	}

	public String getCourseName() {
		return id.getCourseName();
	}

	public int getPrice() {
		return price;
	}

	public Date getSubscriptionDate() {
		return subscriptionDate;
	}
}

//  SELECT Students.id student_id,
//		student_name student,
//		Courses.id course_id,
//		course_name course,
//		registration_date
//  FROM PurchaseList
//  JOIN Students ON student_name = Students.name
//  JOIN Courses ON course_name = Courses.name;
