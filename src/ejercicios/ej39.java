package ejercicios;

import java.util.Scanner;

public class ej39 { public static final Scanner teclado = new Scanner(System.in);
public static final int CANT_MAX_TIROS = 3;
public static final int CANT_MIN_PARTICIPANTES = 2;
public static final int PUNTOS_MAX = 500;
    public static final int PUNTOS_MED = 250;
    public static final int PUNTOS_MIN = 100;
    public static final int SIN_PUNTOS = 0;
    public static void main(String[] args) {
        String nombre;
        String nombreGanador = "";
        int distancia;
        int acuPuntaje = 0;
        int cantParticipantes;
        int puntos;
        int ptosMax = -1;
        int contTirosAlCentro = 0;

        do {
            System.out.println("Ingrese la cantidad de participntes: ");
            cantParticipantes = teclado.nextInt();
        } while (cantParticipantes < CANT_MIN_PARTICIPANTES);


        teclado.nextLine();
        for (int i = 1; i <= cantParticipantes; i++) {
            System.out.println("Ingrese nombre del participante: ");
            nombre = teclado.nextLine();

            acuPuntaje = 0;
            for (int j = 1; j <= CANT_MAX_TIROS; j++) {
                do {
                    System.out.println("Ingese la distancia al centro del tiro " + i + ": ");
                    distancia = teclado.nextInt();
                } while(distancia < 0);


                if (distancia == 0) {
                    puntos = PUNTOS_MAX;
                    contTirosAlCentro++;
                }
                else if (distancia > 0 && distancia <= 10) {
                    puntos = PUNTOS_MED;
                }
                else if (distancia > 10 && distancia <= 50) {
                    puntos = PUNTOS_MIN;
                }
                else {
                    puntos = SIN_PUNTOS;
                }

                acuPuntaje += puntos;
            }

            teclado.nextLine();
            if (acuPuntaje > ptosMax) {
                ptosMax = acuPuntaje;
                nombreGanador = nombre;
            }

        }

        System.out.println("El ganador es: " + nombreGanador + " con " + ptosMax + " puntos.");
        System.out.println("Cantidad de tiros al centro: " + contTirosAlCentro);



    }


}
