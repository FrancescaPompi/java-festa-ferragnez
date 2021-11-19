package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		System.out.print("Come ti chiami? ");
		String nome = scan.nextLine();
		System.out.println("Il tuo nome è: " + nome);
		
		boolean verificaNome = false;
		int counter = 0;
		
		while(!verificaNome && counter < listaInvitati.length) {
			if(nome.equals(listaInvitati[counter])) {
				System.out.println("Il tuo nome è presente sulla lista! Puoi entrare.");
				verificaNome = true;
				break;
			} else {
				counter++;
			}
		}
		
		if(!verificaNome) {
			System.out.println("Il tuo nome non è presente sulla lista. Non puoi entrare.");
		}
		
		scan.close();
	}

}
