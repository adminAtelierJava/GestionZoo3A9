package tn.esprit.gestion.Entite;

public non-sealed class  Dolphin extends  Aquatic{
private float swimmingSpeed;


public Dolphin()
{
    System.out.println("je suis doplphin");
}

public Dolphin(int age,String fam,String habit,float sws)
{
    super(age,fam,habit);
    swimmingSpeed=sws;
}

public String toString()
{
    return "Dolphin :"+super.toString()+" swimmingSpeed "+swimmingSpeed+super.name;
}
    public void swim(){
        System.out.println("This dolphin is swimming. ");
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}
