/**  SimpleWordle: Implementieren Sie ein einfaches Wordle-Spiel mit einer 
     unendlichen Anzahl von Versuchen. Verwenden Sie diese Vorlage: 
  */
import java.util.Random;   // random number generator
import java.util.Scanner;  // scan strings in der Konsole
class SimpleWordle {
  public static String dialog( String hint ) {  // Zeige Hinweis, Eingabe
    System.out.print( hint + ", what is your guess? ");
    Scanner scan = new Scanner(System.in);
    return scan.next();
  }
  public static void main( String[] str ) {
    String loesung = "weary"; // Loesunswort
    String hint = "-----";    // Hinweis mit gefundenen Buchstaben
    // Implementiere ein Schleife, die dialog ausführt & aufhört
    // wenn das Wort geraten wurde:
    while (!loesung.equals(hint)) {
      String s = dialog(hint);
      for (int i = 0; i < loesung.length(); i++) {
        if ( loesung.charAt(i) == s.charAt(i) ) {
          hint = hint.substring(0,i) + loesung.charAt(i)
                 + hint.substring(i+1,loesung.length()) ;
        }
      }
    }
  }
}
