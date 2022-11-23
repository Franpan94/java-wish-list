package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static class StringComparator implements Comparator <String> {

		@Override
		public int compare(String o1, String o2) {
			int countVocal1 = 0;
			int countVocal2 = 0;
			
			for(int i=0; i<o1.length(); i++) {
				if(o1.charAt(i) == 'a' || o1.charAt(i) == 'e'
						|| o1.charAt(i) == 'i'	|| o1.charAt(i) == 'o'
						|| o1.charAt(i) == 'u') {
					
					countVocal1++;
				}
			}
			
			for(int i=0; i<o2.length(); i++) {
				if(o2.charAt(i) == 'a' || o2.charAt(i) == 'e'
						|| o2.charAt(i) == 'i'	|| o2.charAt(i) == 'o'
						|| o2.charAt(i) == 'u') {
					
					countVocal2++;
				}
			}
			return countVocal2 - countVocal1;
			
	
		}
		
	}
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
        			wishList.sort(new StringComparator());
        			System.out.println("Lista dei desideri: " + wishList);
        		
        		} else System.out.println("Inserisci una risposta valida");
        			
            }
        
		}
}
