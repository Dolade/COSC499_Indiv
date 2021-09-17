package Default;
import java.util.*;

public class Array_Sort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] str = new String[5];
		String[] sortStr = new String[5];
		int tempLength = 100;
		String temp = null;
		int idx = 0;
		String longString = "This is a veyr long string that should never be passed!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
		
		System.out.println("Please write 5 separate words that you'd like to have sorted by amount of characters/string length: (Press enter to submit each word)");
		for(int i = 0; i < 5; i++) {
			str[i] = in.nextLine();
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(str[j].length() < tempLength) {
					temp = str[j];
					tempLength = str[j].length();
					idx = j;
				}
			}
			
			sortStr[i] = temp; //comment
			str[idx] = longString;
			System.out.println(sortStr[i]);
			tempLength = 100;
		}
		
	}

}
