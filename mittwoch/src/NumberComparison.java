/* Das ist ein Programm, was den Benutzer über die Konsole zwei Zahlen eingeben lässt und anschließend prüft,
* welche der beiden Zahlen größer ist. Der User kann dann entscheiden, ob er weiterspielen möchte oder nicht.
 */
import java.util.Scanner;
public class NumberComparison {
    public static void main(String[] args) {
       boolean playing = true; //Makiert, ob man weiterspielen möchte.
        //Loop, der so lange läuft, wie playing == true ist.
        while (playing) {
            //Wir brauchen ein Scanner Objekt, um User Input lesen zu können.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gibt eine ganze Zahl ein: ");
            //Der Computer wartet auf eine Eingabe, genauer genommen auf die nächste Zahl
            int ersteEingabe = scanner.nextInt();
            System.out.println("Gib eine zweite ganze Zahl ein. Ich werde errechnen, welche Zahl größer ist.");
           //Der Computer wartet auf die zweite Zahl.
            int zweiteEingabe = scanner.nextInt();

            //Hier wird entschieden, welche Zahl größer oder kleiner ist.
            if (ersteEingabe > zweiteEingabe) {
                System.out.println("Die Zahl " + ersteEingabe + " ist größer.");
            } else if (ersteEingabe < zweiteEingabe) {
                System.out.println("Die Zahl " + zweiteEingabe + " ist größer");
            } else System.out.println("Die Zahlen sind gleich groß.");

            System.out.println("Willst du weitermachen? Antworte mit Ja oder Nein.");
            //Hier wartet der Computer auf den nächsten String, der eingegeben wird.
            String choice = scanner.next();
            //Die Antwort muss Ja oder Nein sein, sonst wird nochmal darauf hingewiesen
            while(!choice.equals("Ja") && !choice.equals("Nein")){
                System.out.println("Du musst mit Ja oder Nein antworten.");
                choice = scanner.next();
            }
            if (choice.equals("Ja")) playing = true; //Dann startet die While Schleife nochmal
            else playing = false; //Dann beendet das Programm
        }
    }
}
