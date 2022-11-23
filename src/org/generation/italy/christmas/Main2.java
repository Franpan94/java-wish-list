package org.generation.italy.christmas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Set<String> words = new HashSet<>();
        
        	System.out.print("Inserisci una parola: ");
        	String userWord = sc.nextLine();
        	for(int i=0; i<userWord.length(); i++) {
        		char userSingleChar = userWord.charAt(i);
        		System.out.println(userSingleChar);
        		words.add(userSingleChar)
        	}
	}
}
