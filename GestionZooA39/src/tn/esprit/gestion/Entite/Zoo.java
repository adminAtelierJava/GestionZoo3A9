package tn.esprit.gestion.Entite;

public class Zoo {

   private String name,city;
   private int nbrCages;
  private  int nbrAnimal=0;
   private Animal [] animals;

   private static final int MAX_AQU=10;
   private Aquatic [] tabAqua=new Aquatic[MAX_AQU];
    private static int nbTotalAn;

    private int nbAqua=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zoo(int nbrCages, String name, String city)
    {

        this.nbrCages=nbrCages;
        this.name=name;
        this.city=city;

        animals=new Animal[nbrCages];

    }
    public Zoo()
    {
        animals=new Animal[25];
    }

    public boolean addAnimal(Animal a)
    {
        if(searchAnimal(a)!=-1)
            return false;


        if(!isFull()) return false;
        animals[nbrAnimal]=a;
        nbrAnimal++;
        nbTotalAn++;
            System.out.println(nbrAnimal);

        return true;
    }

    public void addAqua(Aquatic a)
    {
        if(nbAqua<MAX_AQU)
        {
            tabAqua[nbAqua]=a;
            nbAqua++;
            System.out.println("Animal Aquatic ajouté");
        }
        else{
            System.out.println("le zoo est plein");
        }

    }
    public void displayAqu()
    {
        for (int i=0;i<nbAqua;i++)
        {
            System.out.println(tabAqua[i].toString());
        }
    }

    public void testSwim()
    {
        for (int i=0;i<nbAqua;i++)
        {
            tabAqua[i].swim();
        }
    }
    public static int nbTotal()
    {

        return nbTotalAn;
    }
    public void display()
    {

        System.out.println("city :"+city+" name :"+name);
        for (int i=0;i<animals.length;i++) {
            if (animals[i]!=null)
            System.out.println(animals[i].getName());
        }
    }

    public  String toString()
    {
        String str="Les animaux :\n";
        //for (int i=0;i<nbrAnimal;i++)
          //str+=animals[i]+"\n";
   for (Animal a:animals) {
       if(a!=null)
       str += a + "\n";
   }
        return "city :"+city+" name :"+name+"\n"+str;
    }

    public int searchAnimal(Animal a)
    {

        for(int i=0;i<nbrAnimal;i++)
        {

            if(animals[i].getName()==a.getName())
                return i;
        }
        return -1;
    }
    public boolean removeAnimal(Animal a)
    {

        int indexAnimal=searchAnimal(a);
        if (indexAnimal==-1)
            return false;
        for (int i=indexAnimal;i<nbrAnimal;i++)
            animals[i]=animals[i+1];
        animals[nbrAnimal]=null;
        this.nbrAnimal--;
        return true;
    }
    public Zoo comparerZoo(Zoo z1)
    {
      if(this.nbrAnimal>z1.nbrAnimal)
          return this;
      else if(this.nbrAnimal<z1.nbrAnimal)
      return z1;
      return null;

    }
    public static Zoo comparerZoo(Zoo x,Zoo z2)
    {
        if(z2.nbrAnimal>x.nbrAnimal)
            return z2;
        else if(z2.nbrAnimal<x.nbrAnimal)
            return x;
        return null;
    }


    public boolean isFull()
    {
        if(nbrAnimal==animals.length)
            return true;
        return false;
    }
    /*public float maxPenguinSwimmingDepth()
    {

        for (int i=0;i<nbAqua;i++)
        {
            tabAqua[i].
        }
    }*/

    public void nbrAquaParType()

    {
        int nbPen=0,nbDol=0;
        for (int i=0;i<nbAqua;i++)
        {
          if (tabAqua[i] instanceof Penguin)
              nbPen++;
          if (tabAqua[i] instanceof Dolphin)
              nbDol++;
        }
        System.out.println("Le nombre de penguin :"+nbPen);
        System.out.println("Le nombre de Doplphin"+nbDol);
    }
}
