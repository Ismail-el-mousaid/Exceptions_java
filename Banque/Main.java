package Banque;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {  // on utilise le try en début pour gérer exception de saisir des caracteres 
			Scanner sc = new Scanner(System.in);
			System.out.println("Code: ");
			int c = sc.nextInt();
		
			System.out.println("Solde: ");
			float s = sc.nextFloat();
		
			Compte cp = new Compte(c, s);
			System.out.println("Montant à verser:");
			float mt1 = sc.nextFloat();
			cp.verser(mt1);
		
			System.out.println("Montant à retirer:");
			float mt2 = sc.nextFloat();
		
			cp.retirer(mt2);
			System.out.println("Solde est : "+cp.getSolde());
		} catch (SoldeInsuffisantException e) {   //Exception manuelle
			System.out.println(e.getMessage()) ;
		} catch(NegativeException e) {    //Exception manuelle
			System.out.println(e.getMessage());
		} catch(InputMismatchException e) {  //Exception par défaut de java
			System.out.println("Prblm de saisie");
		}
		// on peut généraliser ces 2 catch en utilisant un seul catch (Exception e) {}
		finally {
			System.out.println("finally s'exécute quelque soit scénario");
		}
	}

}
