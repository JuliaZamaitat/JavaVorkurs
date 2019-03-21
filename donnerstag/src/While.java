public class While {
    public static void main(String[] args) {
        System.out.println("These are the numbers from 0 to 100 with a while-loop:");
        printNumbers();
        System.out.println("-----------");
        System.out.println("These are the numbers from 0 to 100 with a for-loop:");
        printNumbersFor();
        System.out.println("-----------");
        System.out.println("These are all multiples of five up to 100 with a while-loop:");
        printMultiples();
        System.out.println("\n-----------");
        System.out.println("These are all multiples of five up to 100 with a for-loop:");
        printMultiplesFor();
        System.out.println("\n-----------");
        System.out.println("These are all numbers from 110 down to 0 in steps of size 11:");
        backwards();

    }

   //Aufgabe 1: Gib mit Hilfe einer while-Schleife die ersten 100 Zahlen untereinander auf der Konsole aus​
    public static void printNumbers(){
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
    //Aufgabe 1.1: Gib mit Hilfe einer for-Schleife die ersten 100 Zahlen untereinander auf der Konsole aus​
    public static void printNumbersFor(){
        for(int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //Aufgabe 2: Gib mit Hilfe einer while-Schleife die ersten 20 Vielfachen von 5 nebeneinander auf der Konsole aus​
    public static void printMultiples(){
        int i = 5;
        while (i <= 100) {
            System.out.print(i + " ");
            i = i+5;
        }
    }

    //Aufgabe 2.1: Gib mit Hilfe einer for-Schleife die ersten 20 Vielfachen von 5 nebeneinander auf der Konsole aus​
    public static void printMultiplesFor(){
        for(int i = 5; i <= 100; i += 5){
            System.out.print(i + " ");
        }
    }

    //Aufgabe 4: Gib mit Hilfe einer for-Schleife von 110 rückwärts in Elferschritten die Zahlen bis 0 aus.
    public static void backwards(){
        for(int i = 110; i >= 0; i = i-11) {
            System.out.println(i);
        }
    }
}
