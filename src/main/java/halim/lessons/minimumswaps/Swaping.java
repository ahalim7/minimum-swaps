/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.minimumswaps;

import java.util.Arrays;

/**
 *
 * @author AbdElHalim
 */
public class Swaping {

    public static void main(String[] args) {
        int res = minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7});
        System.out.println(res);
    }

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        int n = arr.length;
        Boolean[] checked = new Boolean[n];
        Arrays.fill(checked, false);

        for (int i = 0; i < n; i++) {
            int currentNum = arr[i];

            if (currentNum == i+1) {
                checked[i] = true;
                continue;
            }

            int j = i;

            while (!checked[i]) {
                swaps++;
                j = currentNum - 1;
                currentNum = arr[j];
                checked[j] = true;
                if (currentNum == i+1) {
                    checked[i] = true;
                }
            }
        }
        return swaps;
    }

}
