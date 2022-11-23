package org.generation.italy.christmas;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main3 {
   public static void main(String[] args) {
	   Map<Character, Integer> word = new TreeMap<>();
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Inserisci una parola: ");
	   String userWord = sc.nextLine();
	   
	   for(int i=0; i<userWord.length(); i++) {
		   char userChar = userWord.charAt(i);
		   word.put(userChar, i); 
	   }
	   
	   System.out.print("Mappatura della parola: " + word);
}
}
