package tn.esprit.gestion.Entite;

public class Dolphin extends  Aquatic{
private float swimmingSpeed;
private String name;

public Dolphin()
{
    System.out.println("je suis doplphin");
}


public String toString()
{
    return "Dolphin :"+super.toString()+" swimmingSpeed "+swimmingSpeed+super.name;
}
    public void swim(){
        System.out.println("This dolphin is swimming. ");
    }
}
