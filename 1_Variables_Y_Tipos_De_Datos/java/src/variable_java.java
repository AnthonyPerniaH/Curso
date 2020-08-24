
/////JAVA
//
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class variable_java {


    public static void main(String[] args) {
        int a = 1767575;
        String b = "prueba"; ////solo comillas dobles
        //Integer x = 4;
        /// c = System.out.println("dhsdhshshshsh");
        String d = "texto"+123;
        char e = 't';

        /////System.out.println("dhsdhshshshsh");
        ///System.out.println(b);
List<String> listaString = new ArrayList<String>(Arrays.asList("casa","depto")); //corre igual asi no este identado
        List<Integer> listaEnteros = new ArrayList<Integer>();
        listaEnteros.add(2);
        //System.out.println(listaString);
        //System.out.print(listaString.get(0));
        System.out.print(a+b);
        System.out.println((int) 2.3); //Pero de string a integer generalmente hay problemas
        //System.out.println((int) "vdgdgdgdg");
        String colores [] = new String[4];
        colores[1]="azul";
        colores[2]="verde";
        System.out.println(colores[1]);


        int x = 0;
        while (x < 10){
            System.out.println(x);
            x +=1 ; // x = x+1
        }


        List<String> listaExample = new ArrayList<String>();
        listaExample.add("Anthony");
        listaExample.add("Antonio");
        listaExample.add("Nosequien");
        listaExample.add("Alguien");

        for (String nombres : listaExample){

            System.out.println(nombres);
        }

        System.out.println("------------");

        for(int n=0; n<listaExample.size(); n++){

            System.out.println(listaExample.get(n));
        }



    }

}
