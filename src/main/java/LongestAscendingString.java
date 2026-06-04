import java.util.Scanner;

public class LongestAscendingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input String: ");

        String str = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        result.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i)
                    > result.charAt(result.length() - 1)) {

                result.append(str.charAt(i));
            }
        }

        System.out.println(
                "Longest ascending string: "
                        + result
        );
    }
}
