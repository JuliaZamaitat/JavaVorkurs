public class Calculator {
    public static void main(String[] args) {
        System.out.println("Das erwartete Ergebnis ist 15.");
        System.out.println("Das tatsächliche Ergebnis ist " + add(5, 10));

        System.out.println("Das erwartete Ergebnis ist 8.");
        System.out.println("Das tatsächliche Ergebnis ist " + subtract(15, 7));

        System.out.println("Das erwartete Ergebnis ist 200.");
        System.out.println("Das tatsächliche Ergebnis ist " + multiply(100, 2));

        System.out.println("Das erwartete Ergebnis ist 50.");
        System.out.println("Das tatsächliche Ergebnis ist " + divide(100, 2));

        System.out.println("Das erwartete Ergebnis ist 1.0");
        System.out.println("Das tatsächliche Ergebnis ist " + modulo(7, 2));

        System.out.println("Das erwartete Ergebnis ist true.");
        System.out.println("Das tatsächliche Ergebnis ist " + isBigger(100, 2));

        System.out.println("Das erwartete Ergebnis ist false.");
        System.out.println("Das tatsächliche Ergebnis ist " + isBigger(2, 100));

        System.out.println("Das erwartete Ergebnis ist true.");
        System.out.println("Das tatsächliche Ergebnis ist " + isSmaller(1, 100));

        System.out.println("Das erwartete Ergebnis ist false.");
        System.out.println("Das tatsächliche Ergebnis ist " + isSmaller(100, 2));

        System.out.println("Das erwartete Ergebnis ist false.");
        System.out.println("Das tatsächliche Ergebnis ist " + falsy(true, false));

        System.out.println("Das erwartete Ergebnis ist true.");
        System.out.println("Das tatsächliche Ergebnis ist " + truthy(true, false));
    }

    public static int add(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static int subtract(int a, int b) {
        return a-b; //you can return the calculation right away: you don't have to save it in a variable.
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int divide(int a, int b){
        return a/b;
    }

    //This method takes two doubles and makes a modulo b, which returns the remainder of the calculation.
    public static double modulo(double a, double b) {
        return a%b;
    }

    //This method checks if the integer a is bigger than integer b and returns false or true
    public static boolean isBigger(int a, int b){
        return a > b;
    }
    //This method checks if the integer a is smaller than integer b and returns false or true
    public static boolean isSmaller(int a, int b){
        return a < b;
    }
    //This method checks if the boolean var1 and the boolean var2 are both either true or false
    public static boolean falsy(boolean var1, boolean var2){
        return var1 && var2;
    }
    //This method checks if either one of the boolean var1 or the boolean var2 are  true or false
    public static boolean truthy(boolean var1, boolean var2){
        return var1 || var2;
    }
}
