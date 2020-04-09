/**
 * Methods
 */
public class Methods {

    public static void main(String[] args) {
        calculateScores(true, 800, 5, 100);
        calculateScores(true, 10000, 8, 200);

        String playerName = "Person 1";
        int playerPosition = calculateHighScorePosition(1500);
        displayHighScore(playerName, playerPosition);

        playerName = "Person 2";
        playerPosition = calculateHighScorePosition(900);
        displayHighScore(playerName, playerPosition);

        playerName = "Person 3";
        playerPosition = calculateHighScorePosition(400);
        displayHighScore(playerName, playerPosition);

        playerName = "Person 4";
        playerPosition = calculateHighScorePosition(50);
        displayHighScore(playerName, playerPosition);

        playerName = "Person 5";
        playerPosition = calculateHighScorePosition(1000);
        displayHighScore(playerName, playerPosition);
    }

    public static int calculateScores(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("User Final Score: " + finalScore);
            return finalScore;
        }

        return -1;

    }

    /*
     * Challenge 1st Method: displayHighScore, params {playerName, playerPosition}
     * Returns "Player has managed to get to position on the highscore table"
     *
     * 2nd Method: calculateHighScorePosition, params {playerScore} Returns Int
     * Positions: 1 if score > 1000 2 if score 1000 > x < 500, 3 if score 500 > x >
     * 100 4 in all other cases Check for 1500, 900, 400, 50
     */

    public static void displayHighScore(String playerName, int playerPosition) {
        System.out.println(playerName + " is at position " + playerPosition + " on the leaderboard");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int playerPostion = 4;

        if (playerScore >= 1000) {
            playerPostion = 1;
        } else if (playerScore >= 500) {
            playerPostion = 2;
        } else if (playerScore >= 100) {
            playerPostion = 3;
        }

        return playerPostion;

    }

}