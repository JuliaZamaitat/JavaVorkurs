import java.util.Scanner;

public class DogYears {
    public static void main(String[] args){
        boolean playing = true; //Makiert, ob man weiterspielen möchte.
        //Loop, der so lange läuft, wie playing == true ist.
        while (playing) {
            //Wir brauchen ein Scanner Objekt, um User Input lesen zu können.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nenn mir ein Alter und ich sage dir das Alter in Hundejahren:");
            //Der Computer wartet auf eine Eingabe, genauer genommen auf die nächste Zahl
            int eingabe = scanner.nextInt();

            //Hier fidet die Berechnung der Hundejahre statt.
            //Hier wird der Fall gezeigt, wenn die eingegebene Zahl kleiner als 3 ist:
            if (eingabe < 3) {
                if (eingabe == 2) System.out.println("Das sind 21 Hundejahre.");
                else if (eingabe == 1) System.out.println("Das sind 10.5 Hundejahre.");
                else if (eingabe == 0) System.out.println("Du bist ja lustig. Das sind natürlich auch 0 Hundejahre.");
                else System.out.println("Bitte gib eine positive Zahl ein.");
            }
            //hier wird das Hundealter berechnet, wenn die eingegebene Zahl größer als 2 ist.
            else System.out.println("Das sind " + ((eingabe-2)*4 + 21) + " Hundejahre");

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
