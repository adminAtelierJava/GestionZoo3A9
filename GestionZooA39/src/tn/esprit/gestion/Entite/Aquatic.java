package tn.esprit.gestion.Entite;

public  abstract sealed class Aquatic extends Animal permits Dolphin,Penguin{
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
    public abstract void swim();


//public  abstract void testPol();


    public boolean equals(Object o)
    {
        if(this==o) return true;
        if(o==null) return false;
        if(o.getClass()!=this.getClass()) return false;

        Aquatic aq=(Aquatic) o;
        if (aq.family==this.family&&aq.age==this.age)
            return true;
        return false;

    }
}
