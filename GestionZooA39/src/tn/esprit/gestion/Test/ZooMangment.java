package tn.esprit.gestion.Test;

import tn.esprit.gestion.Entite.Animal;
import tn.esprit.gestion.Entite.Zoo;

public class ZooMangment {
    public static void main(String [] arg)
    {

        Animal a1=new Animal();
       System.out.println("family :"+a1.getFamily());
       System.out.println("name :"+a1.getName());
       System.out.println("age :"+a1.getAge());
       System.out.println("mamal =");
       Animal a2=new Animal("Lion",5);
        System.out.println("tn.esprit.gestion.Entite.Animal 2");


        System.out.println("to String");
        a1.affiche();
        a2.affiche();
        System.out.println("to String");
        System.out.println(a2.toString());
        System.out.println(a2);

        System.out.println(a1.toString());
        System.out.println(a1);

        System.out.println("tn.esprit.gestion.Entite.Zoo");
        Zoo zo1=new Zoo(); //name=null,nbrCaages=0,

        Zoo z2=new Zoo(12,"frigua","bouf");
        System.out.println(z2.addAnimal(a2));
        System.out.println(z2.addAnimal(a1));
        System.out.println(z2.addAnimal(a2));
        System.out.println(z2.addAnimal(a2));

        z2.display();
        System.out.println("toString");
        System.out.println(z2);

        System.out.println("remove");
        System.out.println(z2.removeAnimal(a2));
        System.out.println(z2);
        System.out.println("comparer zoo");

        System.out.println(zo1.comparerZoo(z2));

        Zoo z3=new Zoo();
        z3.addAnimal(a1);
        z3.addAnimal(a2);

        System.out.println(Zoo.comparerZoo(z2,z3));

        System.out.println("Le nombre "+Zoo.nbTotal());

    }
}
