package ProjectMain;

public interface UsersServiceInterface {
	public void createUser(User user);
	
    public User searchUser(String name);
    
    public void changeUser(User user);
    
    public void deleteUser(User user);
    
    public void showUsers();
}
