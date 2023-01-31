/**
* This class, outputs an example of the 
* very popular madlibs game
* Enter the requested character when asked,
* eventually a sentence will output with your selected words
* 
*  @JeetJagtap
*
*/
import java.util.Scanner;
public class Unit2Lab {


	public static void main(String[] args) {
		// Sets up the input scanner
		Scanner input = new Scanner(System.in);
		//asks the user what input it should give
		//and takes it in
		System.out.print("A Mad Libs® Story: Office Life" + "\n" + "The program will prompt for a few words to enter. After all words are entered the program will print a story.\n"
				+ "Thank you for playing." + "\n\n");
		
		System.out.print("Enter a first name: ");
		String name = input.next();
		
		System.out.print("Enter an adjective: ");
		String adj = input.next();
		
		System.out.print("Enter a number: ");
		Integer num = input.nextInt();
		
		System.out.print("Enter a verb: ");
	    String verb = input.next();
	    
	    System.out.print("Enter a noun: ");
	    String noun = input.next();
	    
	    System.out.print("Enter another name: ");
		String name1 = input.next();
		
		//prints the sentence
		System.out.println("\nDear " + name + ",\n" + "I saw you had left your food at the office. "
				+ "When I looked at it... I thought it was " 
				+ adj + ". I wanted to " + verb +  " for biting it " 
				+ num + " times." + "\nI hope I did not " + noun + " your day."
				+"\n" + "\nMy sincerest apologies, " + name1);
		input.close();
	}

}
