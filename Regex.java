import java.util.regex.*;

public class Mobnumber {
   public static void main(String args[]) {
      String mobnumber = "91 9689887638";
      String regex = "^[1-9]{2}\\s{0,1}[0-9]{5}[0-9]{5}$";
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(mobnumber);
      System.out.println("The MobNumber is: " + mobnumber);
      System.out.println("Is the MobNumber valid? " + mobnumber.matches(regex));
   }
}
