import java.util.ArrayList;
import java.util.HashMap;

public class botin {
    public static void main(String[] args) {

        ArrayList<String> billetes = new ArrayList<>();
        ArrayList<String> repartidos = new ArrayList<>();
        HashMap<Integer,ArrayList<String>> reparto = new HashMap<>();

        int participantes =3;

        billetes.add("50");
        billetes.add("20");
        billetes.add("100");
        billetes.add("200");
        billetes.add("500");
        billetes.add("10");
        billetes.add("50");


        int numero =0;
        for (int i = 1; i <= participantes; i++) {

            for (int j = numero; j < billetes.size(); j=j+participantes) {
                repartidos.add(billetes.get(j));
            }

            reparto.put(i,repartidos);

            repartidos = new ArrayList<>();

            numero ++;

        }
        System.out.println(reparto);
    }
}
