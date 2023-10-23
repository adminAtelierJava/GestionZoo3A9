package tn.esprit.gestion.Entite;

public non-sealed class Penguin extends Aquatic{
    private float swimmingDepth;

public Penguin(){}
public Penguin(int age,String fam,String habit,float swi)

{
   super(age, fam, habit);
   swimmingDepth=swi;
}

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    public String toString()
    {
        return "Penguin :"+super.toString()+" Swiming depth :"+swimmingDepth;
    }
    public void swim(){
        System.out.println("This penging animal is swimming.");
    }
}
