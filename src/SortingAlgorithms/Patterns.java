package SortingAlgorithms;

public class Patterns {
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(5);
        pattern17(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        // run outer for loop , no of row in pattern times
        for (int row = 1; row <= n; row++) {
            // run every row , run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when the row is printed, we need to print a newline
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int noOfCols = row > n ? 2 * n - row : row;
            for (int col = 1; col <= noOfCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *

         */
        for (int row = 1; row <= n; row++) {
            // print spaces

            for (int spaces = 1; spaces <= 2 * (n - row); spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern28(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int spaces = Math.abs(n - row);
            int star = row > n ? 2 * n - row : row;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= star; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern29(int n) {
        for (int row = 1; row < 2 * n; row++) {
            //print starting stars
            int stars = row > n ? 2 * n - row : row;
            for (int startStars = 1; startStars <= stars; startStars++) {
                System.out.print("*");
            }
            //print in between spaces
            int spaces = 2 * Math.abs(n - row);
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            //print ending starts
            for (int endStarts = 1; endStarts <= stars; endStarts++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            //print spaces
            int space = 2 * (n - row);
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            // print upto 1]
            for (int i = 0; i < row; i++) {
                System.out.print(row - i + " ");
            }
            // from 2 to end
            for (int i = 1; i < row; i++) {
                System.out.print(2 + i - 1 + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int spaces = 2*Math.abs(n - row);
            int star = row > n ? 2 * n - row : row;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int col = star; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= star; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        for (int row = 1; row < 2*n ; row++) {
            int left = 1;
            int right = 7;
            

        }
    }
}
