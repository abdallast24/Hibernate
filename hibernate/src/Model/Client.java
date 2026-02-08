package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "client_table")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
	@SequenceGenerator(name = "client_seq", initialValue = 1, sequenceName = "CLIENT_SEQ", allocationSize = 1)
	@Column(name = "client_id")
	private int id;

	@Column(name = "client_name")
	private String fullName;

	@Column(name = "client_age")
	private int age;

	@Column(name = "client_address")
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
