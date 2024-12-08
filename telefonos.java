import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class telefonos {
    public static void main(String[] args) {

        Map<String,String> agenda = new HashMap<String, String>();

        agenda.put("Emergencias","112");
        agenda.put("Policia","092");
        agenda.put("GuardiaCivil","062");
        agenda.put("Maltrato","016");

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un contacto!");
        String contacto = sc.nextLine();

        System.out.println("Su numero es "+ agenda.getOrDefault(contacto,"No existe"));


    }
}
