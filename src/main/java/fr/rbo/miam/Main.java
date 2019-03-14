package fr.rbo.miam;

public class Main {
    public static void main(String[] args) {
        Four grandFour = new Four();
        grandFour.setCapacite(50);
        grandFour.setCapacite(240);

        Aliment cake = new Aliment();
        cake.nom = "cake aux fruits";
        cake.estCuit = false;
        cake.manger();
        System.out.println("");
        grandFour.cuire(cake);
        System.out.println("");
        cake.manger();
    }
}
