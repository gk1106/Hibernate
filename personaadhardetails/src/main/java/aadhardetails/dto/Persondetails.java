package aadhardetails.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Persondetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long  phno;
	private String email;
	@OneToOne
	private Aadhardetails aadhar;
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Aadhardetails getAadhar() {
		return aadhar;
	}
	public void setAadhar(Aadhardetails aadhar) {
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "Persondetails [id=" + id + ", name=" + name + ", phno=" + phno + ", email=" + email + ", aadhar="
				+ aadhar + "]";
	}
	
	
	
	

}
