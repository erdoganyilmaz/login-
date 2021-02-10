package io.javabrains.role;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	private Long roleId;
	private String roleName;
	private String createdBy;
	@Column(name = "creationDate")
	private Timestamp creationDate = new Timestamp(new Date().getTime());

	public Role() {

	}

	public Role(Long roleId, String roleName, String createdBy) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.createdBy = createdBy;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
