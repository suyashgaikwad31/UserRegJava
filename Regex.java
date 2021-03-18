import java.util.regex.*;

public class EmailId {
   public static void main(String args[]) {
      String emailid = "abc.xyz@bl.co.in";
      String regex = "[0-9 a-z A-z]+([._+-][0-9 a-z A-Z]+)*"+"@([0-9 a-z A-Z][-]?)+[.][a-z A-Z]{2,4}([.][a-z A-Z]{2,4})?$";
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(emailid);
      System.out.println("The EmailId is: " + emailid);
      System.out.println("Is the EmailId valid? " + emailid.matches(regex));
   }
}
