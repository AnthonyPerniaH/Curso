import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Funcion_dia {

    public static void main(String[] args) {
        System.out.println(new Funcion_dia().queMesEs(1));
        System.out.println(new Funcion_dia().queDiaEs(5));
        System.out.println(new Funcion_dia().fecha(4,7));
    }

    public String queMesEs(int dia){
        ArrayList listaString = new ArrayList<String>(Arrays.asList("enero","febrero","marzo","abril",
                "mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"));
        return (String) listaString.get(dia);
    }

    public String queDiaEs(int mes){
        String  meses [] = new String[7];
        meses[0] = "Lunes";
        meses[1] = "Martes";
        meses[2] = "Miercoles";
        meses[3] = "Jueves";
        meses[4] = "Viernes";
        meses[5] = "Sabado";
        meses[6] = "Domingo";
        return meses[mes];
    }

    public List fecha(int dia, int mes){

        return new ArrayList(Arrays.asList(queDiaEs(dia),queMesEs(mes)));
    }





}
