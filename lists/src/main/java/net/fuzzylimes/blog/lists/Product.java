package net.fuzzylimes.blog.lists;

import java.util.Comparator;

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
        return "net.fuzzylimes.blog.lists.Product{" +
                "weightInLbs=" + weightInLbs +
                ", name='" + name + '\'' +
                '}';
    }

    public static Comparator<Product> BYWEIGHT = (o1, o2) -> (int) (o1.getWeightInLbs() - o2.getWeightInLbs());

    /**
     * public static Comparator<Product> BYWEIGHT = new Comparator<Product>() {
     *         public int compare(Product o1, Product o2) {
     *             return (int) (o1.weightInLbs - o2.weightInLbs);
     *         }
     *     };
     */
}
