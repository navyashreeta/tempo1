package simple;
import java.util.*;



public class arraymanipulation {
	 public static String checkVowel(String word){
	        String vowels = "AEIOUaeiou";
	        String alteredWord = "";
	        for(int i = 0; i < word.length(); i++){
	            if(vowels.indexOf(word.charAt(i)) >= 0){
	                alteredWord += (char)((int)word.charAt(i)+1);
	            }else{
	                alteredWord += word.charAt(i);
	            }
	        }
	        return alteredWord;
	    }
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER A sentence");
			String sentence = sc.nextLine();
			if(sentence.length()<=2){
			    System.out.println("1");
			    System.out.println(checkVowel(sentence));
			    System.exit(0);
			}
			int countWords = 1;
			int start = 0;
			String finalString = "";
			for(int i = 0; i < sentence.length(); i++){
			    if((int)sentence.charAt(i) == 32){
			        countWords++;
			        finalString += checkVowel(sentence.substring(start, i)) + " ";
			        start = i+1;
			    }
			    if(i==sentence.length()-1){
			        finalString += checkVowel(sentence.substring(start, i+1)) + " ";
			    }
			}
			System.out.println(finalString);

	
		}
}
