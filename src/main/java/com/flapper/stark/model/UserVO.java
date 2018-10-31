package com.flapper.stark.model;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class UserVO {
	@Id
	@Column(name="ID")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="PW")
	private String pw;
	
//	이름
	@Column(name="user_name")
	private String name;
	
	@Column(name="e_mail")
	private String eMail;
	
	@Column(name="gender")
//	true 이면 남성, false 이면 여성
	private boolean gender;
	
	@Column(name="age")
	private int age;
	
	@Column(name="enabled")
	private boolean enabled;
	
//	getter, setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

//	equals
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
		sb.append(this.name);
		sb.append("\nE-Mail : ");
		sb.append(this.eMail);
		sb.append("\nPW : ");
		sb.append(this.pw);
		sb.append("\ngender : ");
		sb.append(this.gender);
		sb.append("\nage : ");
		sb.append(this.age);
		sb.append(")");
		return sb.toString();
	}
}