package luong_dep_trai.test;

public class Muti {
    public static void main(String[] args) {
        boolean [][] bools;
        int [][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        bools=new boolean[5][9];
        bools[0] [0]= true;
        bools[2] [8]= false;
        matrix[0][2]=666;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[1].length;j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
