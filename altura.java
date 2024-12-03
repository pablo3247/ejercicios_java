import java.util.ArrayList;
import java.util.Scanner;

public class altura {
    public static void main(String[] args) {
        ArrayList<Double> alturas = new ArrayList<Double>();
        double media = calcularMedia(leerAlturas(numeroAlumnos(),alturas));
        mostrarResultados(alturas,media);
    }

    public static int numeroAlumnos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos alumnos hay!?");
        return sc.nextInt();
    }

    public static ArrayList<Double> leerAlturas(int numeroAlumnos,ArrayList<Double> alturas){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.println("Dime la altura del alumno "+ (i+1) +"!");
            alturas.add(sc.nextDouble());
        }
        return alturas;
    }

    public static double calcularMedia(ArrayList<Double> alturas){

        double total =0.0;
        for(Double altura:alturas){
            total = total + altura;
        }
        return total/alturas.size();
    }

    public static int calcularAlumnosAlturaSuperio(ArrayList<Double> alturas,double media){
        int contador=0;
        for (double altura:alturas){
            if(altura>media){
                contador++;
            }
        }
        return contador;
    }

    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas,double media){
        int contador=0;
        for (double altura:alturas){
            if(altura<media){
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultados(ArrayList<Double> alturas,double media){
        System.out.print("Todas las alturas: ");
        for(double altura:alturas){
            System.out.print(altura+"cm, ");
        }
        System.out.println();
        //System.out.println("Media: "+media);
        System.out.println("Alumnos altos "+ calcularAlumnosAlturaSuperio(alturas,media));
        System.out.println("Alumnos bajos "+ calcularAlumnosAlturaInferior(alturas,media));
    }
}
