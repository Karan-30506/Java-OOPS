import java.util.Scanner;

class Ch7_Question_1 {
    // Create an array of 5 floats and calculate their sum
    public static void main(String[] args) {
        double[] a = new double[5];

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i < 5 && sc.hasNextDouble()) {
            a[i++] = sc.nextDouble();
        }
        double result = 0;

        for(double num: a) {
            result += num;
        }
        
        System.out.printf("Sum = %.2f\n", result);
        sc.close();

    }
}

class Ch7_Question_2 {
    // Write a program to search in an array
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter the target Element: ");
        int target = sc.nextInt();

        int i = 0;
        while(i < 10 && sc.hasNextInt()) {
            a[i++] = sc.nextInt();
        }

        if(linearSearch(a, target)) {
            System.out.printf("Target Found\n");
        }
        else {
            System.out.printf("Target not Found\n");
        }
        
        sc.close();
    }

    static boolean linearSearch(int[] a, int target) {
        for(int num: a) {
            if(num == target)
                return true;
        }
        return false;
    }
}

class Ch7_Question_3 {
    // Add two matrices
    public static void main(String[] args) {
        int[][] a = new int[2][3];
        int [][] b = new int[2][3];
        int[][] result = new int[2][3];

        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter Elements of Matrix 1:\n");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.printf("Enter Elements of Matrix 2:\n");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        addMatrices(a, b, result);

        printMatrix(result);

        sc.close();
    }

    static void addMatrices(int[][] a, int[][] b, int[][] result) {
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    static void printMatrix(int[][] a) {
        System.out.printf("Matrix: \n");
        for(int[] row: a) {
            for(int num: row) {
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }
}

class Ch7_Question_4 {
    // reverse an array
    // min and max in an array
    // find whether array is sorted or not

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[16];
        int lena = 0;

        System.out.printf("Enter the elements of the array:\n");
        
        while (lena < 16 && sc.hasNextInt()) {
            a[lena++] = sc.nextInt();
        }

        System.out.printf("Original Array: ");
        printArray(a, lena);

        reverseArray(a, lena);
        System.out.printf("Reversed Array: ");
        printArray(a, lena);

        System.out.printf("Max = %d\nMin = %d\n", maxElement(a, lena), minElement(a, lena));

        if(isSorted(a, lena)) {
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is not Sorted");
        }
        
        sc.close();
    }

    static void printArray(int[] a, int lena) {
        for(int i = 0; i < lena; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    static void reverseArray(int[] a, int lena) {
        for(int i = 0; i < lena / 2; i++) {
            int temp = a[i];
            a[i] = a[lena - i - 1];
            a[lena - i - 1] = temp;
        }
    }

    static int maxElement(int[] a, int lena) {
        int max = a[0]; 
        for(int i = 1; i < lena; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }

    static int minElement(int[] a, int lena) {
        int min = a[0]; 
        for(int i = 1; i < lena; i++) {
            if(a[i] < min)
                min = a[i];
        }
        return min;
    }

    static boolean isSorted(int[] a, int lena) {
        for(int i = 0; i < lena - 1; i++) {
            if(a[i] > a[i + 1])
                return false;
        }
        return true;
    }
}
