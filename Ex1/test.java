package Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {

	public static int[] tableau = {17, 12, 15, 76, 66, 0};
	
	public static int division(int indice, int diviseur) throws DivisionParZeroException{
		if(diviseur==0) {
			throw new DivisionParZeroException("division par 0");
		}
		return tableau[indice]/diviseur;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisier indice");
		int x = sc.nextInt();
		
		System.out.println("Saisier diviseur");
		int y = sc.nextInt();
		
		try {
			System.out.println("Resultat " + division(x,y));
		} catch(DivisionParZeroException e) {
			System.out.println(e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("indice doit etre compris entre 0 et "+(tableau.length-1));
		} catch(InputMismatchException e) {
			System.out.println("ff");
		} finally {
			System.out.println("fin");
		}
			
	}
}
