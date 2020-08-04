package topics.arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {

        int[][] t = {{1,1,4},{2,3,5},{3,6,7,8}};

        for (int i = 0; i < t.length ; i++) {

            for (int j = 0; j < t[i].length; j++) {

                System.out.println("Values at arr["+i+"]["+j+"] is "+t[i][j]);
            }
        }
    }
}
