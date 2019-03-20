import java.util.Scanner;

public class VokalKonsonant {
    public static void main(String[] args){
        boolean playing = true; //Makiert, ob man weiterspielen möchte.
        //Loop, der so lange läuft, wie playing == true ist.
        while (playing) {
            //Wir brauchen ein Scanner Objekt, um User Input lesen zu können.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gibt einen Buchstaben ein: ");
            //Der Computer wartet auf eine Eingabe, genauer genommen auf den nächsten Charakter.
            String eingabe = scanner.next();
            //Überprüfung, ob es sich um einen Vokal handelt.
            if (eingabe.equals("a") || eingabe.equals("e") || eingabe.equals("i") || eingabe.equals("o") || eingabe.equals("u"))
                System.out.println("Das ist ein Vokal");
            else System.out.println("Das ist ein Konsonant");

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

