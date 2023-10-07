package TestStatic;

public class Personne {

    int id;
    String nom,prenom;

   private static int comp;


   public static int getComp()
   {

       return comp;
   }
    public Personne()
    {
     comp++;
    }
    public  Personne(int id)
    {
       this.id=id;
       comp++;
    }
    public Personne(int id,String n,String p)
    {

        this.id=id;
        nom=n;
        prenom=p;
        comp++;
    }
}
