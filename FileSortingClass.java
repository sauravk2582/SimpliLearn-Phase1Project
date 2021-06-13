import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class FileSortingClass {
	public static void FileSorting()
	{
		File[] folder = new File("C:\\Users\\sauravk\\Desktop\\SimpliLearn\\Test").listFiles();
		ArrayList<String> fileArray = new ArrayList<String>(folder.length);
		for(int i = 0; i < folder.length; i++)
			fileArray.add(folder[i].getName());
			
		if(!fileArray.isEmpty()) 
		{	
			System.out.println("Files after sorted in ascending order :");	
			Collections.sort(fileArray);
			for(int j = 0; j < fileArray.size(); j++)	
				System.out.println(fileArray.get(j));
		}
		else
			System.out.println("No file exist to sort");
	}

}
