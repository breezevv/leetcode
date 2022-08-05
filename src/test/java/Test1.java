import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        StringBuilder ans = new StringBuilder(words[index]);
        for (int i = index; i < n; ) {
            char last = words[i].charAt(words[i].length() - 1);
            int max = i + 1, maxLength = 0;
            for (int j = i + 1; j < n; j++) {
                if (words[j].charAt(0) == last) {
                    if (words[j].length() > maxLength) {
                        max = j;
                        maxLength = words[j].length();
                    }
                }
            }
            if (max == i + 1) {
                if (max == words.length && words[max - 1].charAt(0) == last) {
                    ans.append(words[max - 1]);
                }
                break;
            } else {
                ans.append(words[max]);
            }
            i = max + 1;
        }
        System.out.println(ans.toString());
    }
}
