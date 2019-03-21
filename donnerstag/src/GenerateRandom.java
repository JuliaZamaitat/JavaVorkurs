/*In diesem Programm erstellt der Computer eine zufällige Zahl zwischen 1 und 6 und gibt aus wie oft er gebraucht hat,
* um eine 6 zu würfeln.
 */
import java.util.Random;
public class GenerateRandom {
    public static void main(String[] args){
        Random randomGenerator = new Random();
        int zufallsZahl = randomGenerator.nextInt(6)+1;
        int tries = 0;
        while(zufallsZahl != 6){
            zufallsZahl = randomGenerator.nextInt(6)+1;
            tries++;
        }
        System.out.println("Der Computer musste " + tries + " Mal würfeln, um eine 6 zu würfeln.");
    }
}
