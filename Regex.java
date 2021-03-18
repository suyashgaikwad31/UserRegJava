import java.util.regex.*;
//Rule No 2
public class Password {
   public static void main(String args[]) {
      String password = "jdFuiOjn";
      String regex = "[a-z A-Z]{8}";
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(password);
      System.out.println("The Password is: " + password);
      System.out.println("Is the Password valid? " + password.matches(regex));
   }
}
