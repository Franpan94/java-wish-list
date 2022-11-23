package org.generation.italy.christmas;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main3 {
   public static void main(String[] args) {
	   Map<Character, Integer> freq = new TreeMap<>();
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Inserisci una parola: ");
	   String userWord = sc.nextLine();
	   
	   for(Character character : userWord.toCharArray()) {
		   if(freq.containsKey(character)) {
			   int oldFreq = freq.get(character);
			   freq.put(character, oldFreq +1);
		   } else freq.put(character, 1);
	   }
	   
	   System.out.print("Mappatura della parola: " + freq);
}
}
