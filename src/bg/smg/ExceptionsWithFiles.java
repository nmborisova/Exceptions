package bg.smg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExceptionsWithFiles {

    public static void main(String[] args) {

        Scanner input = null;
        PrintWriter output = null;

        try {
            File file = new File("input.txt");
            input = new Scanner(file);
            int n = input.nextInt();
            int m = input.nextInt();
            int[][] A = new int[n][m];
            for (int i=0; i<n; i++)
                for(int j=0; j<m; j++) {
                    int k = Integer.parseInt(input.next());
                    if (k<0) {
                        throw new NegativeNumberException("Въведохте отрицателно число: " + k);
                    }
                    A[i][j] = k;
                }

            File outputFile = new File("output.txt");
            //if the file exists it will overwrite it. If we don't want the file to be overridden we should include the following:
//            if (outputFile.exists()) {
//                System.out.println("File already exists");
//                System.exit(1);
//            }
            output = new PrintWriter(outputFile);
            for (int i=0; i<n; i++) {
                for (int j = 0; j < m; j++)
                    output.print(A[i][j] + " ");
                output.println();
            }
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            input.close();
            output.close();
        }


    }
}
