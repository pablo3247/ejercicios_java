import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int num=1;

        while(num >= 0){

            num= sc.nextInt();
            if(num >0){
                numeros.add(num);
            }
        }

        numeros.stream()
        .filter(value -> value > 0 && value <=5)
        .forEach(value -> System.out.println(value));

    }
}
