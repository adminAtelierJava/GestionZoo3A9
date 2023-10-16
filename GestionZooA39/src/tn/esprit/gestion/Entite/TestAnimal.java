package tn.esprit.gestion.Entite;

public class TestAnimal {

    public static void main(String[] args) {
        System.out.println("Dolp");
        Dolphin d1=new Dolphin();
        System.out.println("Terrs");
        Terrestre ter1=new Terrestre();

        Terrestre ter2=new Terrestre(1,"chat","couc",true,4);

        System.out.println(ter2);
        Aquatic aqu1=new Aquatic(1,"Poisson","Poisson",false,"mer");

        System.out.println(aqu1);


        System.out.println(d1);

        aqu1.testToString();

        Penguin p1=new Penguin();

        aqu1.swim();
        d1.swim();
        p1.swim();

    }
}
