import java.util.Scanner;

public class AlgorithmComplexityTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String inputString = scanner.nextLine();
        int[] frequentChar = new int[255];                         //{1}
        for (int i = 0; i < inputString.length(); i++) {           //{2}
            int ascii = inputString.charAt(i);               //{3}
            frequentChar[ascii] += 1;                              //{4}
        }

        int max = 0;                                             //{5}
        char character = (char) 255; /* empty character */      //{6}
        for (int j = 0; j < 255; j++) {                         //{7}
            if (frequentChar[j] > max) {                        //{8}
                max = frequentChar[j];                          //{9}
                character = (char) j;                           //{10}
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}

/*
----------------------------------------------------------------
    Độ phức tạp của thuật toán
    1 vòng lặp 2 câu lệnh = n + 1 + n + n = 3n + 1
    1 vòng lặp * câu lệnh = 255 + 254
    4 câu lệnh = 1 + 1 +1 + 1
    T(n) = 3n + 1 + 255 + 254 + 4
    T(n) = O(n) + O(255)
    => Độ phức tạp của thuật toán là O(n)
-----------------------------------------------------------------
 */