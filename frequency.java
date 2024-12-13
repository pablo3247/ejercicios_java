import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {

        HashMap<String,Integer> frequencia = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        String palabra=" ";

        int contador=0;

        while(palabra!=""){

            palabra = sc.nextLine();

            if(palabra!=""){

                if(frequencia.containsKey(palabra)){
                    contador++;
                }else {
                    contador=1;
                }
            frequencia.put(palabra,contador);
            }
        }

        for (String i:frequencia.keySet()) {
            System.out.println(i+" - "+ frequencia.get(i));
        }

    }
}
