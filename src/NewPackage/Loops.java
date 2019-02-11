package NewPackage;

import java.util.Scanner;

public class Loops {
    public static void main(String args[]) {
        for (int row = 1; row < 5; row++) {
            System.out.print("Row " + row + ": ");
            for (int column = 1; column < 10; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        for (int outer = 1; outer < 10; outer++) {
            for (int inner = 0; inner < outer; inner++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer i = " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("  Inner j = " + j);
            }
        }

        for (int rows = 1; rows < 10; rows++) {
            for (int columns = 1; columns < 5; columns++) {
                if (rows == columns) System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
        System.out.println();

        for (int rows = 1; rows < 10; rows++) {
            for (int columns = 0; columns < rows; columns++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int rows = 0; rows < 10; rows++) {
            for (int columns = 10; columns > rows; columns--) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int rows = 0; rows < 5; rows++) {
            for (int columns = 0; columns < 10; columns++) {
                for (int i = 0; i < 3; i++) {
                    System.out.print(columns);
                }
                System.out.print("");
            }
            System.out.println();

        }

        System.out.println();

        



    }
}
