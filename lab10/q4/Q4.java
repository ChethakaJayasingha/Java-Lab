package com.mycompany.q4;

public class Q4 {

    public static void main(String[] args) {
        Player regularPlayer = new RegularPlayer();
        regularPlayer.moveUp();
        regularPlayer.moveDown();
        regularPlayer.moveLeft();
        regularPlayer.moveRight();

        Player oppositePlayer = new OppositePlayer();
        oppositePlayer.moveUp();
        oppositePlayer.moveDown();
        oppositePlayer.moveLeft();
        oppositePlayer.moveRight();

        Player jumpingPlayer = new JumpingPlayer();
        jumpingPlayer.moveUp();
        jumpingPlayer.moveDown();
        jumpingPlayer.moveLeft();
        jumpingPlayer.moveRight();

        Player crouchingPlayer = new CrouchingPlayer();
        crouchingPlayer.moveUp();
        crouchingPlayer.moveDown();
        crouchingPlayer.moveLeft();
        crouchingPlayer.moveRight();
    }
}
