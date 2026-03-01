package com.ebac.git;

public class GitContext {
    static void main() {
        PingPong pong = new PingPong();

        pong.presentation();
        pong.newGame();
        System.out.println("¡Adios!");
    }
}
