public class Arrays {
    public static void main(String[] args) {
        // Declaration
        int[] arr;

        // Memory Allcoation
        arr = new int[5]; // integer array of size 5

        for(int i = 0; i < 5; i++) {
            arr[i] = i + 1;
        }

        for(int num: arr) {
            System.out.println(num);
        }

        // Declartion + Memory Allocation by Initialization
        String[] names = {"Karan", "Karna", "Gaurav", "Meet"};

        for(String name: names) {
            System.out.printf("%s ", name);
        }
        System.out.println();


        // 2-D arrays
        int[][] a = new int[3][3]; // Matrix of size 3,3

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                a[i][j] = i + j;
            }
        }

        for(int[] row: a) {
            for(int num: row) {
                System.out.printf("%d ", num);
            }
            System.out.println();
        }

    }
}