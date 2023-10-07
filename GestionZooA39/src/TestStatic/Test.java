package TestStatic;

public class Test {


    public static void main(String[] args) {
        Personne p1=new Personne();
        System.out.println("Le nombre :"+Personne.getComp());
        Personne p2=new Personne(2);
        System.out.println("Le nombre :"+Personne.getComp());
        Personne p3=new Personne(3,"n","pr");
        System.out.println("Le nombre :"+Personne.getComp());
        Test t=new Test();


       // System.out.println(Personne.comp++);

        System.out.println(Personne.getComp());



    }
}
