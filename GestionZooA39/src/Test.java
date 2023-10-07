import tn.esprit.gestion.Entite.Animal;

public class Test {

    public static void main(String[] args) {
       int [] tab=new int[3] ;
        System.out.println(tab);

        /*tab[0]=5;
        tab[1]=3;
        tab[2]=12;*/

        for(int i=0;i<3;i++)
            System.out.println(tab[i]);

        int [] tab1={5,13,7,2};
        for(int i=0;i<tab1.length;i++)
            System.out.print(tab1[i]+" ");

        String [] tab2=new String[2];


        tab2[0]="test";
        tab2[1]="tableau";
        for(int i=0;i<tab2.length;i++)
            System.out.println(tab2[i]);

       String [] tab3={"test1","test2","test3"};

       Animal [] tab4=new Animal[3];

       Animal a1=new Animal();
       Animal a2=new Animal(12,"chat");

       tab4[0]=a1;
       tab4[1]=a2;

    }
}
