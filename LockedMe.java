package com.afsanaabu.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LockedMe {
	 static File path =new File( "E:\\SimplilearnAssesment\\Assessment_Phase1\\LockedMeFiles\\Lockedme");

	
	public static void welcomeMessage() {
		
		System.out.println("***..........WELCOME TO COMPANY LOCKERS PVT LTD..........***\n                  ***LockedMe.com*** \n             - Developed by Afsana Abu");
	    System.out.println("............................................................");
	    displayOptions();
	}
	public static void displayOptions() {
		System.out.println("Please Tell Me Your Choice : ");
	    System.out.println(" 1.Show all available files\n 2.Add a new File\n 3.Delete a file\n 4.Search for a file\n 5.Exit");
	}
	
	public static void getFilesList() {

		
		String contents[] = path.list();
		Arrays.sort(contents);
		
		
	      System.out.println("List of files and directories in the specified directory:");
	      for(String content : contents) {
	         System.out.println(content);
	      }
	      System.out.println(".................................................................");
	      displayOptions();
	      select();
	      }
	//create new file
	public static void createNewFile() {
		
		try {
				System.out.println("Enter the name of the file");
				Scanner sc = new Scanner(System.in);
				String fileName = sc.nextLine();
				File file = new File(fileName);
				
					if(!file.exists()) {
						file.createNewFile();
						System.out.println("File successfully created");
					}
					else {
						System.out.println("The file already exists");
					}
				} catch (Exception e) {
					System.out.println("An error occured.Please try again");
				}
		System.out.println("**************************************************************************");
		displayOptions();
	      select();		
	}
	
	public static void deleteFile() {
		
		try {
			System.out.println("Enter the name of the file to be deleted");
			Scanner sc = new Scanner(System.in);
			String fileName = sc.nextLine();
			File file = new File(fileName);
			if (file.delete()) {
			    System.out.println("File deleted successfully");
			}
			else {
			    System.out.println("Failed to delete the file.Please check if the file name is correct.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("An error occured.Please try again");
		}
		System.out.println(".................................................................");
	      displayOptions();
	      select();
    }
	
	public static void searchFile() {
		try {
			System.out.println("Enter the name of the file");
			Scanner sc = new Scanner(System.in);
			String fileName = sc.nextLine();
			File file = new File(fileName);
			
				if(file.exists()) {
					System.out.println("The file is available");
				}
				else {
					System.out.println("The file is not available");
				}
			} catch (Exception e) {
				System.out.println("An error occured.Please try again");
			}
	System.out.println("**************************************************************************");
	displayOptions();
      select();		
}

		public static void exit() {
			System.out.println("*************Exited the application*************\n         ********Thank You********");
		}

public static void select() {
	Scanner sc = new Scanner(System.in);
	int ch = Integer.parseInt(sc.nextLine());
	switch(ch) {
	case 1 :getFilesList();
	break;
	
	case 2 :createNewFile();
	break;
	
	case 3 :deleteFile();
	break;
	
	case 4 :searchFile();
	break;
	case 5 :exit();
	break;
	
	default : System.out.println("Invalid");

}
}

	public static void main(String[] args) {
		
		welcomeMessage();
		select();
		
}
}

