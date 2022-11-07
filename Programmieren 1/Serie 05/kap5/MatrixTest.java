/*
Jara Zihlmann(20-117-032) 
Vithusan Ramalingam (21-105-515) 
Jan Ellenberger (21-103-643) 
*/
package kap5;

public class MatrixTest {

    public static String[] matrixDateien = {"matrix_a", "matrix_b", 
    "matrix_c", "matrix_d", "matrix_e", "matrix_z", 
    "matrix_product_a", "matrix_product_b"};

    public static void main(String[] args) {
        System.out.println("Gelesene und transponierte Matrizen:");
        //Test um gelesene Matrizen wenn möglich Transponiert ausgeben
        printTransponiertUndGeleseneMatrix();
        System.out.println("Test: Matrix Multipliziert");
        //Test multiplizierte Matrizen ausgeben
        printMultiplizierteMatrix();

    }

    //print der Multiplizierten Matrix
    public static void printMultiplizierteMatrix() {
        int[][] matrixA, matrixB, matrixProduct;

        //Matrizen multiplizieren und ausgeben
        try {
            matrixA = MatrixOperations.readMatrix("matrix_product_a");
            matrixB = MatrixOperations.readMatrix("matrix_product_b");
            matrixProduct = MatrixOperations.product(matrixA, matrixB);

            System.out.println(MatrixOperations.matrixToString(matrixA));
            System.out.println(MatrixOperations.matrixToString(matrixB));
            System.out.println(MatrixOperations.matrixToString(matrixProduct));
        } 
        //sonst ausgabe des Fehlers
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Matrizen testen
    //verschidene richtige und falsche Matrizen
    //auch throwsexeption testen mit matrix_z da diese nicht vorhanden ist
    public static void printTransponiertUndGeleseneMatrix() {
        int[][] matrix, transponierteMatrix;

        try {
            for (String fileName: matrixDateien) {
                matrix = MatrixOperations.readMatrix(fileName);
                transponierteMatrix = MatrixOperations.transpose(matrix);

                System.out.println(MatrixOperations.matrixToString(matrix));
                System.out.println(MatrixOperations.matrixToString(transponierteMatrix));
            }
        } 
        //allfällige Fehlerausgabe
        catch (Exception e) {
            System.out.println(e);
        }

    }
}