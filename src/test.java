import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) {
        int a = 100;
        int count = 0;
        for(int i=1;i<=a;i++){
            if (a % i == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
