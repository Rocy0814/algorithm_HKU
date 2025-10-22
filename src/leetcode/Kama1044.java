package leetcode;

import java.util.Scanner;
public class Kama1044{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        int sum=0;
        int res = Integer.MAX_VALUE;
        a = sc.nextInt();
        b = sc.nextInt();
        int[][] arr = new int[a][b];
        for(int i = 0;i < a;i++){
            for(int j = 0;j < b;j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        // for(int i = 0;i < a;i++){
        //     for(int j = 0;j < b;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int[] rowStatic = new int[a];
        int[] columnStatic = new int[b];
        for(int i = 0;i<a;i++){
            for (int j = 0; j < b;j++){
                rowStatic[i] += arr[i][j];
            }
        }
        for(int i = 0;i<b;i++){
            for (int j = 0; j < a;j++){
                columnStatic[i] += arr[j][i];
            }
        }
        int rowSum = 0;
        int colSum = 0;
        for(int i = 0;i < a;i++){
            rowSum += rowStatic[i];
            res = Math.min(res, Math.abs((sum - rowSum) - rowSum));
        }
        for(int i = 0;i < b;i++){
            colSum += columnStatic[i];
            res = Math.min(res, Math.abs((sum - colSum) - colSum));
        }
        sc.close();
        System.out.println(res);
    }
}
