public class Random {
    public static void main(String[] args) {
        double zufallsKommazahl = Math.random();
        // Zahl zw 0 und 1
        int ganzeZufallszahl = (int) (Math.random() * 100);
        // Zahl zw 0 und 99

        System.out.println(zufallsKommazahl);
        System.out.println(ganzeZufallszahl);
    }
}
