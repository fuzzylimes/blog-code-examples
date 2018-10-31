public class Product {
    private double weightInLbs;
    private String name;

    public Product(double weightInLbs, String name) {
        this.weightInLbs = weightInLbs;
        this.name = name;
    }

    public double getWeightInLbs() {
        return weightInLbs;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "weightInLbs=" + weightInLbs +
                ", name='" + name + '\'' +
                '}';
    }
}
