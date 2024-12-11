import java.util.ArrayList;
import java.util.HashMap;

public class laMejorTerminacion {
    public static void main(String[] args) {

        ArrayList<String> boletos = new ArrayList<>();

        HashMap<Character, Integer> contados = new HashMap<>();

        ArrayList<Character> repetidos= new ArrayList<>();

        boletos.add("25894");
        boletos.add("58977");
        boletos.add("25894");


        int contador;
        char numeroFinal;
        char numeroFinal2;

        for (int i = 0; i < boletos.size(); i++) {
            numeroFinal = boletos.get(i).charAt(boletos.get(i).length() - 1);
            contador=0;

            if (!repetidos.contains(numeroFinal)) {

            for (int j = i; j < boletos.size(); j++) {


                numeroFinal2 = boletos.get(j).charAt(boletos.get(j).length() - 1);

                //System.out.println(numeroFinal + "---" + numeroFinal2);
                if (numeroFinal == numeroFinal2) {
                    contador++;
                }

                contados.put(numeroFinal, contador);

            }
        }

            repetidos.add(numeroFinal);
        }

        System.out.println(contados);

    }
}