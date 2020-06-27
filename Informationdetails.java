import java.util.*;
public class Informationdetails 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Name/Email-id:");
		String a=s.nextLine();
		if(a.equals("testlead@gmail.com"))
		{
			System.out.println("\"name\":\"Test Lead\",");
			System.out.println("\"email:\""+a+"\",");
		}
		else if(a.equals("Test Lead"))
		{
			System.out.println("\"name\":\""+a+"\",");
			System.out.println("\"email:\"testlead@gmail.com\",");
		}
		if(a.equals("testlead@gmail.com")||a.contentEquals("Test Lead"))
		{
			System.out.println("\"phone\":\"111-222-3333\"");
			System.out.println("\"beds\":3,");
			System.out.println("\"baths\":2,");
			System.out.println("\"address\":\"43824 W Sagebrush Trl, Maricopa, AZ 85138\"");
		}
		else
		{
			System.out.println("\"name\":\"Buyer\",");
			System.out.println("\"email:\"Not available\",");
			System.out.println("\"phone\":\"Not available");
			System.out.println("\"beds\":0,");
			System.out.println("\"baths\":0,");
			System.out.println("\"address\":\"Not available\"");
		}	
	}
}
