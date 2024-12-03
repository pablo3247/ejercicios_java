import java.util.ArrayList;
import java.util.Scanner;

public class coches {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String marca = " ";
        while(!marca.equals("")){
            System.out.println("Dime una marca de coche!");
            marca = sc.nextLine();

            if(!marca.equals("")){
                coches.add(marca);
            }
        }

        for(String coche:coches){
            System.out.println(coche);
        }

    }
}
