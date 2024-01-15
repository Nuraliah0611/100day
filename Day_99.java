import java.util.Scanner;

public class Day_99 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah string: ");
        String inputString = input.nextLine();

        char[] charArray = inputString.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        String reversedString = new String(charArray);

        System.out.println("String setelah dibalik: " + reversedString);
    }
}
