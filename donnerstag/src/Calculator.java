import java.util.Scanner;
public class Calculator {
        public static void main(String[] args) {
           boolean playing = true;
           //solange der player spielen will
            while (playing) {
                double zahl1, zahl2;
                Scanner scanner = new Scanner(System.in);

                System.out.println("Erste Zahl bitte:");
                zahl1 = scanner.nextDouble();
                System.out.println("Zweite Zahl bitte:");
                zahl2 = scanner.nextDouble();
                System.out.println("Bitte gib einen Operator ein für entweder: Addition, Subtraktion, Multiplikation oder Division");
                String operator = scanner.next();
                //switch cases für die verschiedenen Operatoren. Kann statt if/else benutzt werden.
                switch (operator) {
                    case "+":
                        System.out.println("Das Ergebnis ist " + (zahl1 + zahl2));
                        break;
                    case "-":
                        System.out.println("Das Ergebnis ist " + (zahl1 - zahl2));
                        break;
                    case "*":
                        System.out.println("Das Ergebnis ist " + (zahl1 * zahl2));
                        break;
                    case "/":
                        System.out.println("Das Ergebnis ist " + (zahl1 / zahl2));
                        break;
                }
                //Abfrage, ob man nochmal spielen möchte.
                System.out.println("Wills du nochmal spielen? Antworte mit Ja oder Nein.");
                String answer = scanner.next();
                while (!answer.equals("Ja") && !answer.equals("Nein")){
                    System.out.println("Bitte antworte mit Ja oder Nein");
                    answer = scanner.next();
                }
                if(answer.equals("Ja")) { playing = true;}
                else playing = false;
            }
        }
    }

