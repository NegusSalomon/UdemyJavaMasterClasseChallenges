/*
    If the game is over ( gameOver = true) :
    Print out a score on the screen with this formula : score + ( levelCompleted * bonus )
    Score set to 10000
    levelCompleted set to 8
    bonus set to 200
 */

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println(finalScore);
        }
    }
}
