package tn.esprit.gestion.Entite;

public class TestAnimal {

    public static void main(String[] args) {
        System.out.println("Dolp");
        Dolphin d1=new Dolphin();
        System.out.println("Terrs");
        Terrestre ter1=new Terrestre();

        Terrestre ter2=new Terrestre(1,"chat","couc",true,4);

        System.out.println(ter2);
       // Aquatic aqu1=new Aquatic(1,"Poisson","Poisson",false,"mer");

       // System.out.println(aqu1);


        System.out.println(d1);

       // aqu1.testToString();

        Penguin p1=new Penguin();

      //  aqu1.swim();
        d1.swim();
        p1.swim();


        Penguin pen1=new Penguin(2,"fam1","hab1",4);

        Dolphin dol1=new Dolphin(3,"fam2","habita2",45);
        Dolphin dol3=new Dolphin(3,"fam3","habita2",45);
        Penguin pen3=new Penguin(3,"fam3","hab1",4);


        Zoo z1=new Zoo();
    z1.addAqua(pen1);
    z1.addAqua(dol1);
    //z1.addAqua(aqu1);
        System.out.println("test aquatic toString");
    z1.displayAqu();
        System.out.println("test de la méthode swim");
        z1.testSwim();


        Aquatic aqu1=new Dolphin(2,"fam1","hab1",4);

        aqu1.swim();

        if(aqu1 instanceof Dolphin) {
            Dolphin dol2 = (Dolphin) aqu1;


            System.out.println("nombre de swimg " + dol2.getSwimmingSpeed());
        }else {
            System.out.println("ce n'est pas un doplpin");
        }
        System.out.println("Habitat :"+aqu1.habitat);

        if(aqu1 instanceof Penguin) {
            //Penguin penguin1 = (Penguin) aqu1;
            //System.out.println("Swiming depth"+penguin1.getSwimmingDepth());
            System.out.println(((Penguin)aqu1).getSwimmingDepth());
        }else{
            System.out.println("ce n'est pas un penguin");
        }

        System.out.println("test equals");
        System.out.println(dol1.equals(dol3));


        String str="abc";

        System.out.println(str.equals(dol1));

        System.out.println(dol1.equals(str));

        System.out.println(dol3.equals(pen3));

        System.out.println(dol3.getClass());
        System.out.println(pen3.getClass());
    }
}
