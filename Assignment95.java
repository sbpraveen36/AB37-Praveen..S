package assignment1;
class GetSet
{
	private String username = "abc@grotechmind.com";
	public String get_username()
	{
		return username;
	}
	public void set_username(String username)
	{
		this.username = username;
	}
}
public class Assignment95 {

	public static void main(String[] args) {
		
		GetSet g1 =new GetSet();
		g1.set_username("aryan@gmail.com");	
		System.out.println(g1.get_username());	
	}
}
