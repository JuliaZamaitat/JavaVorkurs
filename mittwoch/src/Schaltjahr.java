/* Dieses Programm überprüft, ob das eingegebene Jahr des Users ein Schaltjahr ist oder nicht.
* Es ist ein Schaltjahr, wenn es durch:
* 4 teilbar ist
* jedoch nicht durch 100 teilbar ist
* es sei denn, es ist auch durch 400 teilbar
 */
import java.util.Scanner;
public class Schaltjahr {
    public static void main(String[] args) {
        boolean playing = true; //Makiert, ob man weiterspielen möchte.
        //Loop, der immer weiterläuft, so lange playing == true ist.
        while (playing) {
            //Erstellt ein Scanner Objekt, das User Input liest
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bitte gib eine Jahreszahl ein: ");
            //Der Computer wartet auf die nächste eingegebene Zahl
            int year = scanner.nextInt();
            //Hier fangen die Checks an: Ist es ein Schaltjahr?
            if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0 && (year % 100) == 0) {
                    System.out.println(year + " ist ein Schaltjahr"); //dann true
                }
             else System.out.println(year + " ist kein Schaltjahr"); //ansonsten falsch

            System.out.println("Willst du weitermachen? Antworte mit Ja oder Nein.");
            //warten auf String Eingabe des USers.
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
