
//public class Pattern {
//    public static void main(String[] args) {
//        int rows = 4; // Number of rows in the pattern
//
//        // Loop through each row
//        for (int i = 1; i <= rows; i++) {
//            // Print '+' for the current row
//            for (int j = 1; j <= 4; j++) {
//                System.out.print("+");
//            }
//            // Move to the next line after each row
//            System.out.println();
//        }
//    }
//}

public class Pattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pyramid

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print '+' symbols for the current row
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("+");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
