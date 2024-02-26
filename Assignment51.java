package assignment;

interface Amazon{
	
	abstract void login();
	abstract void logout();

}

public class Assignment51 implements Amazon {
	
	public static void main(String[] args) {
		
		Assignment51 a1 = new Assignment51();
		a1.login();
		a1.logout();
	}

	public void login() {
		
		System.out.println("login");
	}

	public void logout() {
		
		System.out.println("logout");
	}

}
