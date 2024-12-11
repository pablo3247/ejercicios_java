import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class telefonos2 {
    public static void main(String[] args) {


        HashMap<String, ArrayList<String>> agenda = new HashMap<>();


        ArrayList<String> telefonos = new ArrayList<>();

        telefonos.add("667761");
        telefonos.add("+0034 44001");

        agenda.put("Pepe", telefonos);


        telefonos = new ArrayList<>();

        telefonos.add("94884");
        telefonos.add("34535");

        agenda.put("Juan", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("7778834");

        agenda.put("Jose",telefonos);

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un contacto!");
        String persona = sc.nextLine();

        System.out.println(agenda.get(persona));


    }
}