package tn.esprit.gestion.Entite;

public  class Aquatic extends Animal{
protected String habitat;

public Aquatic(){

    System.out.println("je suis Animal Aquatic");
}

    public Aquatic(int age,String fam,String habit)
    {
        super(age,fam);
        habitat=habit;

    }
    public Aquatic(int age,String fam,String name,boolean isMa,String ha)
    {
        super(age,fam,name,isMa);
        habitat=ha;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String toString()
    {
        return "Aquatic "+super.toString()+" Habitat :"+habitat;
    }

    public void testToString()
    {
        System.out.println("this :"+toString());
        System.out.println("super :"+super.toString());
    }
    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }
}
