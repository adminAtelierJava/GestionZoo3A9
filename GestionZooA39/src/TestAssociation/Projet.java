package TestAssociation;

public class Projet {
    String name;

    Develpper dev;

    public Projet(String name)
    {

        this.name=name;
    }
    public Projet(String na,Develpper dev)
    {

        name=na;
        this.dev=dev;
    }
    public String toString()
    {
        return "name :"+name+" Deve "+dev;
    }
}
