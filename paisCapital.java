import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class paisCapital {
    public static void main(String[] args) {

        Map<String, String> capitales = new HashMap<String, String>();

        capitales.put("España", "Madrid");
        capitales.put("Francia", "Paris");
        capitales.put("Roma", "Italia");
        capitales.put("Paises Bajos", "Amsterdam");
        capitales.put("Polonia", "Varsovia");

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un pais!");
        String pais = sc.nextLine();
        System.out.println("Su capital es "+ capitales.getOrDefault(pais,"Vuelve a intentarlo!"));

    }
}
