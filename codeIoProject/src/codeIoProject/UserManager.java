package codeIoProject;

public class UserManager {
	public void Add(User user) {
		System.out.println(user.Name +" "  + "ba�ar�yla giri� yapt�.");
	}
	
	public void multipleAdd(User[] users) {
		for (User user : users) {
			Add(user);
		}
	}
	
}
