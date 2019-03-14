package fr.rbo.homeshop;

public class Product {
    private String name;
    private String description;
    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Affiche la description complète du produit
     */
    public void look(){
        System.out.println(String.format(name + " : " + price + "%n" + description));
    }

    /**
     * Ajoute le produit à la facture
     * @param bill la facture concernée
     * @param quantity la quantite à ajouter
     */

    public void buy(Bill bill, Integer quantity) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
