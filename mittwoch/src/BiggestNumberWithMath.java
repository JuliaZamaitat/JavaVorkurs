import java.util.Scanner;

public class BiggestNumberWithMath {
    public static void main(String[] args) {
        boolean playing = true; //Makiert, ob man weiterspielen möchte.
        //Loop, der so lange läuft, wie playing == true ist.
        while (playing) {
            //Wir brauchen ein Scanner Objekt, um User Input lesen zu können.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gibt eine ganze Zahl ein: ");
            //Der Computer wartet auf eine Eingabe, genauer genommen auf die nächste Zahl
            int ersteEingabe = scanner.nextInt();
            System.out.println("Gib eine zweite ganze Zahl ein.");
            //Der Computer wartet auf die zweite Zahl.
            int zweiteEingabe = scanner.nextInt();
            System.out.println("Gib eine dritte ganze Zahl ein.");
            //Der Computer wartet auf die dritte Zahl.
            int dritteEingabe = scanner.nextInt();

            //Hier wird entschieden, welche Zahl die größte ist. Hier wird die Math.max() Funktion benutzt!
            System.out.println("Die größte Zahl is: " + Math.max(ersteEingabe, Math.max(zweiteEingabe, dritteEingabe)));


            System.out.println("Willst du weitermachen? Antworte mit Ja oder Nein.");
            //Hier wartet der Computer auf den nächsten String, der eingegeben wird.
            String choice = scanner.next();
            //Die Antwort muss Ja oder Nein sein, sonst wird nochmal darauf hingewiesen
            while (!choice.equals("Ja") && !choice.equals("Nein")) {
                System.out.println("Du musst mit Ja oder Nein antworten.");
                choice = scanner.next();
            }
            if (choice.equals("Ja")) playing = true; //Dann startet die While Schleife nochmal
            else playing = false; //Dann beendet das Programm
        }
    }
}

