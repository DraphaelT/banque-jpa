package fr.diginamic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Banque")
public class Banque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NOM", length = 50, nullable = false)
	private String nom;
	
	@OneToMany(mappedBy="banque")
	private List<Client> clients = new ArrayList<Client>();

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

	/** Getter pour l'attribut clients
	 * @return clients renvois clients 
	 */
	public List<Client> getClients() {
		return clients;
	}

	/** Setter pour l'attribut clients
	 * @param clients the clients sauvegarde la valeur dans clients the clients  
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	
	
}
