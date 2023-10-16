package zzOdev;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NKReader extends Yol {

		public NKReader(String path) {
		super(path);
		// TODO Auto-generated constructor stub
	}

		void readText() throws IOException{
	BufferedReader reader = new BufferedReader(new FileReader(path));
	String line;
	while ((line = reader.readLine()) != null) {
	    System.out.println(line);
	}
	reader.close();
	}
		
		ArrayList<String> readWords() throws FileNotFoundException {
			File f = new File(path);
			Scanner sc = new Scanner(f);
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
			return null;
		}
		
		String readLineAt(int n) throws IOException {
			String text;
		BufferedReader reader = null;
		reader= new BufferedReader(new FileReader(path));
			for(int i=1; i<n; i++) {
				reader.readLine();}
				text = reader.readLine();
				System.out.println(text);
				return text;
					
	}
		
}

