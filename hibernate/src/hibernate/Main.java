package hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import Model.Client;
import Model.Department;
import Model.Manager;
import Model.Student;

public class Main {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Client.class)
				.addAnnotatedClass(Manager.class).addAnnotatedClass(Department.class).addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();
		
		
		
		
		session.getTransaction().commit();
		session.close();

	}
}

//Client client = new Client();
//
//client.setFullName("basma khaled");
//client.setAge(25);
//client.setAddress("egypt");

// session.persist(client);

//List<Client> list = session.createQuery("from Client").list();
//for (Client client : list) {
//	System.out.println(client.getId() + "-->" + client.getFullName());
//}

//session.createQuery("update Client set fullName ='samir' where age = 24").executeUpdate();

//session.createQuery("delete Client where age = 62").executeUpdate();

//Query<Client>q = session.createQuery("from Client");
//q.setFirstResult(0);
//q.setMaxResults(2);
//
//List<Client>list = q.list();
//
//for (Client client : list) {
//System.out.println(client.getId() + "-->" + client.getFullName());
//}

//Query<Client>q = session.createQuery("from Client c where c.fullName = ?1");
//q.setParameter(1,"samiaa nagib");
//List<Client>list = q.list();
//for (Client client : list) {
//	System.out.println(client.getId() + "-->" + client.getFullName());
//}
//

//Query<Client>q = session.createQuery("from Client c where c.fullName =: var1");
//q.setParameter("var1wf","samiaa nagib");
//List<Client>list = q.list();
//for (Client client : list) {
//	System.out.println(client.getId() + "-->" + client.getFullName());
//}

// System.out.println(session.createQuery("select Max(id) from Client").list());
// System.out.println(session.createQuery("select sum(age) from
// Client").list());

//	Criteria c = session.createCriteria(Client.class);

// c.add(Restrictions.gt("id", 10));
// c.add(Restrictions.lt("id", 10));
// c.add(Restrictions.between("id", 2, 4));
// c.add(Restrictions.in("id", new Integer[] { 2, 4 }));
// c.add(Restrictions.isNull("address"));
// c.add(Restrictions.isNotNull("address"));
// c.add(Restrictions.eq("fullName","samir"));
// c.add(Restrictions.like("fullName","samiaa",MatchMode.START));
// c.add(Restrictions.like("fullName","nagib",MatchMode.END));
// c.add(Restrictions.like("fullName","basma",MatchMode.ANYWHERE));

//	Criterion criterionOne = Restrictions.eq("fullName", "samir");

// Criterion criterionTwo = Restrictions.gt("id", 5);
// Criterion criterionThree = Restrictions.lt("id", 2);
// c.add(Restrictions.or(criterionOne,criterionTwo));
// c.add(Restrictions.and(criterionOne, criterionThree));
// c.setProjection(Projections.min("id"));
// c.setProjection(Projections.max("id"));
// c.setProjection(Projections.avg("id"));
// c.setProjection(Projections.count("id"));

//List<Client> list = c.list();
//
//for (Client client : list) {
//	System.out.println(client.getId() + " -> " + client.getFullName());
//}

//	System.out.println(c.list());


//Department department = new Department();
//department.setName("CS");
//Manager mgr = new Manager();
//mgr.setName("Mohamed Abdelbaset");
//
//department.setManager(mgr);
//
//session.save(department);

//Department department = session.get(Department.class, 1);
//
//System.out.println(department.getName() + "-->" + department.getManager().getName());
//
//session.delete(department);
//
//Manager mgr = session.get(Manager.class,1);
//session.delete(mgr);

//Department department = new Department();
//department.setName("CS");
//Manager mgr = new Manager();
//mgr.setName("Mohamed Abdelbaset");
//
//department.setManager(mgr);
//mgr.setDepartment(department);
//
//session.persist(mgr);

//Manager mgr = session.get(Manager.class,3);
//session.delete(mgr);





//Department department = new Department();
//department.setName("CS");
//
//Manager mgr = new Manager();
//mgr.setName("Mohamed Abdelbaset");
//
//mgr.setDepartment(department);
//department.setManager(mgr);
//
//Student s1 = new Student();
//s1.setName("abdalla abdelnaser");
//department.addStudent(s1);
//
//Student s2 = new Student();
//s2.setName("Mohamed Abdelhamid");
//department.addStudent(s2);
//
//session.persist(department);

//Department dept = session.get(Department.class, 1);
//
//for (Student std : dept.getList()) {
//	System.out.println(std.getName());
//}
//
//System.out.println(dept.getName());
//
//System.out.println(dept.getList().size());


//Department dept = session.get(Department.class, 1);
//session.delete(dept);
