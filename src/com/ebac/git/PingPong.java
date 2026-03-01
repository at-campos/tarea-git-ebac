package com.ebac.git;

import java.util.Scanner;

public class PingPong {
    public void presentation(){
        System.out.println("Reglas del juego:");
        System.out.println("Introduce 'ping' para dar un raquetazo. La maquina responderá.");
        System.out.println("Cualquier otra respuesta va a tomarse como un tiro errado. 3 tiros y estás fuera.");
        System.out.println("Introduce 'salir' para finalizar la partida.");
    }
    public void newGame(){
        Scanner scan = new Scanner(System.in);
        String str = "";
        int missed = 0;

        while (!str.toLowerCase().equals("salir") && missed < 3){
            str = scan.nextLine();
            if (str.toLowerCase().equals("ping")){
                System.out.println("¡Pong!");
            } else {
                System.out.println("¡Errado!");
                missed += 1;
            }
        }
        System.out.println("¡Fin del juego!");
    }

}
