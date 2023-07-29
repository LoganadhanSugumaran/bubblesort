package dhoni;

public class practice {
    public static void main(String[] args) {
       int [][] ar=new int[3][3];
       int val=1;
       int row;
       int col;
       for( row = 0;row<3;row++){
           for(col=0;col<3;col++){
               ar[row][col]=val;
               val+=1;
               col++;
           }
           row++;
       }
      /*  while (row < 3) {
            int col=0;
            while (col < 3) {
                ar[row][col]=val;
                val+=1;
                col++;
            }
            row++;
        }*/
        int total=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                if (i == j) {
                    total = total + ar[i][j];
                }
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("diagonal total "+ total);
    }
}
