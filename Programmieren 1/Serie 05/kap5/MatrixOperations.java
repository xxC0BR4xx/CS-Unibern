/*
Jara Zihlmann(20-117-032) 
Vithusan Ramalingam (21-105-515) 
Jan Ellenberger (21-103-643) 
*/
package kap5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class MatrixOperations {

    private final static String PATH_MATRICES = "kap5/res/";
    // throws FileNotFoundException falls kein file für die Matrix angelgt wurde
    public static int[][] readMatrix(String fileName) throws FileNotFoundException {
        //ArrayList erstellen  und
        //Lines der Matrizen in Arrayliste einfügen
        //um die grösse zu erhalten
        Scanner scan = new Scanner(new File(PATH_MATRICES + fileName));
        ArrayList<String> matrixLines = new ArrayList<>();
        int[][] matrix = null;
        while (scan.hasNextLine()) {
            matrixLines.add(scan.nextLine());
        }
        scan.close();

        for (int i = 0; i < matrixLines.size(); i++) {
            String[] elements = matrixLines.get(i).split(" ");

            //instanzieren und alle Zahlen dem Array hinzufügen
            if (matrix == null)
                matrix = new int[matrixLines.size()][elements.length];
            for (int j = 0; j < elements.length; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
            }
        }
        //Array der Matrix zurückgeben
        return matrix;
    }


    // transposieren einer Matrix
    // Matrix darf nicht leer sein
    // Matrix muss quadratisch sein
    public static int[][] transpose(int[][] tmatrix) {
        if(tmatrix == null || tmatrix.length < 1) {
            System.out.println("Die Matrix darf nicht leeer sein!");
            return tmatrix;
            
        } 
        //überprüfen ob Matrix quadratisch ist
        else if (tmatrix[0].length != tmatrix.length){
            System.out.println("Diese Matrix kann nicht transponiert werden," 
            + "sie muss quadratisch sein");
            return null;
        }

        //matrix instanzieren mit neuer länge
        int[][] transponiert = new int[tmatrix.length][tmatrix[0].length];

        for (int i = 0; i < tmatrix.length; i++) {
            for (int j = 0; j < tmatrix[i].length; j++) {
                transponiert[j][i] = tmatrix[i][j];
            }
        }
        //transponierte Matrix zurückgeben
        return transponiert;
    }

    // Methode um Matrizen zu multiplizieren
    public static int[][] product(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length, columnA = matrixA[0].length;
        int rowsB = matrixB.length, columnB = matrixB[0].length;
        int[][] resultMatrix = new int[rowsA][columnB];

        if (columnA != rowsB) {
            System.out.println("Die beiden Matrizen sind nicht kompatibel");
            return null;
        }

        for (int i = 0; i < resultMatrix.length; i ++) {
            for (int j = 0; j < resultMatrix[i].length; j ++) {
                int sum = 0;

                for (int k = 0; k < columnA; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                resultMatrix[i][j] = sum;
            }
        }
        return resultMatrix;
    }

  
    //Methode um Matrix in einen String umzuwandeln und zurückgeben
    public static String matrixToString(int[][] matrix) {
        String matrixString = "";
        if (matrix == null)
            return "";

        for (int[] line: matrix) {
            for (int entry: line) {
                matrixString += entry + " ";
            }
            matrixString += "\n";
        }
        return matrixString;
    }
}
