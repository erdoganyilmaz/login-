package io.javabrains.role;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;

	public List<Role> getAllRoles() {
		List<Role> roles = new ArrayList<>();
		roleRepository.findAll().forEach(roles::add);
		return roles;
	}

	public Role getRole(Long id) {
		return roleRepository.findById(id).orElse(null);
	}

	public void addRole(Role role) {
		roleRepository.save(role);
	}

	public void updateRole(String id, Role role) {
		roleRepository.save(role);
	}

	public void deleteRole(Long id) {
		roleRepository.deleteById(id);
	}
}