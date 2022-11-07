package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
public class Operation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	@Column(name = "MONTANT", length = 50, nullable = false)
	private double montant;
	
	@Column(name = "MOTIF", length = 50, nullable = false)
	private String motif;
	
	@ManyToOne
	@JoinColumn(name = "comptes")
	private Compte compte;

	
	
	/** Getter pour l'attribut id
	 * @return id renvois id 
	 */
	public Integer getId() {
		return id;
	}

	/** Setter pour l'attribut id
	 * @param id the id sauvegarde la valeur dans id the id  
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Getter pour l'attribut date
	 * @return date renvois date 
	 */
	public Date getDate() {
		return date;
	}

	/** Setter pour l'attribut date
	 * @param date the date sauvegarde la valeur dans date the date  
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/** Getter pour l'attribut montant
	 * @return montant renvois montant 
	 */
	public double getMontant() {
		return montant;
	}

	/** Setter pour l'attribut montant
	 * @param montant the montant sauvegarde la valeur dans montant the montant  
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/** Getter pour l'attribut motif
	 * @return motif renvois motif 
	 */
	public String getMotif() {
		return motif;
	}

	/** Setter pour l'attribut motif
	 * @param motif the motif sauvegarde la valeur dans motif the motif  
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/** Getter pour l'attribut compte
	 * @return compte renvois compte 
	 */
	public Compte getCompte() {
		return compte;
	}

	/** Setter pour l'attribut compte
	 * @param compte the compte sauvegarde la valeur dans compte the compte  
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
}
