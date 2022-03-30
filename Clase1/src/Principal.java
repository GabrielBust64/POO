import java.util.ArrayList;
import java.util.Random;
//
public class Principal {
    public static void main(String[] args) {
/*        int[] jug1 = new int[3];
*/
        int[] jug2 = new int[3];
        Random r = new Random();
        ArrayList<Carta> mazo = new ArrayList<>();
        generarMazo(mazo, 1);
        ArrayList<Carta> mano1 = new ArrayList<>();
        ArrayList<Carta> mano2 = new ArrayList<>();
        sacarCarta(mazo, mano1, 3);
        sacarCarta(mazo, mano2, 3);

        Persona jugador1 = new Persona();
        Persona jugador2 = new Persona();
        int temp;

 /*       for(int i = 0; i < jugador1.length; i++){
            temp = r.nextInt(cartas.length);
            if(cartas[temp] == 0){
                i=i-1;
            }else{
                jug1[i] = cartas[temp];
                System.out.println("jug1 = " + jug1[i]);
                cartas[temp]= 0;
            }
        }
        for(int i = 0; i < jug2.length; i++){
            temp = r.nextInt(cartas.length);
            if(cartas[temp] == 0){
                i=i-1;
            }else{
                jug2[i] = cartas[temp];
                System.out.println("jug2 = " + jug2[i]);
                cartas[temp]= 0;
            }


        }
        System.out.println("Jugador 1 " + (jug1[0] + jug1[1] + jug1[2]));
        System.out.println("Jugador 2 " + (jug2[0] + jug2[1] + jug2[2]));

        calcularGanador((jug1[0] + jug1[1] + jug1[2]),(jug2[0] + jug2[1] + jug2[2]));

    }

    private static void calcularGanador(int j1, int j2) {
        if(j1>20){
            System.out.println("Jugador 1 Pierde");
            System.out.println("Jugador 2 Gana");
        }else if(j1>j2){
            System.out.println("Jugador 1 Gana");
        }
        if(j2>20){
            System.out.println("Jugador 2 Pierde");
            System.out.println("Jugador 1 Gana");
        }else if(j1<j2){
            System.out.println("Jugador 2 Gana");
        }
        if(j1==j2){
            System.out.println("Empate");
        }

  */
    }

    private static void sacarCarta(ArrayList<Carta> mazo, ArrayList<Carta> mano, int tamMano) {
        Random num = new Random();
        for (int i = 0; i < tamMano; i++) {
            int numero = num.nextInt(mazo.size());
            mano.add(mazo.get(numero));
            mazo.remove(numero);
        }
    }

    private static void generarMazo(ArrayList<Carta> mazo, int cantMazos) {
        String[] pintas = {"Trebol", "Diamante", "Corazon", "Pica"};
        int[] valores = {11,2,3,4,5,6,7,8,9,10,10,10,10};
        String[] simbolo = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int l = 0; l < cantMazos; l++){
            for (int i = 0; i < pintas.length; i++) {
                for (int j = 0; j < valores.length; j++) {
                    mazo.add(new Carta(pintas[i], valores[j], simbolo[j]));
                }
            }
        }

    }


}
