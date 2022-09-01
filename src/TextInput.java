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
		
		System.out.println("Welcome! \n Please Enter a Command");
		
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
			case 'd':
			case 'D':
				//Deletes Line at given int
				int Dline = Character.getNumericValue(currentText.charAt(0));
				System.out.println("Removed " + storedStrings.get(Dline));
				storedStrings.remove(Dline);
				break;
			case 'r':
			case 'R':
				//Swaps the lines of two given ints
				int Rline1 = Character.getNumericValue(currentText.charAt(0));
				int Rline2 = Character.getNumericValue(currentText.charAt(2));
				String Rtemp = storedStrings.get(Rline1);
				storedStrings.set(Rline1, storedStrings.get(Rline2));
				storedStrings.set(Rline2, temp);
				System.out.println("Swapped " + storedStrings.get(Rline2) +" and " + storedStrings.get(Rline1));
				break;
			case 'e':
			case 'E':
				int Eline = Character.getNumericValue(currentText.charAt(0));
				String Etemp = storedStrings.get(Eline);
				storedStrings.set(Eline, currentText.substring(2));
				System.out.println("Changed " +Etemp + " to " + storedStrings.get(Eline));
				break;
			}
		}while(!(command=='e'));
		System.out.println("exiting");
		
		textRead.close();
	}

}
