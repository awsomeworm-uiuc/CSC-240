public class Kata {

  public static String solution(String str) {
    // Your code here...
    String reverse = "";
    for(int i = 0; i < str.length(); ++i){
      reverse = str.charAt(i) + reverse;
    }
    return reverse;
  }

}
