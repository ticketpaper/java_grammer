import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) {
//        "hello"	"llohe"	3
//        "apple"	"elppa"	-1
        String A = "hello";
        String B = "llohe";
        int answer = 0;
        StringBuilder sb = new StringBuilder(A);
        for (int i = 0; i < A.length(); i++) {
            sb.insert(0, sb.charAt(sb.length() - 1));
            sb.delete(sb.length() - 1, sb.length());
            ++answer;
            if (sb.toString().equals(B)) {
                break;
            }
        }
        if (A.equals(B)) {
            answer = 0;
        } else if (!(sb.toString().equals(B))) {
            answer = -1;
        }

        System.out.println(answer);
    }
}
