import java.util.regex.*;

public class LastName {
   public static void main(String args[]) {
      String lastname = "Gaikwad";
      String regex = "^[A-Z]{1}[a-z]{3,}$";
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(lastname);
      System.out.println("The Lastname is: " + lastname);
      System.out.println("Is the Lastname valid? " + lastname.matches(regex));
   }
}
