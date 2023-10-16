package zzOdev;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		NKReader myReader = new NKReader("C:\\Users\\DELL\\Desktop\\odev.txt");
		ArrayList<String> kelimeler = myReader.readWords();
		System.out.println(" ");
		System.out.println("---------------");
		System.out.println(" ");
		String satir = myReader.readLineAt(5);
		System.out.println(" ");
		System.out.println("---------------");
		System.out.println(" ");
		myReader.readText();
	}

}
