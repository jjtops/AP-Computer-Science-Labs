import java.util.Scanner;

public class UserProfileTester {
//tester

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new object, prints attributes 

		 String pre; 
		 String suff;
		
		UserProfile myProfile = new UserProfile("Jeet", "Jagtap", "jjagt@yy.org", 2021, "123-234-456");
		System.out.println(myProfile.getAttribute() + "but we will regenerate it");
		Scanner input = new Scanner(System.in);
		System.out.print("Suffix:");
		suff = input.next();
		System.out.print("prefix:");
		pre = input.next();
		System.out.println(myProfile.regenPassword(pre, suff));
		
		UserProfile secondProfile = new UserProfile ("David", "Ricko", "drick@aol.com");
		System.out.println(secondProfile.getAttribute());
		input.close();
	}

}
