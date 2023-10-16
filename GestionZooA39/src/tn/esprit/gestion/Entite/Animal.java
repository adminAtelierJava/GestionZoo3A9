package tn.esprit.gestion.Entite;

public  class Animal {
   protected String family,name;
   protected int age;
    protected boolean isMammal;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMammal()
    {
        return isMammal;
    }

    public int getAge()
    {

        return age;
    }
    public void setAge(int age)
    {

        if(age>0)
            this.age=age;
      else  System.out.println("l'age doit être positif");
    }
public Animal(String name,int ag)
{
this.name=name;
age=ag;

}
public Animal(int age,String fam)
{
    age=age;
    family=fam;
}
public  Animal()
{

    System.out.println("Je suis Animal");
}
    public Animal(int age,String fam,String name,boolean isMa)
    {
        this.age=age;
        family=fam;
        this.name=name;
        isMammal=isMa;
    }

    public void affiche()
    {
        System.out.println("age :"+age+" name :"+name+" family :"+family+" isMamal :"+isMammal);
    }

    public  String toString()
    {

     return   "age :"+age+" name :"+name+" family :"+family+" isMamal :"+isMammal;
    }
}
