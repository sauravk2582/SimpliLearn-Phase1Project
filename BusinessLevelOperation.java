import java.io.*;
import java.util.*;

public class BusinessLevelOperation {
	
	public static void FileAdding() throws IOException
	{	
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Enter the file name");
		String Fname = scan1.nextLine();
		File file = new File("C:\\Users\\sauravk\\Desktop\\SimpliLearn\\Test\\" + Fname);
		if(file.createNewFile())
			{	
				System.out.println(Fname + " created successfully\n");
			}
			
			else
			{	
				System.out.println(Fname + " already exist.\n");
					FileAdding();
			}
	}
	public static void FileDeleting()
	{
		System.out.println("Enter the file name to be deleted");
		Scanner scan2 = new Scanner(System.in);
		
			String name = scan2.nextLine();
			File file = new File("C:\\Users\\sauravk\\Desktop\\SimpliLearn\\Test\\" + name);
        
			if(file.delete())
			{	
				System.out.println("File deleted successfully");
			}
			else
			{
				System.out.println("file not found");
			} 
	}
	
	public static void FileSearching()
	{
		Scanner scan3 = new Scanner(System.in);
        	System.out.println("Enter the file to be searched");
        	String name = scan3.next();
        	File myfile = new File("C:\\Users\\sauravk\\Desktop\\SimpliLearn\\Test", name);
        	if (myfile.exists())
		      {
				System.out.println("File "+ myfile.getName() + " found Succesfully\n");
		      }
		
        	else
        		System.out.println("file not found");
}
		
	
	public static void FileOperation() throws IOException {
		// TODO Auto-generated method stub
			System.out.println("Enter the option to be executed");
			System.out.println("1. File Addition");
			System.out.println("2. File Deletion");
			System.out.println("3. File Searching");
			System.out.println("4. Go to Main Menu");
			Scanner scan4 = new Scanner(System.in);
			int input = scan4.nextInt();
			
				switch(input)
					{
						case 1: FileAdding();
								FileOperation();
									break;
				
						case 2: FileDeleting();
								FileOperation();
									break;
				
						case 3: FileSearching();
								FileOperation();
									break; 		
						case 4: MainMenu mainMenuObj2 = new MainMenu();
				    			mainMenuObj2.MainMenuDriver();
				    				break;
						default: System.out.println("invalid option");
									break;
				}
		 }
}
