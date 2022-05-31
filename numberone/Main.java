package numberone;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Scanner sc = new Scanner(System.in);

    //main
    public static void main(String[] args) {
        Stack<Character> ans = new Stack(); //using stack to push and pop the "#"

        String input1 = sc.nextLine();

        for (char c: input1.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        String output = ans.toString();
        System.out.println(output);
    }
}
