import java.util.regex.*;
//Rule No 3
public class Password {
   public static void main(String args[]) {
      String password = "jdF5iOj8";
      String regex = "[0-9 a-z A-Z]{8}";
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(password);
      System.out.println("The Password is: " + password);
      System.out.println("Is the Password valid? " + password.matches(regex));
   }
}
