package leetcode;

import java.util.*;
public class Kama1070{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int presum = 0;
        int[] arr = new int[n];
        int[] sum = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            presum += arr[i];
            sum[i] = presum;
        }
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0) {
                System.out.println(sum[b]);
            }else{
                System.out.println(sum[b] - sum[a-1]);
            }
        }
        sc.close();
    }
}