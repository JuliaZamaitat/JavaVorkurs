/*This is a class to play Lotto! With the first method it doesn't matter whether a number is drawn more than once.
*In the second method it does matter"
 */
import java.util.Random;
public class Lotto {
    public static void main(String[] args){
        playLottoWithDuplicates();
        playLottoWithoutDuplicates();
    }
    //Here duplicates are allowed
    public static void playLottoWithDuplicates(){
        Random randomgenerator = new Random();
        int lottozahl;
        int lottozahlen[] = new int[6];

       for(int i = 0; i < 6; i++){ //as long as the array is not full yet
            lottozahl = randomgenerator.nextInt(49)+1;
            lottozahlen[i] = lottozahl;
        }
        System.out.println("Die Gewinnerzahlen sind: ");
        for(int zahl: lottozahlen){//iterate through each int in our lottozahlen collection with a for-each
            System.out.println(zahl);
        }
    }

    //This method does not allow duplicate numbers - just like real Lotto!
    public static void playLottoWithoutDuplicates(){
        Random randomgenerator = new Random();
        int lottozahl;
        int lottozahlen[] = new int[6];
        boolean gezogen[] = new boolean[50]; //we create an boolean array in which all entries are by default false

        for(int i = 0; i < 6; i++){
            lottozahl = randomgenerator.nextInt(49)+1;
            while(gezogen[lottozahl]){ //if we have already drawn that number and therefore set the field to true
                lottozahl = randomgenerator.nextInt(49)+1;} //choose a new number

            lottozahlen[i] = lottozahl; //if not than add this number to our lottozahlen
            gezogen[lottozahl] = true; //and set our boolean array to true at that position so we won't draw it again.
            }
        System.out.println("Die Gewinnerzahlen sind: ");
        for(int zahl: lottozahlen){
            System.out.println(zahl);
        }
    }
}
