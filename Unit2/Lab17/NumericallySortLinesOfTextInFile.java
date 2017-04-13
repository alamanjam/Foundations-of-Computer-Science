import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class NumericallySortLinesOfTextInFile {

	public static void main(String[] args) throws Exception {

		String inputFile = "profiles.txt";
		String outputFile = "profiles1.txt";
      int count=0;
		Scanner infile = new Scanner(inputFile);
		BufferedReader fileReader=new BufferedReader(new FileReader);
		List<Player> lineList = new ArrayList<Player>();
      
		while ((infile.hasNextChar() == true)) {
      count++;
      		}
            System.out.print(count);
		infile.close();

		Collections.sort(lineList, new ByName());
      
      System.setOut(new PrintStream(new FileOutputStream(outputFile)));

		for (Player outputLine : lineList) {
			System.out.println(outputLine);
		}
		
		
	}
}