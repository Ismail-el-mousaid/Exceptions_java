package Ex2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	private ArrayList choix ;
	
	public Menu() {
		choix = new ArrayList<>();
		choix.add("emsi");
		choix.add("emsi");
		choix.add("emsi");
		choix.add("emsi");
	}

	public  int saisirChoix(int n) throws Inferieure1Exception, HorsInervalleException, NoEntierException{
		if(n<=1)
			throw new Inferieure1Exception("n est inférieure ou égale à 1");
		
		Scanner sc = new Scanner(System.in);
		int x;
		try {
			System.out.println("Saisire valeur:");
			 x = sc.nextInt();
			if(x>n || x<1)
				throw new HorsInervalleException("valeur HorsInervalle");
		} catch(InputMismatchException s) {
			throw new NoEntierException("entrer un nombre entier");
		}
		
		
		return x;
		
//		if(!(x instanceof Integer))
//			throw new NoEntierException("saisire nombe");
			
		
	}
	
	public  void afficherMenu() {
		for(int i=0; i<choix.size(); i++) {
			System.out.println((i+1) + " . " +choix.get(i));
		}
	}
	
	
	 public int menu() {
		afficherMenu();
		
		int ch;
		do {   // pour obliger user de saisir une valeur
			try {
				ch = saisirChoix(choix.size());
				break; // pour stoper la boucle une fois la valeur a saisie
			} catch (Inferieure1Exception | HorsInervalleException | NoEntierException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			} while(true);
		return ch;
	}
	
	
	
	
	
	
	
//	public static void main(String[] args) throws NoEntierException {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Saisire n:");
//		try {
//			int n = sc.nextInt();
//		
//			saisirChoix(n);
//		} catch(Inferieure1Exception e) {
//			System.out.println(e.getMessage());
//		} catch(HorsInervalleException e) {
//			System.out.println(e.getMessage());
//		}
		
//	}
	
	
	
	
	
}
