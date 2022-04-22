package Banque;

public class Compte {

	private int code;
	private float solde;
	
	public Compte(int code, float solde) {
		super();
		this.code = code;
		this.solde = solde;
	}
	
	public void verser(float montant) {
		solde=solde+montant;
	}
	
	public void retirer(float mt) throws SoldeInsuffisantException, NegativeException{
		if(solde<mt)
			throw new SoldeInsuffisantException("Solde insuffisant");
		if(mt<0)
			throw new NegativeException("Montant négatif");
		solde=solde-mt;
	}

	public float getSolde() {
		return solde;
	}
	
	
	
}
