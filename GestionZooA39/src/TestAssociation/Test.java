package TestAssociation;

public class Test {
    public static void main(String[] args) {
        Projet p1=new Projet("uml");
        System.out.println(p1);

        Develpper de1=new Develpper("sana");
        Projet p2=new Projet("java",de1);

        System.out.println(p2);
        System.out.println();
    }
}
