package web.module.login;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserAuth {
	@Id 
	private int id;
	private String pass;
	private String salt;
	
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return pass;
	}
	public void setPassword(String password) {
		this.pass = password;
	}
	
}
