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
		
		System.out.println("Welcome!");
		System.out.println("I,l = Print All");
		System.out.println("e = Exit");
		do {
			String input = textRead.next();
			switch(input) {
			case("I"):
			case("L"):
				//Print all Strings
				for(int i=0;i<storedStrings.size();i++) {
					System.out.println(storedStrings.get(i));
				}
			}
		}while(!textRead.equals("e"));
		
		textRead.close();
	}

}
