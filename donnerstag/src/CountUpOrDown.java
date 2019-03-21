/* Das ist ein Programm, bei dem der User über die Konsole einen Startwert, eine Schrittgröße und einen Endwert angeben soll.
* Der Computer soll dann die Zahlenreihe mit der geeigneten Schrittbreite anzeigen.
 */
import java.util.Scanner;
public class CountUpOrDown {
    public static void main(String[] args) {
        boolean playing = true;
        //solange der player spielen will
        while (playing) {
            int startwert, schrittzahl, endwert;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Den Startwert bitte:");
            startwert = scanner.nextInt();
            System.out.println("Die Schrittzahl bitte:");
            schrittzahl = scanner.nextInt();
            System.out.println("Den Endwert bitte:");
            endwert = scanner.nextInt();

            System.out.println("Das ist deine Zahlenreihe:");
           //Falls der Startwert größer ist als der Endwert
            if(startwert > endwert) {
                for (int i = startwert; i >= endwert; i -= schrittzahl) {
                    System.out.println(i);
                }
            } else {
                for(int i = startwert; i <= endwert; i += schrittzahl){
                    System.out.println(i);
                }
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
