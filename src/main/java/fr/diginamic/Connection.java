package fr.diginamic;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		Virement op = new Virement();
		op.setMontant(100);
		op.setMotif("Il n'a pas d'agent");
		op.setBeneficiaire("Paul");
		
		em.persist(op);
		
		
		Banque b = new Banque();
		b.setNom("CreditAbricot");
		
		em.persist(b);
		
		
		Adresse adr = new Adresse();
		//1,"Rue Labas",33489,"Imagin"
		adr.setNumero(1);
		adr.setCodePostal(33489);
		adr.setRue("Rue Labas");
		adr.setVille("Imagin");
		
		Client c1 = new Client();
		c1.setNom("Jean");
		c1.setPrenom("Mic");
		c1.setAdr(adr);
		c1.setDateNaissance(new Date(99, 10, 20));
		
		/*b.getClients().add(c1);
		em.persist(b);*/
		
		LivretA compte1 = new LivretA();
		compte1.setNumero("12455");
		compte1.setSolde(1000000);
		compte1.getListOperation().add(op);
		compte1.setTaux(10);
		op.setCompte(compte1);
		em.persist(compte1);
		em.persist(op);
		c1.setBanque(b);
		c1.getCompteC().add(compte1);
		
		em.persist(c1);
		
		
		
		transaction.commit();
		
	}

}
