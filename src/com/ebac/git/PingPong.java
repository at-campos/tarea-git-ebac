package com.ebac.git;

import java.util.Scanner;

public class PingPong {
    public void presentation(){
        System.out.println("Reglas del juego:");
        System.out.println("Introduce 'ping' para dar un raquetazo. La maquina responderá.");
        System.out.println("Cualquier otra respuesta va a tomarse como un tiro errado.");
        System.out.println("Introduce 'salir' para finalizar la partida.");
    }
    public void newGame(){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        while (!str.toLowerCase().equals("salir")){
            if (str.toLowerCase().equals("ping")){
                System.out.println("¡Pong!");
            } else {
                System.out.println("¡Errado!");
            }
            str = scan.nextLine();
        }
        System.out.println("¡Fin del juego!");
    }
}
