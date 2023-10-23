package tn.esprit.gestion.Entite;

public final class Terrestre extends Animal{
   private int nbrLegs;

   public Terrestre(){}
   public Terrestre(int age,String fam,int nbLe)
   {

       super(age,fam);
       this.nbrLegs=nbLe;
   }
   public Terrestre(int age,String fam,String name,boolean isMa,int nbL)
   {
       super(age,fam,name,isMa);
       nbrLegs=nbL;
   }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }


    public String toString()
    {
        return  "Terrestre "+ super.toString()+" Nombre Legs :"+nbrLegs;
    }
}
