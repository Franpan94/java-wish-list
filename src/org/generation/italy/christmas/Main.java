package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
		List<String> wishList = new ArrayList<>();
		
		
		Scanner sc = new Scanner(System.in);
		boolean userChoise = true;
     
        	
        	while(userChoise) {
        		System.out.print("Per aggiungere un desiderio digitare si, per controllare la lista digitare no: ");
        		String request = sc.nextLine();
        		if(request.equals("si")) {
        			
            		System.out.print("Aggiungi un desiderio: ");
        			String userRequest = sc.nextLine();
        			wishList.add(userRequest);
        			System.out.println(wishList);
        		} else 
        			System.out.println(wishList);
        		
            }
        
			
		
		
	}
}
