package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Virement")
public class Virement extends Operation{

	@Column(name = "BENEFICIAIRE", length = 50, nullable = false)
	private String beneficiaire;

	/** Getter pour l'attribut beneficiaire
	 * @return beneficiaire renvois beneficiaire 
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/** Setter pour l'attribut beneficiaire
	 * @param beneficiaire the beneficiaire sauvegarde la valeur dans beneficiaire the beneficiaire  
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	
	
}
