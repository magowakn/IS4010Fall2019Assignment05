/*
 * IS4010 Fal 2019
 * Assignment 05
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	public static String translateScore (int score) {
		if (score ==2) return ("safety"); // Reference comparison to the previous part of equals to safety
		else if (score == 3) return ("field goal"); // If the previous statement is not true then this will be the next statement to hold true
		else if (score == 6) return ("touchdown"); // // If that statement doesn't hold true, it will output 'touchdown'
		else if (score == 7) return ("touchdown and extra point"); // Another else statement that will hold true if score == 7
		else if (score == 8) return ("touchdown and 2-point conversion"); // Output will be touchdown and 2-point conversion if score matches up with 8
		else if (score == -1) return (""); // Return will be empty if score == -1
		else if (score == 1) return ("invalid"); // 'Invalid' will be the output if score equals 1
		else if (score == 10) return ("you must be playing Quidditch "); // It will output this return if the score is the same as the previous equals statement of 10
		
		return ""; // this will return 'All tests passed' if all of the conditions hold true to their form
		
	}
}
