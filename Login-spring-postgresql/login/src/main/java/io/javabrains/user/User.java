package io.javabrains.user;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kullanici")
public class User {

	@Id
	private Long id;
	private String name;
	private String email;
	private String password;
	private String roleName;
	private String createdBy;
	private String updatedBy;
//	private Timestamp timestamp = new Timestamp(new Date().getTime());
	@Column(name = "creationDate")
	private Timestamp creationDate = new Timestamp(new Date().getTime());

	public User() {
		super();

	}

	public User(Long id, String name, String email, String password, String roleName, String createdBy, String updatedBy) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.roleName = roleName;
		this.createdBy = createdBy;
		this.setUpdatedBy(updatedBy);
	}

	public void setCreationDate() {
		this.creationDate = new Timestamp(new Date().getTime());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
}
