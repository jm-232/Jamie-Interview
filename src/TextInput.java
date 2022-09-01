import java.util.ArrayList;
import java.util.Scanner;

public class TextInput {

	public static void main(String[] args) {
		//Setup
		ArrayList<String> storedStrings = new ArrayList<String>();
		storedStrings.add("Welcome to the timewarp of programs");
		storedStrings.add("Applications like this were used in in the 1980s.");
		storedStrings.add("I can’t wait for User Interfaces to be invented.");
		storedStrings.add("Then I can do much more complicated things");
		Scanner textRead = new Scanner(System.in);
		String currentText = "";
		
		System.out.println("Welcome!");
		System.out.println("I,l = Print All");
		System.out.println("e = Exit");
		
		String input;
		char command='I';
		currentText="";
		do{
			//Takes and splits the input
			input = textRead.nextLine();
			command=input.charAt(0);
			if(input.length()>2) {
				currentText=input.substring(2);
			}
			switch(command) {
			case 'l':
			case 'L':
				//Print all Strings
				for(int i=0;i<storedStrings.size();i++) {
					System.out.println(storedStrings.get(i));
				}
				break;
			case 'a':
			case 'A':
				//Adds the text after the command, if there is text
				if(!currentText.equals("")) {
					storedStrings.add(currentText);
					System.out.println("Added "+currentText);
				}else {
					System.out.println("No text to add");
				}
					
				break;
			case 'i':
			case 'I':
				//Adds the text after the command at a specific line, if there is text
				if(!currentText.equals("")) {
					int line = Character.getNumericValue(currentText.charAt(0));
					storedStrings.add(storedStrings.get(storedStrings.size()-1));
					for(int i =storedStrings.size()-2;i>line;i--) {
						storedStrings.set(i, storedStrings.get(i-1));
					}
					storedStrings.set(line,currentText.substring(2));
					System.out.println("added " + currentText.substring(2));
				}else {
					System.out.println("No text to add");
				}
				break;
			}
		}while(!(command=='e'));
		System.out.println("exiting");
		
		textRead.close();
	}

}
