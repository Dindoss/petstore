package fr.sdv.jpa;

import fr.sdv.jpa.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class App {

    public static void main( String[] args )
    {
        // EntityManager / Factory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "sdv-petstore-jpa" );
        EntityManager em = emf.createEntityManager();


        // DEBUT TRANSACTION
        em.getTransaction().begin();


        // Création objet Address
        Address uneAdresse = new Address("35", "rue du test", "35000", "Rennes");
        System.out.println("### Création d'une adresse ###");
        em.persist(uneAdresse);

        Address uneAdresse1 = new Address("36", "rue de vitre", "35350", "Vitré");
        System.out.println("### Création d'une adresse ###");
        em.persist(uneAdresse1);

        Address uneAdresse2 = new Address("37", "rue de vannes", "35680", "Vannes");
        System.out.println("### Création d'une adresse ###");
        em.persist(uneAdresse2);


        // Création objet Animal
        Animal unAnimal = new Animal( LocalDate.of(2021, 03, 21), "White");
        System.out.println("### Création d'un animal ###");
        em.persist(unAnimal);

        Animal unAnimal1 = new Animal( LocalDate.of(2022, 04, 22), "Black");
        System.out.println("### Création d'un animal ###");
        em.persist(unAnimal1);

        Animal unAnimal2 = new Animal( LocalDate.of(2023, 05, 23), "Purple");
        System.out.println("### Création d'un animal ###");
        em.persist(unAnimal2);


        // Création objet Cat
        Cat unCat = new Cat("1");
        System.out.println("### Création d'un chat ###");
        em.persist(unCat);

        // Créaton objet Fish
        Fish unFish = new Fish();
        System.out.println("### Création d'un fish ###");
        em.persist(unFish);


        // Création objet PetStore
        PetStore unPetStore = new PetStore("Balle","David");
        System.out.println("### Création d'un PetStore ###");
        em.persist(unPetStore);

        PetStore unPetStore1 = new PetStore("Cube","Oliver");
        System.out.println("### Création d'un PetStore ###");
        em.persist(unPetStore1);

        PetStore unPetStore2 = new PetStore("Baton","Patrick");
        System.out.println("### Création d'un PetStore ###");
        em.persist(unPetStore2);


        // Création objet ProdType
        ProdType unProdType = ProdType.ACCESSORY;
        ProdType unProdType1 = ProdType.CLEANING;
        ProdType unProdType2 = ProdType.FOOD;

        // Création objet Product
        Product unProduct = new Product("REF-01", "produit", unProdType, 35.00);
        System.out.println("### Création d'un Product ###");
        em.persist(unProduct);

        Product unProduct1 = new Product("REF-02", "produit1", unProdType1, 50.00);
        System.out.println("### Création d'un Product ###");
        em.persist(unProduct1);

        Product unProduct2 = new Product("REF-03", "produit2", unProdType2, 70.00);
        System.out.println("### Création d'un Product ###");
        em.persist(unProduct2);

        // Requetes


        // FIN TRANSACTION
        em.getTransaction().commit();

        // Entity Close
        em.close();
        emf.close();
    }

}
