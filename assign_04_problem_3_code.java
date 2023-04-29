//Dina Ashraf
//20216433

import java.util.Scanner;
public class Main {
    static int Search(int[] arr, int sz, int target) {
        for (int i = 0; i < sz; i++)
        {
            if (arr[i] == target) return i;
        }
        return -1;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();
        int[] arr = new int[sz];
        for (int i = 0; i < sz; i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = Search(arr, sz, target);
        if (res == -1) System.out.println("-1");
        else System.out.println(res);
    }
}
