import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Auto [] arregloAuto = new Auto[3];
        Auto auto1 = new Auto("placa1","Carlos",2008);
        Auto auto2 = new Auto("placa2","Juan",2013);
        Auto auto3 = new Auto("placa3","Ana",2005);
        Auto auto4 = new Auto("placa4","Maria",2019);

        for (int i=0; i<3;i++) {
            arregloAuto[i] = auto1;
        }

        System.out.println("La placa del auto 3 es: "+arregloAuto[2].getPlaca());
        
        List<Auto> listaAutos = new ArrayList<>();
        listaAutos.add(auto1);
        listaAutos.add(auto2);
        listaAutos.add(auto3);
        listaAutos.add(auto4);

        System.out.println("La placa del auto 3 es: "+listaAutos.get(1).getPlaca());

        Map<Integer,Auto> mapAutos = new HashMap<>();
        mapAutos.put(3,auto1);
        mapAutos.put(100,auto1);
        mapAutos.put(4,auto1);
        mapAutos.put(30000,auto1);

        System.out.println("La placa del auto 3 es: "+mapAutos.get(100).getPlaca());

    }
}