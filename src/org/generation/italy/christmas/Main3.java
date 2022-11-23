package org.generation.italy.christmas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
   public static void main(String[] args) {
	   Map<Integer, Character> word = new HashMap<>();
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Inserisci una parola: ");
	   String userWord = sc.nextLine();
	   
	   for(int i=0; i<userWord.length(); i++) {
		   char userChar = userWord.charAt(i);
		   word.put(i, userChar);
	   }
	   
	   System.out.print("Mappatura della parola: " + word);
}
}
