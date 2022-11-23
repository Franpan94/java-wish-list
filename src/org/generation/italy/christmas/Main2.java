package org.generation.italy.christmas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Set<Character> word = new HashSet<>();
        
        	System.out.print("Inserisci una parola: ");
        	String userWord = sc.nextLine();
        	for(int i=0; i<userWord.length(); i++) {
        		char userSingleChar = userWord.charAt(i);
        		word.add(userSingleChar);
        	}
        	
        	System.out.println("Ecco la parola suddivisa in caratteri: " + word);
	}
}
