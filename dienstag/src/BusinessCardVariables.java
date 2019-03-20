public class BusinessCardVariables {
    //These are our "fields". Here we can declare and initalize variables:"
    // Create avariable with the type string and give it a description/name. Assign your name.
    public static String name = "Julia Zamaitat";
    // Create another variable with the type string and give it a description/name. Assign your study programme to it.
    public static String studyProgram = "Internationale Medieninformatik";
    // Create another variable with the type int and give it a description/name. Assign your semester to it.
    public static int semester = 3;
    // Create a variable with the type string and give it a description/name. Assign the name of a street to it. Put a black space at the end within the string.
    public static String streetName = "Wilhelminenhofstraße ";
    // Create a variable with the type int and give it a description/name. Assign the street number of your address to it.
    public static int streetNumber = 75;

    // This is the 'main' method. Everything starts from here.
    public static void main(String[] args) {
       businessCard();
    }

    public static void businessCard() {
        System.out.println( "+----------------------------------+" );
        System.out.println( "| " + name +"                   |" );
        System.out.println( "| " + studyProgram +"  |" );
        System.out.println( "|                                  |" );
        System.out.println( "| " + semester + ". " + "Semester                      |" );
        System.out.println( "| HTW Berlin                       |" );
        System.out.println( "| " + streetName +" " + streetNumber+"         |" );
        System.out.println( "+----------------------------------+" );
    }
}
