package fr.diginamic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("AssuranceVie")
public class AssuranceVie extends Compte{

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFin;
	
	@Column(name = "TAUX", length = 50, nullable = false)
	private double taux;

	/** Getter pour l'attribut dateFin
	 * @return dateFin renvois dateFin 
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/** Setter pour l'attribut dateFin
	 * @param dateFin the dateFin sauvegarde la valeur dans dateFin the dateFin  
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

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