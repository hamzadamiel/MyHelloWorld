public class Arrays {
    public static void main(String[] args) {
        int[] newarray = new int[7];
        int[][] a = {{1,-2,3},{-4,-5,6,9},{7},};

        for (int i=0; i<a.length; i++){
            System.out.println();
            for (int j=0; j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }

        double[] myList = {1.9, 2.9, 3.4,3.5};
        //print all the array elements
        for (double element: myList){
            System.out.println(element);
        }

    }
}
