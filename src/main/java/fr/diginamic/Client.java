package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Thomas
 *
 */

@Entity
@Table(name="Client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NOM", length = 50, nullable = false)
	private String nom;
	
	@Column(name = "PRENOM", length = 50, nullable = false)
	private String prenom;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	@Embedded
	private Adresse adr;
	
	@ManyToOne
	@JoinColumn(name = "ID_BANQUE")
	private Banque banque;

	@ManyToMany(mappedBy="clientsC")
	public List<Compte> compteC = new ArrayList<Compte>(); 
	
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

	/** Getter pour l'attribut nom
	 * @return nom renvois nom 
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom sauvegarde la valeur dans nom the nom  
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut prenom
	 * @return prenom renvois prenom 
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter pour l'attribut prenom
	 * @param prenom the prenom sauvegarde la valeur dans prenom the prenom  
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter pour l'attribut dateNaissance
	 * @return dateNaissance renvois dateNaissance 
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/** Setter pour l'attribut dateNaissance
	 * @param dateNaissance the dateNaissance sauvegarde la valeur dans dateNaissance the dateNaissance  
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/** Getter pour l'attribut adr
	 * @return adr renvois adr 
	 */
	public Adresse getAdr() {
		return adr;
	}

	/** Setter pour l'attribut adr
	 * @param adr the adr sauvegarde la valeur dans adr the adr  
	 */
	public void setAdr(Adresse adr) {
		this.adr = adr;
	}

	/** Getter pour l'attribut banque
	 * @return banque renvois banque 
	 */
	public Banque getBanque() {
		return banque;
	}

	/** Setter pour l'attribut banque
	 * @param banque the banque sauvegarde la valeur dans banque the banque  
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/** Getter pour l'attribut compteC
	 * @return compteC renvois compteC 
	 */
	public List<Compte> getCompteC() {
		return compteC;
	}

	/** Setter pour l'attribut compteC
	 * @param compteC the compteC sauvegarde la valeur dans compteC the compteC  
	 */
	public void setCompteC(List<Compte> compteC) {
		this.compteC = compteC;
	}

	
	
	
}
