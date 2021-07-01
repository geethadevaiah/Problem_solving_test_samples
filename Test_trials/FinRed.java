package Test_trials;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/***
 * 
 * Find the minimum distance between the two mentioned words
 * 
 * ==> the count of how many steps apart are the two words
 * "the quick the brown quick brown the frog. quick brown" = 1
 * "the quick the brown quick brown the frog. quick frog" = 3
 * 
 * @author Geetha
 *
 */
public class FinRed {
    public static void main(String args[] ) throws Exception {
    	System.out.println("hitting main appln");
        String inputData = "";
        String thisLine = null;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        while ((thisLine = br.readLine()) != null) {
//            inputData += thisLine + "\n";
//        }
        inputData = "pratice makes perfect coding makes.\n" + 
        		"makes\n" + 
        		"coding";
        System.out.println("method called");
        // Output the solution to the console
        System.out.println(codeHere(inputData));
    }
    public static String codeHere(String inputData) {
        
        // input cases
        if(inputData.equals(null) || inputData.length() < 1)   return "";

        String[] strArr = inputData.split("\n");
        // if first and second word does not exists, return empty
        if(strArr.length < 3) return "-1";

        String statement = strArr[0];
        String firstWord = strArr[1];
        String secondWord = strArr[2];

        if(firstWord.equals(secondWord)) return "0";

        // finding the number of space in between each words 
        // since words are case sensitive, one space between the words would indicate to traverse one word.
        // replace the special char in statement.
        String str = statement.replaceAll("[.,:;*&^%$#@!?/\\~]","");
        String[] statementArr = str.split(" ");
        int start = -1, end = -1, min_dist = statementArr.length;
        // considering each words in the array
        for(int i = 0 ; i < statementArr.length ; i++ ){
            // whenever first word is found, noting the index
            if(statementArr[i].equals(firstWord)) start = i; 
            // similarly second word
            if (statementArr[i].equals(secondWord)) end = i;
            if(start != -1 && end != -1) {
	            min_dist = Math.min(min_dist, Math.abs(start - end));
	            System.out.println("start "+start+"   end "+end+"   min_dist ? "+min_dist);
            }
        }
        // if either one of the words does not exists in the statement, return -1
        if(start == -1 || end == -1) return "-1";
        // System.out.println("len ? "+Math.abs(start - end));
        // returning the absolute distance to traverse in either direction
        return String.valueOf(min_dist);
    }
}