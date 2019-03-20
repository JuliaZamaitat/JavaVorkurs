import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        boolean playing = true; //Makiert, ob man weiterspielen möchte.
        //Loop, der so lange läuft, wie playing == true ist.
        while (playing) {
            //Wir brauchen ein Scanner Objekt, um User Input lesen zu können.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gibt einen Monat ein: ");
            //Der Computer wartet auf eine Eingabe, genauer genommen auf die nächste Zahl
            String monat = scanner.next();

            //Hier wird überprüft, welcher Monat eingegeben wurde
            if (monat.equals("Februar")) System.out.println("Der Februar hat entweder 29 oder 28 Tage.");
            else if (monat.equals("Januar") || monat.equals("März") || monat.equals("Mai") || monat.equals("Juli") || monat.equals("August") || monat.equals("Oktober") || monat.equals("Dezember")) {
                System.out.println("Der Monat " + monat + " hat 31 Tage.");}
            else if (monat.equals("April") || monat.equals("Juni") || monat.equals("September") || monat.equals("November"))
                System.out.println("Der Monat "+ monat + " hat 30 Tage.");
            else System.out.println("Das ist kein Monat");


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
