public class Arrays {
    public static void main(String[] args) {
        /*
         * Arrays are used to store multiple values in a single variable
         */

         int[] num = {1, 2, 3};
         System.out.println(num[0]);
         num[2] = 10;
         System.out.println(num[2]);

         //Use length property to find array length

         System.out.println(num.length);

         // You can loop through array using for loop or for each
         for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
         }

         for (int i : num) {
            System.out.println(i);
         }

         //Multidimensional arrays are useful when you want to store data in tabular form
         // Like a table with rows and columns

         int[][] matrix = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} };
         System.out.println(matrix[0][3]);
         matrix[2][3] = 12;
         matrix[2][3] = 12;

         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.print('\n');
         }

    }
}
