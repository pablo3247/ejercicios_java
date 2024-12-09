import java.util.*;

public class repartiendoRegalos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        ArrayList<Integer> portales = new ArrayList<>();
        int numeroPortal =0;
        ArrayList<Integer> pasados = new ArrayList<>();

        //Pedir el portal en que aterriza!
        System.out.println("En que portal aterriza?! 🎅");
        int inicio = sc.nextInt();

        //Pedir los portales que visita!

        while(numeroPortal!=-1){
            System.out.println("Dime los portales! (-1 para acabar)");
             numeroPortal = sc1.nextInt();
            if(numeroPortal!= -1) {
                portales.add(numeroPortal);
            }
        }

        Collections.reverse(portales);
        //System.out.println(portales);


        int distancia=0;
        int cercano= Integer.MAX_VALUE;
        int portalCercano= inicio;

        int contador=0;

        int i = inicio;

        while(true) {


            contador++;
            if(contador>portales.size()){
                break;
            }

            //se cambia el valor de i!

            cercano= Integer.MAX_VALUE;

            pasados.add(portalCercano);

            //System.out.println("El valor de i!! es !!"+i);
            for (int j = 0; j < portales.size(); j++) {


                    distancia = i - portales.get(j);


                //Pasar restas negativas a positivo para hacer la comprobacion!
                if(distancia<0){
                    distancia= distancia*-1;
                }

                //System.out.println("Se repite??"+pasados.contains(portalCercano));
                if(cercano>distancia && distancia != 0 ){



                    if(!pasados.contains(portales.get(j))) {

                        cercano = distancia;

                        portalCercano = portales.get(j);
                    }

                }


                //System.out.println(i+"--"+ portales.get(j));
                //System.out.println(distancia);


            }

            //System.out.println(cercano);
            System.out.print(portalCercano+"\uD83C\uDF81, ");
            i = portalCercano;
            //System.out.println("-------");



        }

        //System.out.println(pasados);




    }
}