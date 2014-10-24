package com.formation;

public class Division {

	private int dividende;
	private int diviseur;

	public Division(String a, String b) {
		dividende = Integer.parseInt(a);
		diviseur = Integer.parseInt(b);
	}

	public int quotient() {
		return dividende / diviseur;
	}
	
	public int reste() {
		//TODO
		return 0;
	}

	public static void main(String[] args) {
		String nombre1 = "9";
		String nombre2 = "5";
		String nombre3 = "aa";
		String nombre4 = null;

		Division quotient = new Division(nombre1, nombre2);
		System.out.println("Resutlat de la division de " + nombre1 + " par " + nombre2 + " : " + quotient.quotient());
	}

}
