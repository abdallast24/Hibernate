package Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "manager_table")
public class Manager {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "manager_seq")
	@SequenceGenerator(name = "manager_seq", initialValue = 1, sequenceName = "MANAGER_SEQ", allocationSize = 1)
	@Column(name = "manager_id")
	private int id;

	private String name;

	@OneToOne(mappedBy = "manager" , cascade = {CascadeType.PERSIST , CascadeType.REMOVE})
	private Department department;

	public int getId() {
		return id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
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
