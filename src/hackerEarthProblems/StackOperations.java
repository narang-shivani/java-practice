package hackerEarthProblems;

import java.util.List;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Problem
 * You are given a stack of N integers.
 * In one operation, you can either pop an element from the stack or push any popped element into the stack.
 * You need to maximize the top element of the stack after performing exactly K operations.
 * If the stack becomes empty after performing K operations and there is no other way for the stack to be non-empty, print -1.
 *
 * Input format :
 * The first line of input consists of two space-separated integers N and K.
 * The second line of input consists N space-separated integers denoting the elements of the stack.
 * The first element represents the top of the stack and the last element represents the bottom of the stack.
 *
 * Output format :
 * Print the maximum possible top element of the stack after performing exactly K operations.
 *
 * Sample Input
 * 6 4
 * 1 2 4 3 3 5
 * Sample Output
 * 4
 * Explanation: In 3 operations, we remove 1,2,4 and in the fourth operation, we push 4 back into the stack. Hence, 4 is the answer.
 */
public class StackOperations {

    public static void main(String args[]) throws Exception {
        System.out.println("Enter input");
        List<String> input = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Input received");
        while (s.hasNext()) {
            input.add(s.nextLine());
        }
        int n = parseInt(input.get(0).split(" ")[0]);
        int k = parseInt(input.get(0).split(" ")[1]);

        List<String> elements = new ArrayList<String>(Arrays.asList(input.get(1).split(" ")));

        Stack<String> orstack = new Stack();
        int i = elements.size() - 1;
        while (i > 0) {
            orstack.push(elements.get(i));
            i--;
        }

        maxElement(orstack, n, k);
    }

    static void maxElement(Stack<String> orstack, int n, int k) {
        List<Integer> poppedElements = new ArrayList<Integer>();

        int i = 0;
        while (i < k) {
            poppedElements.add(parseInt(orstack.pop()));
            i++;
        }
        Collections.sort(poppedElements);

        orstack.push(poppedElements.get(k-2).toString());
        System.out.println(orstack.peek());
    }
}
