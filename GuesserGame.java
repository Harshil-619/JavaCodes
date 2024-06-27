import java.util.Scanner; 
class Guesser {
    int guessNum;
    int guessing () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Guesser kindly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}
class Player1 {
    int pguessNum;
    int guessing () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Player1 Kindly guess the number");
        pguessNum=scan.nextInt();
        return pguessNum;
    }
}
class Player2 {
    int pguessNum;
    int guessing () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Player2 Kindly guess the number");
        pguessNum=scan.nextInt();
        return pguessNum;
    }
}
class Player3 {
    int pguessNum;
    int guessing () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Player3 Kindly guess the number");
        pguessNum=scan.nextInt();
        return pguessNum;
    }
}
class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPLayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser ();
        numFromGuesser = g.guessing();
    }
    void collectNumFromPlayer () {
        Player1 p1 = new Player1 ();
        Player2 p2 = new Player2 ();
        Player3 p3 = new Player3();

        numFromPlayer1 = p1.guessing();
        numFromPLayer2 = p2.guessing();
        numFromPlayer3 = p3.guessing();
    }
    void compare () {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPLayer2 && numFromGuesser== numFromPlayer3) {
                System.out.println("Game Tied");
            }
            else if (numFromGuesser==numFromPLayer2) {
                System.out.println("Player 1 and Player 2 are winners");
            }
            else if (numFromGuesser==numFromPlayer3) {
                System.out.println("Player 1 and Player 3 are winners");
            }
            else {
                System.out.println("PLayer 1 Wins");
            }
        }
        else if (numFromGuesser==numFromPLayer2) {
            if (numFromGuesser==numFromPlayer3) {
                System.out.println("Player 2 and Player 3 wins");
            }
            else {
                System.out.println("Player 2 wins");
            }
        }
        else if (numFromGuesser==numFromPlayer3) {
            System.out.println("Player 3 wins");
        }
        else {
            System.out.println("Game Lost! Try again");
        }

    }



}

public class GuesserGame {
    public static void main (String [] args) {
        Umpire u =new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();

    }
    
}
