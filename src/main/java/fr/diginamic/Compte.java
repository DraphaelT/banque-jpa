package fr.diginamic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NUMERO", length = 50, nullable = false)
	private String numero;
	
	@Column(name = "NOM", length = 50, nullable = false)
	private int solde;
	
	@OneToMany(mappedBy = "compte")
	private List<Operation> listOperation = new ArrayList<Operation>();

	@ManyToMany
    @JoinTable(name="Compte_Client",
			joinColumns= @JoinColumn(name="ID_Compte", referencedColumnName=
			"ID"),
			inverseJoinColumns= @JoinColumn(name="ID_Client", referencedColumnName=
			"ID")
	)
    public List<Client> clientsC = new ArrayList<Client>();

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

	/** Getter pour l'attribut numero
	 * @return numero renvois numero 
	 */
	public String getNumero() {
		return numero;
	}

	/** Setter pour l'attribut numero
	 * @param numero the numero sauvegarde la valeur dans numero the numero  
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/** Getter pour l'attribut solde
	 * @return solde renvois solde 
	 */
	public int getSolde() {
		return solde;
	}

	/** Setter pour l'attribut solde
	 * @param solde the solde sauvegarde la valeur dans solde the solde  
	 */
	public void setSolde(int solde) {
		this.solde = solde;
	}

	/** Getter pour l'attribut listOperation
	 * @return listOperation renvois listOperation 
	 */
	public List<Operation> getListOperation() {
		return listOperation;
	}

	/** Setter pour l'attribut listOperation
	 * @param listOperation the listOperation sauvegarde la valeur dans listOperation the listOperation  
	 */
	public void setListOperation(List<Operation> listOperation) {
		this.listOperation = listOperation;
	}

	/** Getter pour l'attribut clientsC
	 * @return clientsC renvois clientsC 
	 */
	public List<Client> getClientsC() {
		return clientsC;
	}

	/** Setter pour l'attribut clientsC
	 * @param clientsC the clientsC sauvegarde la valeur dans clientsC the clientsC  
	 */
	public void setClientsC(List<Client> clientsC) {
		this.clientsC = clientsC;
	}


	
}
