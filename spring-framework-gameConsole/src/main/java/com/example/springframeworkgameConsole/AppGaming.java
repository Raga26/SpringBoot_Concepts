package com.example.springframeworkgameConsole;

public class AppGaming {

    public static void main(String[] args) {
        var mariogame = new MarioGame();
        var gameRunner = new GameRunner(mariogame);
        gameRunner.run();

    }
}
