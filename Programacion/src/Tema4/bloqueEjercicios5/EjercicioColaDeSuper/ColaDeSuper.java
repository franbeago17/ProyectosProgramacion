package Tema4.bloqueEjercicios5.EjercicioColaDeSuper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JOptionPane;

public class ColaDeSuper {
	
	public static List<Persona> personas = new ArrayList<Persona>();
	public static List<Persona> personas2 = new ArrayList<Persona>();
	
	public static void main(String[] args) {
		
		int numAleat = (int) Math.round(Math.random() * 50);
		int i = 0;
	
		do {
			agregarPeña();
			if (personas.size() > 10) {
				despacharPeña();
			}
			i++;
		}while(i != numAleat);
		
		imprimeList(personas);
		dividirCola();
		System.out.println("\nPrimera cola: ");
		imprimeList(personas);
		System.out.println("\nSegunda cola: ");
		imprimeList(personas2);
	}
	
	/**
	 * 
	 */
	public static void agregarPeña() {
		Persona persona = new Persona();
		personas.add(0, persona);
		
	}
	
	/*
	 * 
	 */
	public static void despacharPeña() {
		Persona personaBorrada = personas.remove(personas.size()-1);
	}
	
	/**
	 * 
	 */
	public static void dividirCola() {
		personas2.addAll(personas.subList(personas.size()/2, personas.size()));
		personas.removeAll(personas.subList(personas.size()/2, personas.size()));
	}
	
	/**
	 * 
	 * @param personas
	 */
	public static void imprimeList (List<Persona> personas) {
		for (int i = 0; i < personas.size(); i++) {
			System.out.println(personas.get(i).toString());
		}
	}
}
