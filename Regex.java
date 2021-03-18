import java.util.regex.*;

public class FirstName {
   public static void main(String args[]) {
      String firstname = "Suyash";
      String regex = "^[A-Z]{1}[a-z]{3,}$";
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(firstname);
      System.out.println("The Firstname is: " + firstname);
      System.out.println("Is the Firstname valid? " + firstname.matches(regex));
   }
}
