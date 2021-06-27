package problems;
public class ReverseArray {
    public static void main(String args[] ) throws Exception {
        int input[] = {4,12,7,15,9};
//        int arrLength = 0;
//        int i = 0;
//        Scanner s = new Scanner(System.in);
//        while (s.hasNext()) {
//            if (i == 0)
//            {
//                arrLength = Integer.parseInt(s.nextLine());
//            }
//            else
//            {
//                input[i-1] = Integer.parseInt(s.nextLine());
//            }
//            i++;
//        }
//        System.out.println(arrLength);
//        System.out.println(input);
        reverseArray(input);
    }
    static void reverseArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int element: arr)
        {
            System.out.println(element);
        }
    }
}
