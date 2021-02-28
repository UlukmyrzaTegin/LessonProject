package less_8_array.classWork;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/28/2021 Feb 2021
 */
public class Arrays {
    public static void main(String[] args) {
        int [][] nums = new int[10][13];
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 13; j++) {
             //   System.out.println("nums[" + i + "][" + j + "] - " + nums[i][j]);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print(" enter x1 = ");
        int x1 = scanner.nextInt() - 1;
        System.out.print(" enter y1 = ");
        int y1 = scanner.nextInt() - 1;

        System.out.print(" enter x2 = ");
        int x2 = scanner.nextInt() - 1;
        System.out.print(" enter y2 = ");
        int y2 = scanner.nextInt() - 1;

        System.out.print(" enter x3 = ");
        int x3 = scanner.nextInt() - 1;
        System.out.print(" enter y3 = ");
        int y3 = scanner.nextInt() - 1;

        nums[x1][y1] = 1;
        nums[x2][y2] = 1;
        nums[x3][y3] = 3;

        System.out.println();
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        if (x1 < x2) {
            for (int i = x1; i <= x2 ; i++) {
                if (nums[i][y1] != 3){
                    nums[i][y1] = 1;
                } else {
                    y1 += 1;
                    i -= 1;
                    nums[i][y1] = 1;
                }
            }
        } else {
            for (int i = x1; i >= x2 ; i--) {
                nums[i][y1] = 1;
            }
        }
        if (y1 < y2) {
            for (int j = y1; j <= y2 ; j++) {
                if (nums[x2][j] == 3) {
                    j -= 1;
                    x2 -= 1;
                }
                nums[x2][j] = 1;
            }
        } else {
            for (int j = y1; j >= y2 ; j--) {
                nums[x2][j] = 1;
            }
        }
        System.out.println();
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
