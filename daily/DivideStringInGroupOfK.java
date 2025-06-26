package daily;

public class DivideStringInGroupOfK {

    public static void main(String[] args) {
        divideString("abcdefghij", 3, 'x');
    }

    public static String[] divideString(String s, int k, char fill) {
        int resto = s.length() % k;
        int numFillChars = 0;
        if (resto != 0) {
            numFillChars = k - (s.length() % k);
        }
        StringBuilder sb = new StringBuilder(s);
        sb.append(String.valueOf(fill).repeat(Math.max(0, numFillChars)));
        String resultadoComFill = sb.toString();
        int numGroups = resultadoComFill.length() / k;
        String[] result = new String[numGroups];
        for (int i = 0; i < numGroups; i++) {
            int startIndex = i * k;
            int endIndex = startIndex + k; // endIndex é exclusivo
            result[i] = resultadoComFill.substring(startIndex, endIndex);
        }
    return result;
    }

}
