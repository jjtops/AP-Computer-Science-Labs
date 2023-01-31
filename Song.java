
public class Song {
	public static void printSong() {
		// TODO Auto-generated method stub
		vers1();
		ref();
		cho();
		vers2();
		ref();
		vers3();
		cho();
		vers4();
		ref();
		cho();
		
		
		
	}
	//title
    public static void printTitle(String Title) {
    	System.out.println(Title);
    }
    //artist
    public static void printAuthor(String Author) {
    	System.out.println(Author);
    }
    //vers stands for each verse
    public static void vers1() {
    	System.out.println("It's nine o'clock on a Saturday\n"
    			+ "The regular crowd shuffles in\n"
    			+ "There's an old man sittin' next to me\n"
    			+ "Makin' love to his tonic and gin\n"
    			+ "He says, \"Son, can you play me a memory?\n"
    			+ "I'm not really sure how it goes\n"
    			+ "But it's sad, and it's sweet, and I knew it complete\n"
    			+ "When I wore a younger man's clothes\"\n"
    			+ "");
    }
    
    public static void vers2() {
    	System.out.println("Now John at the bar is a friend of mine\n"
    			+ "He gets me my drinks for free\n"
    			+ "And he's quick with a joke, or to light up your smoke\n"
    			+ "But there's someplace that he'd rather be\n"
    			+ "He says, \"Bill, I believe this is killing me\"\n"
    			+ "As the smile ran away from his face\n"
    			+ "\"Well I'm sure that I could be a movie star\n"
    			+ "If I could get out of this place\"");
    }
    
    public static void vers3() {
    	System.out.println("Now Paul is a real estate novelist\n"
    			+ "Who never had time for a wife\n"
    			+ "And he's talkin' with Davy, who's still in the Navy\n"
    			+ "And probably will be for life\n"
    			+ "And the waitress is practicing politics\n"
    			+ "As the businessmen slowly get stoned\n"
    			+ "Yes, they're sharing a drink they call loneliness\n"
    			+ "But it's better than drinkin' alone");
    }
    
    public static void vers4() {
    	System.out.println("It's a pretty good crowd for a Saturday\n"
    			+ "And the manager gives me a smile\n"
    			+ "'Cause he knows that it's me they've been comin' to see\n"
    			+ "To forget about life for a while\n"
    			+ "And the piano, it sounds like a carnival\n"
    			+ "And the microphone smells like a beer\n"
    			+ "And they sit at the bar and put bread in my jar\n"
    			+ "And say, \"Man, what are you doin' here?\"");
    }
    //chorus
    public static void cho() {
    	System.out.println("Sing us a song, you're the piano man\n"
    			+ "Sing us a song tonight\n"
    			+ "Well, we're all in the mood for a melody\n"
    			+ "And you've got us feeling alright");
    }
    //refrain
    public static void ref() {
    	System.out.println("Oh, la, la-la, di-dee-da\n"
    			+ "La-la, di-dee-da, da-dum\n");
    			
    }
    
}

