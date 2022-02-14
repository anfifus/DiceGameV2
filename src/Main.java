public class Main {

    public static void main(String[] args) {


            Dice dice1 = new Dice();
            Dice dice2 = new Dice();

            showResults(dice1,dice2);

            resultGame(dice1,dice2);
        }

    private static void showResults(Dice dice1, Dice dice2) {
        System.out.println("El resultat del dau 1 és: " + dice1.getValue());
        System.out.println("El resultat del dau 2 és: " + dice2.getValue());
        System.out.println("El resultat total de la tirada dels daus és: " + (dice1.getValue() + dice2.getValue()));

    }

    private static void resultGame(Dice dice1, Dice dice2) {
        if (hasWon(dice1.getValue(), dice2.getValue())) {
            printHasWon();

        } else {
            printHasLost();
        }
    }

    private static void printHasLost() {
        System.out.println("Has perdut la partida :'(");
    }

    private static void printHasWon() {
        System.out.println("Has guanyat la partida! :D");
    }

    private static boolean hasWon(int diceValue1, int diceValue2) {
            int result = diceValue1 + diceValue2;
            return result == 7;
        }
}
