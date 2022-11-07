package fr.diginamic;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	

	private int numero;
	
	private String rue;
	
	private int codePostal;
	
	private String ville;

	public Adresse() {
		
	}

	/** Getter pour l'attribut numero
	 * @return numero renvois numero 
	 */
	public int getNumero() {
		return numero;
	}

	/** Setter pour l'attribut numero
	 * @param numero the numero sauvegarde la valeur dans numero the numero  
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/** Getter pour l'attribut rue
	 * @return rue renvois rue 
	 */
	public String getRue() {
		return rue;
	}

	/** Setter pour l'attribut rue
	 * @param rue the rue sauvegarde la valeur dans rue the rue  
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/** Getter pour l'attribut codePostal
	 * @return codePostal renvois codePostal 
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/** Setter pour l'attribut codePostal
	 * @param codePostal the codePostal sauvegarde la valeur dans codePostal the codePostal  
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/** Getter pour l'attribut ville
	 * @return ville renvois ville 
	 */
	public String getVille() {
		return ville;
	}

	/** Setter pour l'attribut ville
	 * @param ville the ville sauvegarde la valeur dans ville the ville  
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	
}
