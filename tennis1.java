import java.util.*;
public class tennis1 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String points = "AAAAAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBB";
        String result = calculateTennisGame(points);
        System.out.println(result);
    }

    public static String calculateTennisGame(String points) {
        int set1Games = 0;
        int set2Games = 0;
        int gamePoints = 0;

        for (int i = 0; i < points.length(); i++) {
            if (points.charAt(i) == 'A') {
                gamePoints++;
            } else if (points.charAt(i) == 'B') {
                gamePoints--;
            }
            System.out.println(gamePoints);

            if (gamePoints >= 4) {
                set1Games++;
                gamePoints = 0;
            } else if (gamePoints <= -4) {
                set2Games++;
                gamePoints = 0;
            }
        }

        String set1Score = Integer.toString(set1Games);
        String set2Score = Integer.toString(set2Games);

        // Determine the status of the match
        if (set1Games == 6 && set2Games == 0) {
            return set1Score + "-0, 0-0\nFirst set goes to A";
        } else if (set1Games == 6 && set2Games >= 1) {
            return set1Score + "-0, " + set2Score + "-0\nFirst set goes to A\nMatch is in progress";
        } else if (set1Games >= 1 && set2Games >= 1) {
            return set1Score + "-0, " + set2Score + "-0\nMatch is in progress";
        }

        return null;
    }
}