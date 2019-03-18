public class HelloWorld {
  public static void main(String[] args){
    System.out.println("Das ist mein erstes Java-Programm!");
    System.out.println("Es wird nicht mein letztes sein.");
    //aboutMe(); //auskommentierter Methodenaufruf
    businessCard(); //Methodenaufruf
    //System.out.println("Ich heiße Julia.");
    //System.out.println("Ich studiere Internationale Medieninformatik im 3. Semester.");
  }

  public static void aboutMe(){
    System.out.println("Ich heiße Julia.");
    System.out.println("Ich studiere Internationale Medieninformatik im 3. Semester.");
  }

//Diese Methode wird in der Main-Methode aufgerufen.
  public static void businessCard() {
    System.out.println( "+----------------------------------+" );
    System.out.println( "| Julia Zamaitat                   |" );
    System.out.println( "| Internationale Medieninformatik  |" );
    System.out.println( "|                                  |" );
    System.out.println( "| 3. Semester                      |" );
    System.out.println( "| HTW Berlin                       |" );
    System.out.println( "| Tutorin                          |" );
    System.out.println( "+----------------------------------+" );
  }
}
