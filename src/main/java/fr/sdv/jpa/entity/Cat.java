package fr.sdv.jpa.entity;

import javax.persistence.Entity;

@Entity
public class Cat extends Animal{

    // Variable
    private String chipId;

    // CONSTRUCTOR
    public Cat() {
    }

    public Cat(String chipId) {
        this.chipId = chipId;
    }

    // GETTER / SETTER
    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "chipId='" + chipId + '\'' +
                '}';
    }
}
