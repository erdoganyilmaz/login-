package io.javabrains.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RoleController {
	@Autowired
	private RoleService roleService;

	@RequestMapping(value = "/roles",method = RequestMethod.GET)
	public List<Role> getAllRoles() {
		return roleService.getAllRoles();
	}

	@RequestMapping("/roles/{id}")
	public Role getRole(@PathVariable Long id) {
		return roleService.getRole(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/roles")
	public void addRole(@RequestBody Role role) {
		roleService.addRole(role);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/roles/{id}")
	public void updateRole(@RequestBody Role role, @PathVariable String id) {
		roleService.updateRole(id, role);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/roles/{id}")
	public void deleteRole(@PathVariable Long id) {
		roleService.deleteRole(id);
	}
}