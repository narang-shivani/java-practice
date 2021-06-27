package problems;
import java.util.*;

public class QueueOperations {
    public static void main(String args[] ) throws Exception {
        List<String> input = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while (s.hasNext())
        {
            input.add(s.nextLine());
        }

        int i = 1;
//        int front = 0, rear = 0;
        int cases = Integer.parseInt(input.get(0));
        Queue<Integer> queue = new LinkedList<>();

        while ( i <= cases)
        {
            if (input.get(i).contains("E"))
            {
                List<String> eqRow = new ArrayList<>(Arrays.asList(input.get(i).split(" ")));
                int j = 1;
                while (j < eqRow.size())
                {
                    queue.add(Integer.parseInt(eqRow.get(j)));
//                    rear++;
                    j++;
                }
                System.out.println(queue.size());
            }
            else if (input.get(i).contains("D"))
            {
                if (queue.size() == 0)
                {
                    System.out.println("-1 " + queue.size());
                }
                else
                {
                    System.out.println(queue.remove() + " " + queue.size());
                }
            }
            i++;
        }
    }
}
