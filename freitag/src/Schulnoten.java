/*Das Programm nimmt noten vom User über die Konsole entgegen und berechnet anschließend den Notendurschnitt.
 */
import java.util.Scanner;

public class Schulnoten {
    public static void main(String[] args) {
        calculateGrade();
    }

    //Methode zur Berechnung des Notendurchschnitts. Sie bekommt die Noten durch den Methodenaufrug getInput()
    public static void calculateGrade(){
        String[] noten = getInput(); //holt sich das Noten Array, was momentan noch ein String ist.
        double sum = 0;
        int count = 0;
        for(String note: noten) {
           note = note.trim(); //entfernt whitespace vor und hinter der Note
            double grade = Double.parseDouble(note);//macht aus unserem String einen dozble
            sum += grade; //summiert alle Noten auf
            count++; //merkt sich, wie viele Noten aufsummiert wurden
        }
        double ergebnis = sum/count; //berechnet den Durchschnitt
        System.out.println("Der Notendurschnitt ist: " + ergebnis);

    }

    //Verantwortliche Methode zum Einlesen der User-Daten. Gibt einen String array mit den Noten zurück, gesplittet am Komma.
    public static String[] getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib deine Noten ein mit einem Komma dazwischen!");
        String noten = scanner.nextLine();
        String[] n = noten.split(",");
        return n;
    }
}
