package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("LivretA")
public class LivretA extends Compte{

	@Column(name = "TAUX", length = 50, nullable = false)
	private double taux;

	/** Getter pour l'attribut taux
	 * @return taux renvois taux 
	 */
	public double getTaux() {
		return taux;
	}

	/** Setter pour l'attribut taux
	 * @param taux the taux sauvegarde la valeur dans taux the taux  
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	
}
