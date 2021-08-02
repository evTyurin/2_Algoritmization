package epam.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // #1
//
//            int accumulation = 0;
//            int [] array;
//
//            Scanner input = new Scanner(System.in);
//            System.out.print("Please, enter dimension: ");
//            int dimension = input.nextInt();
//            System.out.print("Please, enter multiplicity: ");
//            int multiplicity = input.nextInt();
//
//            array = new int [dimension];
//
//            for (int i = 0; i < dimension; i++) {
//                array[i] = ((int)(Math.random() * 100));
//                if (array[i] % multiplicity == 0) {
//                    accumulation += array[i];
//                }
//                input.close();
//            }
//            System.out.println("Accumulation of numbers = " + accumulation);


//        #2
//
//        int replacementAmount = 0;
//        int [] array;
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please, enter dimension: ");
//        int dimension = input.nextInt();
//        System.out.print("Please, enter number Z: ");
//        int numberZ = input.nextInt();
//
//        array = new int [dimension];
//
//        for (int i = 0; i < dimension; i++) {
//            array[i] = ((int)(Math.random() * 200 - 100));
//            if (array[i] > numberZ) {
//                array[i] = numberZ;
//                replacementAmount++;
//            }
//            input.close();
//        }
//        System.out.println("Amount of replacement = " + replacementAmount);


//        #3
//
//        int [] array;
//        int plusAmount = 0;
//        int minusAmount = 0;
//        int nullAmount = 0;
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please, enter dimension: ");
//        int dimension = input.nextInt();
//
//        array = new int [dimension];
//
//        for (int i = 0; i < dimension; i++) {
//            array[i] = ((int)(Math.random() * 200 - 100));
//            if (array[i] > 0) {
//                plusAmount++;
//            }
//            else if (array[i] < 0) {
//                minusAmount++;
//            }
//            else if (array[i] == 0) {
//                nullAmount++;
//            }
//        }
//        input.close();
//
//        System.out.println("amount Of Plus = " + plusAmount);
//        System.out.println("amount Of Minus = " + minusAmount);
//        System.out.println("amount Of Null = " + nullAmount);


        //        #4
//
//        int dimension;
//        int [] array;
//        int minNumber;
//        int maxNumber;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, enter dimension ");
//        dimension = in.nextInt();
//        array = new int [dimension];
//
//        for (int i = 0; i < dimension; i++){
//            array[i] = ((int)(Math.random()*200 - 100));
//        }
//        maxNumber = array[0];
//        minNumber = array[0];
//
//        for (int j: array) {
//            if (j >= maxNumber) {
//                maxNumber = j;
//            }
//            if (j <= minNumber) {
//                minNumber = j;
//            }
//        }
//        System.out.println("maxNumber = " + maxNumber);
//        System.out.println("minNumber = " + minNumber);



        //        #5
//
//
//        int[] array;
//        int dimension;
//        int i;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, enter dimension ");
//        dimension = in.nextInt();
//        System.out.print("Please, enter i ");
//        i = in.nextInt();
//
//        array = new int[dimension];
//
//        for (int c = 0; c < dimension; c++) {
//            array[c] = ((int) (Math.random() * 100));
//        }
//        for (int j : array) {
//            if (j > i) {
//                System.out.println(j + " > " + i);
//
//            }
//        }


        //        #6
//
//
//        int[] array;
//        int dimension;
//        int sum = 0;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, enter dimension ");
//        dimension = in.nextInt();
//
//        array = new int[dimension];
//        for (int i = 0; i < dimension; i++){
//            array[i] = ((int)(Math.random()*200 - 100));
////            System.out.println(array[i]);
//
//            if  (i < 4 && i > 1) {
//                sum += array[i];
//                System.out.println("i = " + i);
//                System.out.println("array = " + array[i]);
//            } else {
//                for (int j = 2; j < i; j++) {
//                    if (i % j == 0 ) {
//                        break;
//                    } else if (j == i - 1) {
//                        sum += array[i];
//                    }
//                }
//            }
//        }
//        System.out.println("Sum = " + sum);



        //        #7
//
//
//        int[] array;
//        int maxNumber;
//        int dimension;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, enter dimension ");
//        dimension = in.nextInt();
//
//        array = new int[dimension];
//        for (int i = 0; i < dimension; i++) {
//            array[i] = ((int) (Math.random() * 200 - 100));
//            System.out.println(array[i]);
//        }
//
//        maxNumber = array[0] + array[dimension - 1];
//        for (int i = 0; i < dimension; i++, dimension--) {
//            if (maxNumber < array[i] + array[dimension - 1]) {
//                maxNumber = array[i] + array[dimension - 1];
//            }
//        }
//        System.out.println("maxNumber = " + maxNumber);


        //        #8
//
//
//        int[] firstArray;
//        int minNumber;
//        int counter = 0;
//        int amountOfMonNumber;
//        int dimension;
//        int [] secondArray;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, enter dimension ");
//        dimension = in.nextInt();
//
//        firstArray = new int[dimension];
//        for (int i = 0; i < dimension; i++) {
//            firstArray[i] = ((int) (Math.random() * 200 - 100));
//            System.out.println(firstArray[i]);
//        }
//        minNumber = firstArray[0];
//        for (int i = 0; i < dimension; i++) {
//            if (minNumber > firstArray[i]) {
//                minNumber = firstArray[i];
//            }
//        }
//
//        for (int i = 0; i < dimension; i++) {
//            if (firstArray[i] == minNumber) {
//                counter++;
//            }
//        }
//
//        System.out.println();
//
//        secondArray = new int[dimension - counter];
//        counter = 0;
//        for (int i = 0; i < secondArray.length; i++) {
//
//            if (firstArray[i] == minNumber) {
//                counter++;
//            }
//            secondArray[i] = firstArray[i + counter];
//            System.out.println(secondArray[i]);
//        }

        //TODO


        //        #2.1
//
//        int amountOfStrings;
//        int amountOfColumns;
//        int[][] matrix;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, enter amount of strings: ");
//        amountOfStrings = in.nextInt();
//        System.out.print("Please, enter amount of columns: ");
//        amountOfColumns = in.nextInt();
//
//        matrix = new int[amountOfStrings][amountOfColumns];
//
//        System.out.println("Basic matrix:");
//        System.out.println("_________________");
//
//        for (int i = 0; i < amountOfStrings; i++) {
//            for (int j = 0; j < amountOfColumns; j++) {
//                matrix[i][j] = ((int) (Math.random() * 200 - 100));
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
//
//        System.out.println("_________________\n");
//        System.out.println("uneven columns:");
//        System.out.println("_________________");
//
//        for (int j = 0; j < amountOfColumns; j++) {
//            if (j % 2 == 0 & matrix[0][j] > matrix[amountOfStrings - 1][j]) {
//                System.out.println("myMatrix[0]["+j+"] = "  + matrix[0][j] + " > " +
//                        "myMatrix["+ (amountOfStrings - 1) + "]["+j+"] = "  + matrix[amountOfStrings - 1][j]);
//                for (int u = 0; u < amountOfStrings; u++) {
//                    System.out.println(matrix[u][j]);
//                }
//                System.out.println("_________________");
//            }
//        }
//
//        in.close();



        //        #2.2
//
//            int amountOfStrings;
//            int amountOfColumns;
//            int [][] matrix;
//            Scanner in = new Scanner(System.in);
//            System.out.print("Please, amount of strings(columns): ");
//            amountOfStrings = in.nextInt();
//            amountOfColumns = amountOfStrings;
//
//            matrix = new int[amountOfStrings][amountOfColumns];
//
//            System.out.println("Исходная матрица:");
//            System.out.println("_________________");
//
//            for (int i = 0; i < amountOfStrings; i++) {
//                for (int j = 0; j < amountOfColumns; j++) {
//                    matrix[i][j] = ((int) (Math.random() * 200 - 100));
//                    System.out.print(matrix[i][j] + " ");
//                }
//                System.out.print("\n");
//            }
//
//            System.out.println("_________________\n");
//            System.out.println("Diagonal elements:");
//            System.out.println("_________________");
//
//            for (int i = 0; i < amountOfStrings; i++) {
//                for (int j = 0; j < amountOfColumns; j++) {
//                    if ((i == j) || (i + j == amountOfStrings - 1)) System.out.print(matrix[i][j] + " ");
//                }
//            }
//
//            in.close();


        //        #2.3
//
//        int amountOfStrings;
//        int amountOfColumns;
//        int[][] matrix;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, enter amount of strings: ");
//        amountOfStrings = in.nextInt();
//        System.out.print("Please, enter amount of columns: ");
//        amountOfColumns = in.nextInt();
//
//        matrix = new int[amountOfStrings][amountOfColumns];
//
//        System.out.println("Basic Matrix:");
//        System.out.println("_________________");
//
//        for (int i = 0; i < amountOfStrings; i++) {
//            for (int j = 0; j < amountOfColumns; j++) {
//                matrix[i][j] = ((int) (Math.random() * 200 - 100));
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
//
//        System.out.println("_________________\n");
//        System.out.print("Which string should be printed? ");
//        int k = in.nextInt();
//        System.out.println("_________________\n");
//
//        for (int j = 0; j < amountOfStrings; j++) System.out.print(matrix[k - 1][j] + " ");
//
//        System.out.println("\n_________________\n");
//        System.out.print("Which column should be printed? ");
//        int p = in.nextInt();
//        System.out.println("_________________");
//
//        for (int j = 0; j < amountOfColumns; j++) System.out.println(matrix[j][p - 1]);
//
//        in.close();


        //        #2.4
//
//        int amountOfStrings;
//        int amountOfColumns;
//        int [][] matrix;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, amount of strings(columns): ");
//        amountOfStrings = in.nextInt();
//        amountOfColumns = amountOfStrings;
//
//        if (amountOfStrings % 2 == 1) System.exit(0);
//
//        matrix = new int[amountOfStrings][amountOfColumns];
//
//        System.out.println("Basic matrix:");
//        System.out.println("_________________");
//
//        int x = 0;
//        int y = amountOfColumns;
//
//        for (int i = 0; i < amountOfStrings; i++) {
//            for (int j = 0; j < amountOfColumns; j++) {
//                if (i % 2 == 0) matrix[i][j] = ++x;
//                else matrix[i][j] = y--;
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.print("\n");
//            x = 0;
//            y = amountOfColumns;
//        }
//
//        in.close();


        //        #2.5
//
//        int amountOfStrings;
//        int amountOfColumns;
//        int [][] matrix;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, amount of strings(columns): ");
//        amountOfStrings = in.nextInt();
//        amountOfColumns = amountOfStrings;
//
//        if (amountOfStrings % 2 == 1) System.exit(0);
//
//        matrix = new int[amountOfStrings][amountOfColumns];
//
//        System.out.println("Basic matrix:");
//        System.out.println("_________________");
//
//        for (int i = 0; i < amountOfStrings; i++) {
//            for (int j = 0; j < amountOfColumns; j++) {
//                if (i + j < amountOfColumns) matrix[i][j] = i + 1;
//                else matrix[i][j] = 0;
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
//
//        in.close();

        //        #2.6
//
//        int amountOfStrings;
//        int amountOfColumns;
//        int [][] matrix;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, amount of strings(columns): ");
//        amountOfStrings = in.nextInt();
//        amountOfColumns = amountOfStrings;
//
//        if (amountOfStrings % 2 == 1) System.exit(0);
//
//        matrix = new int[amountOfStrings][amountOfColumns];
//
//        System.out.println("Basic matrix:");
//        System.out.println("_________________");
//
//        for (int i = 0; i < amountOfStrings; i++) {
//            for (int j = 0; j < amountOfColumns; j++) {
//                if (((i > 0)&&(i + j <= amountOfStrings - 2)&&(i > j)) ||
//                        ((i + j >= amountOfStrings)&(i < j))){
//                    matrix[i][j] = 0;
//                }
//                else {
//                    matrix[i][j] = 1;
//                }
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
//
//        in.close();

        //        #2.7
//
//        int amountOfStrings;
//        int sum = 0;
//        double[][] matrix;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, amount of strings(columns): ");
//        amountOfStrings = in.nextInt();
//
//        matrix = new double[amountOfStrings][amountOfStrings];
//
//        System.out.println("Basic Matrix:");
//        System.out.println("_________________");
//
//        for (int i = 0; i < amountOfStrings; i++) {
//            for (int j = 0; j < amountOfStrings; j++) {
//                matrix[i][j] = Math.sin((Math.pow(i,2) - Math.pow(j,2)) / Math.pow(amountOfStrings,2));
//                System.out.print(matrix[i][j] + " ");
//                if (matrix[i][j] > 0) sum++;
//            }
//            System.out.print("\n");
//            System.out.print("\n");
//        }
//
//        System.out.println("Amount of positive elements = " + sum);
//
//        in.close();

        //        #2.8
//
//        int[][] matrix;
//        int amoumtOfString;
//        int amountOfColumn;
//        int tmp;
//        int s1;
//        int s2;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, введите количество строк...: ");
//        amoumtOfString = in.nextInt();
//        System.out.print("Please, введите количество столбцов...: ");
//        amountOfColumn = in.nextInt();
//
//
//        matrix = new int[amoumtOfString][amountOfColumn];
//
//        System.out.println("Исходная матрица:");
//        System.out.println("_________________");
//
//        for (int i = 0; i < amoumtOfString; i++) {
//            for (int j = 0; j < amountOfColumn; j++) {
//                matrix[i][j] = ((int) (Math.random() * 200 - 100));
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
//
//        System.out.println("\n_________________\n");
//        System.out.print("Which column should be changed? ");
//        s1 = in.nextInt();
//
//        System.out.println("\n_________________\n");
//        System.out.print("Which column should be changed? ");
//        s2 = in.nextInt();
//        System.out.println("_________________");
//
//        for (int j = 0; j < amoumtOfString; j++) {
//            tmp = matrix[j][s1 - 1];
//            matrix[j][s1 - 1] = matrix[j][s2 - 1];
//            matrix[j][s2 - 1] = tmp;
//        }
//
//        System.out.println("\n_________________\n");
//        System.out.print("Finished matrix");
//        System.out.println("\n_________________");
//        for (int i = 0; i < amoumtOfString; i++) {
//            for (int j = 0; j < amountOfColumn; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.print("\n");
//        }



        //        #2.9
//
//        int[][] matrix;
//        int amountOfStrings;
//        int amountOfColumns;
//        int sum = 0;
//        int maxSum = 0;
//        int maxColumn = 0;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, enter amount of Strings: ");
//        amountOfStrings = in.nextInt();
//        System.out.print("Please, enter amount of columns: ");
//        amountOfColumns = in.nextInt();
//
//
//        matrix = new int[amountOfStrings][amountOfColumns];
//
//        System.out.println("Basic matrix:");
//        System.out.println("_________________");
//
//        for (int i = 0; i < amountOfStrings; i++) {
//            for (int j = 0; j < amountOfColumns; j++) {
//                matrix[i][j] = ((int) (Math.random() * 100));
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
//
//        for (int i = 0; i < amountOfColumns; i++) {
//            for (int j = 0; j < amountOfStrings; j++) {
//
//                sum += matrix[j][i];
//
//                if (maxSum < sum) {
//                    maxSum = sum;
//                    maxColumn = i + 1;
//                }
//            }
//            sum = 0;
//        }
//
//        System.out.println("_________________");
//        System.out.println("\nMax sum of elements у " + maxColumn + " column = " + maxSum);
//
//        in.close();



        //        #2.10
//
//            int amountOfStrings;
//            int amountOfColumns;
//            int [][] matrix;
//            Scanner in = new Scanner(System.in);
//            System.out.print("Please, amount of strings(columns): ");
//            amountOfStrings = in.nextInt();
//            amountOfColumns = amountOfStrings;
//        matrix = new int[amountOfStrings][amountOfColumns];
//
//        System.out.println("Basic matrix:");
//        System.out.println("_________________");
//
//        for (int i = 0; i < amountOfStrings; i++) {
//            for (int j = 0; j < amountOfColumns; j++) {
//                matrix[i][j] = ((int) (Math.random() * 200 - 100));
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
//
//        System.out.println("\nPositive elements from main diagonal: \n");
//
//        for (int i = 0; i < amountOfStrings; i++) {
//            for (int j = 0; j < amountOfColumns; j++) {
//                if (i == j & matrix[i][j] > 0)System.out.print(matrix[i][j] + " ");;
//            }
//        }

        //        #2.11
//
//        int[][] matrix;
//        int amountOfStrings;
//        int amountOfColumns;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Amount of strings = 10");
//        amountOfStrings = 10;
//        System.out.println("Amount of columns = 20");
//        amountOfColumns = 20;
//
//        matrix = new int[amountOfStrings][amountOfColumns];
//
//        System.out.println("\nbasic matrix:");
//        System.out.println("_________________\n");
//
//        for (int i = 0; i < amountOfStrings; i++) {
//            for (int j = 0; j < amountOfColumns; j++) {
//                matrix[i][j] = ((int) (Math.random() * 15));
//                if (matrix[i][j] < 10) System.out.print(" " + matrix[i][j] + " ");
//                else System.out.print(matrix[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
//
//        int amountOf5 = 0;
//
//        for (int i = 0; i < amountOfStrings; i++) {
//            for (int j = 0; j < amountOfColumns; j++) {
//                if (matrix[i][j] == 5) amountOf5++;
//            }
//            if (amountOf5 >= 3)System.out.println("\nIn the string " + (i+1) + " you can find " + amountOf5 + " of five");
//            amountOf5 = 0;
//        }
//
//        in.close();

//TODO

        //        #3.6
//
//        int [] array;
//        int dimension;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, enter dimension: ");
//        dimension = in.nextInt();
//
//        array = new int [dimension];
//
//        for (int i = 0; i < dimension; i++) {
//            array[i] = ((int)(Math.random() * 200 - 100));
//            System.out.print(array[i] + " ");
//        }
//
//        int temp;
//
//        for (int i = 0; i < dimension - 1; ) {
//            if (array[i] > array[i + 1]) {
//                temp = array[i];
//                array[i] = array[i + 1];
//                array[i + 1] = temp;
//                if (i > 0) i--;
//            }
//            if (array[i] <= array[i + 1]) i++; // else
//        }
//
//        System.out.print("\n\n");
//
//        for (int i = 0; i < dimension; i++) {
//            System.out.print(array[i] + " ");
//        }


        //        #3.7
//
//        int firstDimension;
//        int secondDimension;
//        int[] firstArray;
//        int[] secondArray;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, enter firstDimension: ");
//        firstDimension = in.nextInt();
//        System.out.print("Please, enter secondDimension: ");
//        secondDimension = in.nextInt();
//
//        firstArray = new int[firstDimension];
//
//        secondArray = new int[secondDimension];
//
//        for (int i = 0; i < firstDimension; i++) {
//            if (i == 0) firstArray[i] = ((int) (Math.random() * 10));
//            else firstArray[i] = firstArray[i - 1] + ((int) (Math.random() * 10));
//            System.out.print(firstArray[i] + " ");
//        }
//
//        System.out.print("\n" + "\n");
//
//        for (int i = 0; i < secondDimension; i++) {
//            if (i == 0) secondArray[i] = ((int) (Math.random() * 10));
//            else secondArray[i] = secondArray[i - 1] + ((int) (Math.random() * 10));
//            System.out.print(secondArray[i] + " ");
//        }
//
//        int firstCounter = 0;
//
//        System.out.print("\n" + "\n");
//
//        for (int i = 0; i < secondDimension; i++){
//            for (int j = 0; j < firstDimension; j++){
//                if(firstArray[j] >= secondArray[i]) {
//                    System.out.println("Element " + secondArray[i] +
//                            " should be on " + (firstCounter + j + 1) + " place of 1 array");
//                    firstCounter++;
//                    break;
//                }
//                else if (firstArray[firstDimension - 1] < secondArray[i]) {
//                    System.out.println("Element " + secondArray[i] +
//                            " should be on " + (firstCounter + firstDimension + 1) + " place of 1 array");
//                    firstCounter++;
//                    break;
//                }
//            }
//        }


        //        #3.8
//
//        long[] firstArray;
//        long[] secondArray;
//        int dimension;
//        long firstCounter = 0;
//        long bigger = 0;
//        int secondCounter = 1;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please, enter amount: ");
//        dimension = in.nextInt();
//
//        firstArray = new long[dimension];
//        secondArray = new long[dimension];
//
//        long[] amountOfFirstArray;
//        amountOfFirstArray = new long[dimension];
//
//        long[] amountOfSecondArray;
//        amountOfSecondArray = new long[dimension];
//
//        for (int i = 0; i < dimension; i++) {
//            firstArray[i] = ((int) ((Math.random() * 100 )*Math.random()) + 1);
//        }
//
//        for (int i = 0; i < dimension; i++) {
//            secondArray[i] = ((long) ((Math.random() * 100 )*Math.random()) + 1);
//            if(i == 0) firstCounter = secondArray[i];
//            else firstCounter = firstCounter * secondArray[i];
//        }
//
//        for (int i = 0; i < dimension; i++) {
//            if (firstArray[i] > 9 & secondArray[i] > 9)
//                System.out.print(firstArray[i] + "  ");
//            else if (firstArray[i] < 10 & secondArray[i] > 9)
//                System.out.print(firstArray[i] + "   ");
//            else if (firstArray[i] > 9 & secondArray[i] < 10)
//                System.out.print(firstArray[i] + "  ");
//            else if (firstArray[i] < 10 & secondArray[i] < 10)
//                System.out.print(firstArray[i] + "  ");
//        }
//
//        System.out.print("\n");
//
//        for (int i = 0; i < dimension; i++) {
//            if (firstArray[i] > 9 & secondArray[i] > 9)
//                System.out.print("--  ");
//            else if (firstArray[i] < 10 & secondArray[i] > 9)
//                System.out.print("--  ");
//            else if (firstArray[i] > 9 & secondArray[i] < 10)
//                System.out.print("--  ");
//            else if (firstArray[i] < 10 & secondArray[i] < 10)
//                System.out.print("-  ");
//        }
//
//        System.out.print("\n");
//
//        for (int i = 0; i < dimension; i++) {
//            if (firstArray[i] > 9 & secondArray[i] > 9)
//                System.out.print(secondArray[i] + "  ");
//            else if (firstArray[i] < 10 & secondArray[i] > 9)
//                System.out.print(secondArray[i] + "  ");
//            else if (firstArray[i] > 9 & secondArray[i] < 10)
//                System.out.print(secondArray[i] + "   ");
//            else if (firstArray[i] < 10 & secondArray[i] < 10)
//                System.out.print(secondArray[i] + "  ");
//        }
//
//        System.out.print("\n");
//        System.out.print("\n");
//        System.out.print("common denominator = " + firstCounter);
//        System.out.print("\n");
//        System.out.print("make common denominator:");
//
//        for (int i = 0; i < dimension; i++) {
//            firstArray[i] = firstArray[i] * firstCounter / secondArray[i];
//        }
//
//        for (int i = 0; i < dimension; i++) {
//            secondArray[i] =  secondArray[i] * firstCounter / secondArray[i];
//
//        }
//
//
//
//        for (int j = 0; j < dimension; j++){
//            for (long i = firstArray[j]; i > 10; i = i / 10) {
//                secondCounter++;
//            }
//            amountOfFirstArray[j] = secondCounter;
//            secondCounter = 1;
//            for (long i = secondArray[j]; i > 10; i = i / 10) {
//                secondCounter++;
//            }
//
//            amountOfSecondArray[j] = secondCounter;
//            secondCounter = 1;
//        }
//
//        System.out.print("\n");
//        System.out.println("_________________________________");
//        System.out.print("\n");
//
//        for (int i = 0; i < dimension; i++) {
//            System.out.print(firstArray[i] + "   ");
//
//            if (amountOfFirstArray[i] < amountOfSecondArray[i]) {
//                for(int j = 0; j < amountOfSecondArray[i] - amountOfFirstArray[i]; j++) {
//                    System.out.print(" ");
//                }
//            }
//
//        }
//
//        System.out.print("\n" );
//
//        for (int i = 0; i < dimension; i++) {
//
//            if (amountOfFirstArray[i] > amountOfSecondArray[i]) {
//                bigger = amountOfFirstArray[i]; }
//            else { bigger = amountOfSecondArray[i]; }
//
//            for (int j = 0; j < bigger; j++) {
//                System.out.print("-");
//            }
//            System.out.print("   ");
//        }
//
//        System.out.print("\n");
//
//        for (int i = 0; i < dimension; i++) {
//            System.out.print(secondArray[i] + "   ");
//
//
//            if (amountOfFirstArray[i] > amountOfSecondArray[i]) {
//                for(int j = 0; j < amountOfFirstArray[i] - amountOfSecondArray[i]; j++) {
//                    System.out.print(" ");
//                }
//            }
//        }
//
//        long temp;
//        for (int i = 0; i < dimension - 1; ) {
//            if (firstArray[i] > firstArray[i + 1]) {
//                temp = firstArray[i];
//                firstArray[i] = firstArray[i + 1];
//                firstArray[i + 1] = temp;
//                if (i > 0) i--;
//            }
//            if (firstArray[i] <= firstArray[i + 1]) i++;
//        }
//
//        for (int i = 0; i < dimension - 1; ) {
//            if (amountOfFirstArray[i] > amountOfFirstArray[i + 1]) {
//                temp = amountOfFirstArray[i];
//                amountOfFirstArray[i] = amountOfFirstArray[i + 1];
//                amountOfFirstArray[i + 1] = temp;
//                if (i > 0) i--;
//            }
//            if (amountOfFirstArray[i] <= amountOfFirstArray[i + 1]) i++;
//        }
//
//        System.out.print("\n");
//
//
//        System.out.print("\n");
//        System.out.print("sort ");
//        System.out.print("\n");
//        System.out.println("_________________________________");
//        System.out.print("\n");
//
//        for (int i = 0; i < dimension; i++) {
//            System.out.print(firstArray[i] + "   ");
//
//            if (amountOfFirstArray[i] < amountOfSecondArray[i]) {
//                for(int j = 0; j < amountOfSecondArray[i] - amountOfFirstArray[i]; j++) {
//                    System.out.print(" ");
//                }
//            }
//
//        }
//
//        System.out.print("\n" );
//
//        for (int i = 0; i < dimension; i++) {
//
//            if (amountOfFirstArray[i] > amountOfSecondArray[i]) {
//                bigger = amountOfFirstArray[i]; }
//            else { bigger = amountOfSecondArray[i]; }
//
//            for (int j = 0; j < bigger; j++) {
//                System.out.print("-");
//            }
//            System.out.print("   ");
//        }
//
//        System.out.print("\n");
//
//        for (int i = 0; i < dimension; i++) {
//            System.out.print(secondArray[i] + "   ");
//
//
//            if (amountOfFirstArray[i] > amountOfSecondArray[i]) {
//                for(int j = 0; j < amountOfFirstArray[i] - amountOfSecondArray[i]; j++) {
//                    System.out.print(" ");
//                }
//            }
//        }

//TODO

        //        #4.2
//
//        int numberA;
//        int numberB;
//        int numberC;
//        int numberD;
//        int nodResult;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter А ");
//        numberA = in.nextInt();
//        System.out.print("Enter В ");
//        numberB = in.nextInt();
//        System.out.print("Enter C ");
//        numberC = in.nextInt();
//        System.out.print("Enter D ");
//        numberD = in.nextInt();
//
//        nodResult = nod(numberA,numberB,numberC,numberD);
//        System.out.println("NOD = " + nodResult);
//    }
//
//    public static int nod (int a, int b, int c, int d) {
//        int temp = 1;
//        if (a <= b && a <= c && a <= d) temp = a;
//        else if (b <= a && b <= c && b <= d) temp = b;
//        else if (c <= a && c <= b && c <= d) temp = c;
//        else temp = d;
//
//        while (1 < temp) {
//            if (a % temp == 0 && b % temp == 0 && c % temp == 0 && d % temp == 0) return temp;
//            else temp--;
//        }
//
//        return temp;


        //        #4.3
//
//        double a;
//        double sixAngleSquare;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter А ");
//        a = in.nextDouble();
//
//        sixAngleSquare = square(a);
//        System.out.println("Square = " + sixAngleSquare);
//    }
//
//    public static double square (double a) {
//        return 6 * ((Math.sqrt(3)/4) * Math.pow(a,2));
//    }

        //        #4.4
//
//        int a;
//        double[][] array;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter А ");
//        a = in.nextInt();
//
//        array = new double[2][a];
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < a; j++) {
//                array[i][j] = (Math.random() * 100 - 20);
//                System.out.println("array[" + i + "][" + j + "] = " + array[i][j]);
//            }
//        }
//
//        square(array);
//    }
//
//    public static void square(double[][] array) {
//        double distance;
//        double maxDistance = 0;
//        double pointX1 = array[0][0], pointX2 = array[0][1], pointY1 = array[1][0], pointY2 = array[1][1];
//
//        for (int i = 0; i < array[0].length - 1; i++) {
//            for (int j = 0 + i; j < array[0].length - 1; j++) {
//                distance = Math.sqrt(Math.pow(array[0][i] - array[0][j], 2) + Math.pow(array[1][i] - array[1][j], 2));
//                if (j == 0) {
//                    maxDistance = distance;
//                } else if (distance > maxDistance) {
//                    maxDistance = distance;
//                    pointX1 = array[0][j];
//                    pointX2 = array[0][i];
//                    pointY1 = array[1][j];
//                    pointY2 = array[1][i];
//                }
//            }
//        }
//        System.out.println("\npointX1 = " + pointX1);
//        System.out.println("pointX2 = " + pointX2);
//        System.out.println("pointY1 = " + pointY1);
//        System.out.println("pointY2 = " + pointY2);
//        System.out.println("maxDistance = " + maxDistance);



        //        #4.5
//
//        int n;
//        int[] array;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter dimension of array N ");
//        n = in.nextInt();
//
//        array = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            array[i] = (int) (Math.random() * 100 - 20);
//        }
//
//        lessThenBigger(array);
//    }
//
//    public static void lessThenBigger (int [] array) {
//
//        int maxNumber;
//        int lessThenMaxNumber;
//
//        if (array[0] < array[1]) {
//            maxNumber = array[1];
//            lessThenMaxNumber = array[0];
//        } else {
//            maxNumber = array[0];
//            lessThenMaxNumber = array[1];
//        }
//
//        for (int i = 2; i < array.length; i++) {
//
//            if (array[i] > maxNumber) {
//                lessThenMaxNumber = maxNumber;
//                maxNumber = array[i];
//            } else if (array[i] < maxNumber && array[i] > lessThenMaxNumber) {
//                lessThenMaxNumber = array[i];
//            }
//        }
//        System.out.println("lessThenMaxNumber = " + lessThenMaxNumber);



        //        #4.6
//
//        int numberA;
//        int numberB;
//        int numberC;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter А ");
//        numberA = in.nextInt();
//        System.out.print("Enter В ");
//        numberB = in.nextInt();
//        System.out.print("Enter C ");
//        numberC = in.nextInt();
//
//        simpleNumbers (numberA, numberB, numberC);
//    }
//
//    public static void simpleNumbers(int a, int b, int c) {
//        int temp;
//        if (a <= b && a <= c) temp = a;
//        else if (b <= a && b <= c) temp = b;
//        else temp = c;
//
//        while (temp > 1) {
//            if (a % temp == 0 && b % temp == 0 && c % temp == 0) {
//                System.out.println("Not simple numbers ");
//                break;
//            }
//            else {
//                temp--;
//            }
//        }
//
//        if (temp == 1){
//            System.out.println("Simple numbers ");
//        }


        //        #4.7
//
//        factorialSum ();
//    }
//
//    public static void factorialSum() {
//
//        int sum = 0;
//        int factorial = 1;
//
//        for (int i = 1; i <= 9; i = i + 2){
//            for (int j = 1; j <= i; j++){
//                factorial *= j;
//            }
//            sum += factorial;
//            factorial = 1;
//            System.out.println("sum = " + sum);
//        }


        //        #4.8
//
//        int n;
//        int k;
//        int m;
//        int[] array;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter dimension of array N ");
//        n = in.nextInt();
//
//        System.out.print("Enter k ");
//        k = in.nextInt();
//        System.out.print("Enter B ");
//        m = in.nextInt();
//
//        array = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            array[i] = (int) (Math.random() * 100 - 20);
//        }
//
//        tripleSum(array, k, m);
//    }
//
//    public static void tripleSum (int [] array, int k, int m) {
//
//        int sum;
//
//        while (k < m - 1) {
//            sum = array[k - 1] + array[k] + array[k + 1];
//            System.out.println("sum = " + sum);
//            k = k + 2;
//        }

        //        #4.9
//
//        double numberX;
//        double numberY;
//        double numberZ;
//        double numberT;
//        double square;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter X ");
//        numberX = in.nextDouble();
//        System.out.print("Enter Y ");
//        numberY = in.nextDouble();
//        System.out.print("Enter Z ");
//        numberZ = in.nextDouble();
//        System.out.print("Enter T ");
//        numberT = in.nextDouble();
//
//        square = square(numberX,numberY,numberZ,numberT);
//        System.out.println("square = " + square);
//    }
//
//    public static double square (double x, double y, double z, double t) {
//
//        double hypotenuse;
//        double p;
//        double squareTriangle;
//        double quadrangle;
//
//        hypotenuse = Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
//
//        p = (hypotenuse + z + t)/2;
//
//        squareTriangle = Math.sqrt( p * (p - hypotenuse) * (p - z) * (p - t));
//
//        quadrangle = squareTriangle + ((x * y) / 2);
//
//        return  quadrangle;



        //        #4.10
//
//        int numberN = 3456;
//
//        int [] myArray = new int[4];
//
//        amountOfNumerals(myArray,numberN);
//    }
//
//
//    public static void amountOfNumerals (int [] myArray, int y) {
//
//        for (int i = 0; y > 0; y = y/10 ) {
//            myArray[i] = y;
//            i++;
//        }
//
//        System.out.println("myArray.length = " + myArray.length);
//        for (int i = 0; i < myArray.length - 1; i++ ) {
//            myArray[i] = myArray[i] - myArray[i + 1] * 10;
//            System.out.println("myArray[" + i + "] = " + myArray[i]);
//        }
//        System.out.println("myArray[" + (myArray.length - 1) + "] = " + myArray[myArray.length - 1]);


        //        #4.11
//
//        int numberX;
//        int numberY;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter X ");
//        numberX = in.nextInt();
//        System.out.print("Enter Y ");
//        numberY = in.nextInt();
//
//        amountOfNumerals(numberX, numberY);
//    }
//
//
//    public static void amountOfNumerals (int x, int y) {
//
//        int countX = 0, countY = 0;
//
//        while (x > 0) {
//            countX++;
//            x /= 10;
//        }
//
//        while (y > 0) {
//            countY++;
//            y /= 10;
//        }
//
//        if (countX > countY) {
//            System.out.println("X is bigger");
//        }
//        else if (countY > countX) {
//            System.out.println("Y is bigger");
//        }


        //TODO 12

        //        #4.13
//
//        int numberN;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter n");
//        numberN = in.nextInt();
//
//        twinNumbers (numberN);
//    }
//
//    public static void twinNumbers(int a) {
//        int [] myArray = new int[2*a - a + 1];
//        int temp;
//        int number = 0;
//
//        for (int j = 0; j <= a; j++) {
//            myArray[j] = a + j;
//        }
//
//
//        for (int i = 0; i <= a ; i++) {
//            temp = a + i;
//            while (temp > 2) {
//                temp--;
//                if ((a + i) % temp == 0 && temp >= 2) {
//                    break;
//                }
//                else if ((a + i) % temp != 0 && temp == 2) {
//                    if (a + i - number == 2) {
//                        System.out.println("pair = " + number + " and "  + (a + i));
//                    }
//                    number = a + i;
//                }
//            }
//
//        }

        //        #4.14
//
//        int numberN;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число n ");
//        numberN = in.nextInt();
//
//        armstrongNumber (numberN);
//    }
//
//    public static void armstrongNumber(int a) {
//        int extent = 1;
//        int temp;
//        int armstrongNumber = 0;
//
//        for (int j = 1; j <= a; j++) {
//            temp = j;
//            while (temp > 9) {
//                temp = temp / 10;
//                extent++;
//            }
//            temp = j;
//
//            for (int i = 0; i < extent; i++){
//                armstrongNumber += Math.pow(((temp / Math.pow(10, i)) % 10),extent);
//                temp -= ((temp / Math.pow(10, i)) % 10)*Math.pow(10,i);
//            }
//
//            if (armstrongNumber == j) {
//                System.out.println("armstrongNumber = " + armstrongNumber);
//            }
//            armstrongNumber = 0;
//            extent = 1;
//        }

//TODO 15

    }
}
