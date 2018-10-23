package inheritance.animals;

public class Shiba extends Dog {
    public Shiba() {
        super("Shiba-Inu");
    }

    @Override
    public String makeSound() {
       return "The Shiba-Inu goes REEEEEE!";
    }

    public String originalSound() {
        return super.makeSound();
    }
}
