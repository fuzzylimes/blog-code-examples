package inheritance.animals;

abstract public class Animal {
    private int legs;
    private String sound;
    private String species;

    public Animal() {

    }

    public String makeSound() {
        return "The " + getSpecies() + " goes " + getSound();
    }

    abstract public boolean hasLegs();

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
