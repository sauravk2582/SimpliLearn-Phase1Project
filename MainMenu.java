import java.io.IOException;
import java.util.Scanner;
public class MainMenu {
	public void MainMenuDriver() throws IOException{
		System.out.println("*****MAIN MENU*****");
		System.out.println("Enter the option to be executed:");
		System.out.println("1. File Sorting");
		System.out.println("2. Business Level Operation");
		System.out.println("3. Exit the Application");
		Scanner scan5 = new Scanner(System.in);
			int input = scan5.nextInt();
		
			switch (input) 
			{
				case 1:	FileSortingClass.FileSorting();
						MainMenuDriver();
						break;
				case 2: BusinessLevelOperation.FileOperation();
						break;
				case 3: System.out.println("Exited From The Application");
						break;
		
			}
		
	}	
}
