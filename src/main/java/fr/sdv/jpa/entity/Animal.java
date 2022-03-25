package fr.sdv.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Variables
    private Long id;
    private LocalDate brith;
    private String color;

    @ManyToOne
    private PetStore petStore;


    // CONSTRUCTOR
    public Animal() {
    }

    public Animal(LocalDate brith, String color) {
        this.brith = brith;
        this.color = color;
    }

    // GETTER / SETTER
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBrith() {
        return brith;
    }

    public void setBrith(LocalDate brith) {
        this.brith = brith;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", brith=" + brith +
                ", color='" + color + '\'' +
                '}';
    }
}
