package Inheritance;

import java.util.SplittableRandom;

public class DomesticAnimal extends Animal{
    // Animal class is a parent or super-class
    // DomesticAnimal is a child or sub-class
    //In Inheritance a sub-class inherits all members (static-non-static)
    // from parent class. this creates a class to class relations

    String region;
    double value;

    public static void main(String[] args) {
        Animal a = new Animal();
        //It is only creating an object of a class

        DomesticAnimal da = new DomesticAnimal();
        da.age = 12;
        da.region = "South Asina";
        da.value = 15000;
        da.feed();
        da.move();
        Animal.planet = "Earth"; //static member are also inherited..
        DomesticAnimal.planet = "Earth";
        Animal.breathe();
        DomesticAnimal.breathe();
        //Ability to access the properties defined by parent class
        //as its own by child class is called inheritance
         Animal ad = new DomesticAnimal();
         // As DomesticAnimal is also an Animal, we can assign child object to parent reference

        ad.age = 15;
        // ad.region = "Mountaneous";
        // when we put an object of a child class into parent class references.
        // then the child object is cast to a type of parent,
        // so only the features defined by the parent are accessible

        // DomesticAnimal daa = new Animal();
        // Not all animals are domestic animal
        // The super-class object can not initialize all members of sub-class
        // so we cannot assign super class object into subclass refernces




    }
}
