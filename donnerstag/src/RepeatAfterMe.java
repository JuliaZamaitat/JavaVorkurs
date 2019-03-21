/*Das ist ein Programm, dass einen Satz und eine Zahl vom User entgegennimmt.
*Es wiederholt dann den Satz so oft wie durch die Zahl vorgegeben.
 */
import java.util.Scanner;

public class RepeatAfterMe {
    public static void main(String[] args) {
        boolean playing = true;
        //solange der player spielen will
        while (playing) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nenn mir deine magischen Worte:");
            String satz = scanner.nextLine();
            System.out.println("Wie oft soll ich sie für dich wiederholen?");
            int zahl = scanner.nextInt();


            System.out.println("Okay! Hier ist dein Mantra:");
            //Schleife, die den eingegebenen Satz wiederholt.
            for(int i = 0; i < zahl; i++){
                System.out.println(satz);
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
