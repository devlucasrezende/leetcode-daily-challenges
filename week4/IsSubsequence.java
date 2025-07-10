package week4;



public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("aec","abcde"));
    }

    public static boolean isSubsequence(String s, String t) {
       int pointerS = 0;
       int pointerT = 0;

       while (pointerS < s.length() && pointerT < t.length()) {
           char letraNaStringS = s.charAt(pointerS);
           char letraNaStringT = t.charAt(pointerT);

           if (letraNaStringS == letraNaStringT) {
               pointerS++;
               pointerT++;
           } else {
               pointerT++;
           }
       }
       return pointerS == s.length();
    }

}
