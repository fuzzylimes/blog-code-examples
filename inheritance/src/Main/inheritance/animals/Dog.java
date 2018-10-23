package inheritance.animals;

public class Dog extends Animal {
    private String breed;

    public Dog() {
        setSpecies("K9");
        setLegs(4);
        setSound("Woof!");
    }

    public Dog(String breed) {
        this();
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
