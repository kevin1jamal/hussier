package cabinet.jam.dto;

import java.io.Serializable;
import java.util.Set;

import cabinet.jam.domaine.entities.Role;

public class UserDto implements Serializable{
	
	
	 public UserDto(String email, String password, String name, String lastName, int active, Set<Role> roles) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
		this.active = active;
		this.roles = roles;
	}
	public UserDto() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	 private String email;
	  private String password;
	  private String name;
	  private String lastName;
	  private int active;
	  private Set<Role> roles;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
