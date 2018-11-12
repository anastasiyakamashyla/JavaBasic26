package by.cdptr.les10.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerReadFile {
	
	
	 public static List<String> read(String filePath) {
		 File file = new File(filePath);
		 List<String> lines = new ArrayList<>();
	        try {
	            Scanner scanner = new Scanner(file);
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                lines.add(line);
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        return lines;
	    }

}
