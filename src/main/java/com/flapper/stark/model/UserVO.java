package com.flapper.stark.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="End_User")
public class UserVO {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
//	이름
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="E_MAIL")
	private String eMail;
	
	@Column(name="PW")
	private String password;
	
//	getter, setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof UserVO)) {
			return false;
		}
		
		UserVO user = (UserVO) obj;
		if(eMail != null ? !eMail.equals(user.eMail) : user.eMail !=null) {
			return false;
		}else {
			return true;
		}
	}
	
	public int hashCode() {
		return eMail != null ? eMail.hashCode() : 0;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("====UserVO====");
		sb.append("\nname : ");
		sb.append(lastName);
		sb.append(" ");
		sb.append(firstName);
		sb.append("\nE-Mail : ");
		sb.append(eMail);
		sb.append("\nPW : ");
		sb.append(password);
		sb.append(")");
		return sb.toString();
	}
}