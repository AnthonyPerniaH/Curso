import java.util.ArrayList;
import java.util.List;

public class clase_1 {

    public static void main(String[] args) {
        int a= 64;

        if (a>60){
            System.out.println("Es es mayor");
        }else {
            System.out.println("no es mayor");
        }

        System.out.println("esto siempre se va a ejecutar");

        List<String> array = new ArrayList<>();
        array.add("hola");
        array.add("mundo");
        array.add(28);
        System.out.println(array);
    }
}
