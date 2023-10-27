import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String sentence1 = input.nextLine();
		System.out.println("Please enter another word to check for anagrams");
		String sentence2 = input.nextLine();
		//Removes all spaces and puts both sentences into lowercase so nothing is case sensitive
		String newSentence1 = sentence1.replaceAll("\\s", "").toLowerCase();
		String newSentence2 = sentence2.replaceAll("\\s", "").toLowerCase();
		
		//If the index of sentence 1 is not the same as sentence 2 then exit the program
		if(newSentence1.length() != newSentence2.length())
		{
		    System.out.println("The 2 strings " + newSentence1 + " and " + newSentence2 + " are not anagrams of one another.");
	        System.exit(0);	
		}
		//If the index is the same start comparing the sentneces character by character
		else
		{
		   char c, c1;
		   int match;
		   //For loop to start going through each letter of the first sentence
		   for(int i = 0; i < newSentence1.length(); i++)
		   {
		       c = newSentence1.charAt(i);
		       match = 0;
		  //For loop to start going through each letter of the secodn sentence
		       for(int j = 0; j < newSentence2.length(); j++)
		       {
		           c1 = newSentence2.charAt(j);
		  //If there is a match in the sentence then the match = 1 
		           if (c == c1)
		              {
		                  match = 1;
		                  break;
		              }
		       }
		  //If there isnt a match in the sentence then they arent anagrams and exit the code
		       if (match == 0)
		       {
		          System.out.println("The 2 strings " + newSentence1 + " and " + newSentence2 + " are not anagrams of one another.");
	              System.exit(0);
		      }
		 //Else keep going until the sentences are over then print out that they are anagrams
		  }
		  System.out.println("The 2 strings " + newSentence1 + " and " + newSentence2 + " are anagrams of one another.");
		}
	}
}

