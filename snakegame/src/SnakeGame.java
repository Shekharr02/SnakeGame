package SnakeGame;


import javax.swing.*;
public class SnakeGame extends JFrame{

    SnakeGame() {
        super("Snake Game ");
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String args[]){
        new SnakeGame();
    }
}

