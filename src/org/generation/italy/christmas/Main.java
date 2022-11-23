package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
		List<String> wishList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
        	
        	while(true) {
        		System.out.print("Per aggiungere un desiderio digitare si, per controllare la lista digitare no: ");
        		String request = sc.nextLine();
        		if(request.equals("si")) {
        			
            		System.out.print("Aggiungi un desiderio: ");
        			String userRequest = sc.nextLine();
        			wishList.add(userRequest);
        			int listLength = wishList.size();
        			System.out.println("Lunghezza lista: " + listLength);
        		} else if(request.equals("no")) {
        			Collections.sort(wishList);
        			System.out.println("Lista dei desideri: " + wishList);
        		} else System.out.println("Inserisci una risposta valida");
        			
            }
        
		}
}
