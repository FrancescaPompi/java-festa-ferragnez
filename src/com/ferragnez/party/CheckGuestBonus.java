package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuestBonus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		System.out.print("Come ti chiami? ");
		String nome = scan.nextLine();
		System.out.println("Il tuo nome �: " + nome);
		
		boolean verificaNome = false;
		
		for(int i = 0; i < listaInvitati.length; i++) {
			if(nome.equals(listaInvitati[i])) {
				System.out.println("Il tuo nome � presente sulla lista! Puoi entrare.");
				verificaNome = true;
				break;
			}
		}
		
		if(!verificaNome) {
			System.out.println("Il tuo nome non � presente sulla lista. Non puoi entrare.");
		}
		
		scan.close();

	}

}
