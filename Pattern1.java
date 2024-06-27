public class Pattern1 {
    public static void main(String[] args) {
        // int n = 10; pattern1
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // int n = 10; // pattern O
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {

        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 10; Pattern A
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 || j == 0 || j == n - 1 || i == (n - 1) / 2) {

        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 10; pattern T
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 || j == (n - 1) / 2) {

        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 10; pattern H
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (j == 0 || j == n - 1 || i == (n - 1) / 2) {

        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 10; pattern E
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 || j == 0 || i == (n - 1) / 2 || i == n - 1) {

        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 10; pattern I
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 || j == (n - 1) / 2 || i == n - 1) {

        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 10; pattern W
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (j == 0 || i == n - 1 || j == (n - 1) / 2 || j == n - 1) {

        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 10;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == n - 4 || i == n - 7 || j == n - 4 || j == n - 7) {
        // System.out.print("#");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();

        // }

        // int n = 5;
        // *
        // **
        // ***
        // ****
        // *****
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 && j < n - 4 || i == n - 4 && j < n - 3 || i == n - 3 && j < n - 2
        // || i == n - 2 && j < n - 1
        // || i == n - 1) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();

        // }

        int n = 10; // pattern DID;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) / 2 || j == 0 || j == (n - 1) / 2 && i > 0 && i < n - 1
                        || i == n - 1 && j < (n - 1) / 2) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2 || i == n - 1) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) / 2 || j == 0 || j == (n - 1) / 2 && i > 0 && i < n - 1
                        || i == n - 1 && j < (n - 1) / 2) {

                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
