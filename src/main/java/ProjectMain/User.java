package ProjectMain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ProjectMain.constraints.Email;



public class User {
	@NotNull 
	@Email
	private String email;
	@NotNull 
	@Size(min=2,max=30) 
    private String name;
	@NotNull
	@Size(min=2,max=30) 
    private String surname;
	@NotNull 
	private String password;
	
	public User(String email,String name, String surname, String password) {
		this.email=email;
		this.name=name;
		this.surname=surname;
		this.password=password;
	}
	public String getEmail() {
        return email;
    }
    public void setEmail( String email) {
        this.email = email;
    }
	
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname( String surname) {
        this.surname = surname;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword( String password) {
        this.password = password;
    }
}
