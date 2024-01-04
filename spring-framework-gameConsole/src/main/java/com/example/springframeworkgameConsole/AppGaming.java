package com.example.springframeworkgameConsole;

public class AppGaming {

    public static void main(String[] args) {
        //var mariogame = new MarioGame();
        var PacmanGame = new PacmanGame();
        var gameRunner = new GameRunner(PacmanGame);
        gameRunner.run();

    }
}
