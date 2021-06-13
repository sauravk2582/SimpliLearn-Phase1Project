import java.io.IOException;

public class WelcomeScreen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Locker's Project\nFile Operation\nCreated By Saurav Kumar");
		MainMenu mainMenuObj = new MainMenu();
		mainMenuObj.MainMenuDriver();
	}

}
