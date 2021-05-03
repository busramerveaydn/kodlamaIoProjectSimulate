package codeIoProject;

public class UserManager {
	public void Add(User user) {
		System.out.println(user.Name +" "  + "baþarýyla giriþ yaptý.");
	}
	
	public void multipleAdd(User[] users) {
		for (User user : users) {
			Add(user);
		}
	}
	
}
