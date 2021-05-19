package ie.gmit.sw;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class Runner {
	/*
	 * IMPORTANT! Read the following points and delete them when you're finished.
	 * --------------------------------------------------------------------------
	 * (a) Keep the menu alive inside a loop. When (5) is selected, set the loop
	 * control variable to false. (b) Use a java.util.Scanner class to read in the
	 * user input and a new switch statement to process the choice. You can read
	 * about the new switch statement at
	 * https://docs.oracle.com/en/java/javase/13/language/switch-expressions.html.
	 * (c) DO not hardcode any system paths or file names. However, you can assume
	 * that the list of common English words is available in the current directory
	 * as File f = new File("./commonEnglishWords.txt"); (d) Comment all methods
	 * with an explanation of their Big-O space / time complexity. (e) Try not to
	 * cram all the functionality into this one class! Each class should have one
	 * responsibility only.
	 */

	public void go() {

		System.out.println("***************************************************");
		System.out.println("* GMIT - Dept. Computer Science & Applied Physics *");
		System.out.println("*                                                 *");
		System.out.println("*              Zimmerman Encoder 1.0              *");
		System.out.println("*          (Linguistic Encoding System)           *");
		System.out.println("*                                                 *");
		System.out.println("***************************************************");

		System.out.println("1) Enter File Name to Process"); // Ask user to specify the file to process. Do NOT hardcode
																// paths or file names
		System.out.println("2) Generate Lookup Tables"); // Read in common words as File f = new
															// File("./commonEnglishWords.txt");
		System.out.println("3) Encode Mode"); // Ask user for output file or just use out.txt
		System.out.println("4) Decode Mode"); // Ask user for output file or just use out.txt
		System.out.println("5) Quit"); // Terminate
		System.out.println("\nSelect Option [1-5]>");

	}

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in); // Create a Scanner object
		LinkedList <String> words = new LinkedList<String>();
		int userChoice = 0;
		do {

			new Runner().go();
			userChoice = scan.nextInt();
			String fileName;

			// Was more familiar with the old switch statement
			switch (userChoice) {

			case 1:

				// Asks user to specify which file they want to process
				System.out.println("What file would you like to process , enter file by name :");
				fileName = scan.nextLine();

				// Reading in words line by line from text file
				BufferedReader reader;
				try {
					reader = new BufferedReader(new FileReader(
							"C:\\Users\\conor\\eclipse-workspace\\DataProject\\DSAProject2021\\src\\ie\\gmit\\sw\\commonEnglishWords.txt"));
					String line = reader.readLine();
					
					while (line != null) {

						//adding words from text file to linkedlist
						words.add(line);
						
						// read next line
						line = reader.readLine();
					}
					
					for(int i = 0; i < words.size(); i++)
					{
						System.out.print(i+"\n");
					}
					
					//System.out.println(words);
					
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

				break;

			case 2:

				// Read in the common words from the text file provided
				System.out.println("Option 2");

				break;

			case 3:

				// use the text file to encode

				break;

			case 4:

				// use the text file to decode

				break;

			case 5:
				System.out.println("Goodbye !");
				break;

			default:
				System.out.println("Invalid option, Try again");

			}
		} while (userChoice != 5);
	}
}
