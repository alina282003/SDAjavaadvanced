package inputoutput;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MainIO {

	public static void main(String[] args) {
		
		createFile("C://Users//Alina//Desktop//iotest.txt");
		
		Path path = Paths.get("C://Users//Alina//Desktop//iotest.txt");
		List<String> docLines = readLines(path);
		
		System.out.println(docLines);

	}
	
	
	public static List<String> readLines(Path path){
		List<String> lines = new ArrayList<String>();
		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Can't read file lines");
		}
		return lines;
	}
	
	
	
	public static void createFile(String path) {
		File newFile = new File(path);
		try {
			newFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Can't create file txt");
		}
	}

}
