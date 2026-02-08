package Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "department_table")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_seq")
	@SequenceGenerator(name = "department_seq", initialValue = 1, sequenceName = "DEPARTMENT_SEQ", allocationSize = 1)
	@Column(name = "department_id")
	private int id;

	@Column(name = "department_name")
	private String name;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "manager_id")
	private Manager manager;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department" , fetch = FetchType.LAZY)
	private List<Student> list;

	public Department() {
		list = new ArrayList<>();
	}

	public void addStudent(Student student) {
		list.add(student);
		student.setDepartment(this);
	}

	public Manager getManager() {
		return manager;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
