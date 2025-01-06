public class Pattern {
public static void main(String[] arg){
     pattern9(5);
}

 static void pattern9(int n){
    int originalN=n;
    n=n*2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <=n; col++) {
                int atEveryIndex= originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));

                System.out.print(atEveryIndex+" ");
            }
            // when column is finished print new line
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int row = 1; row <=2*n; row++) {
             int numberOfColumnInRow= row > n ? 2 * n - row : row;
            for (int s = 0; s < n-numberOfColumnInRow; s++) {
                System.out.print(" ");
            }
            
            for (int col = numberOfColumnInRow; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= numberOfColumnInRow; col++) {
                System.out.print(col);
            }
            // when column is finished print new line
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int row = 1; row <=n; row++) {
            for (int s = 0; s < n-row; s++) {
                System.out.print(" ");
            }
            
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            // when column is finished print new line
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int row = 0; row < 2 * n; row++) {
            int numberOfColumnInRow= row > n ? 2 * n - row : row;
            int noOfSpaces=n-numberOfColumnInRow;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            // now for every row print column
            for (int col = 0; col < numberOfColumnInRow; col++) {
                System.out.print("* ");
            }
            // when column is finished print new line
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int numberOfColumnInRow=row>n? 2*n-row:row;
            // now for every row print column
            for (int col = 0; col < numberOfColumnInRow; col++) {
                System.out.print("*");
            }
            // when column is finished print new line
            System.out.println();
        }
    }

    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            // now for every row print column
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            // when column is finished print new line
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            // now for every row print column
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // when column is finished print new line
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = n; row > 0; row--) {
            // now for every row print column
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // when column is finished print new line
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            // now for every row print column
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            // when column is finished print new line
            System.out.println();
        }
    }
}
