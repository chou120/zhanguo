package homework;

public class Demo2 {



    public static void main(String[] args) {

        /**
         *    1
         *    11
         *    121
         *    1331
         *    14641
         *    15101051
         */

        int [] [] arr=new int[5][5];
         for (int i=0;i<5;i++){
             arr[i][0]=1;
             arr[i][i]=1;
         }
        for (int i = 0; i < 5; i++) {
           for (int  j=0;j<=i;j++){
               System.out.print(arr[i][j]+" ");
           }
            System.out.println();
        }

        for(int i=2;i<5;i++){
            for(int  j=1;j<=i-1;j++){
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }

        System.out.println("     ");
        for (int i = 0; i < 5; i++) {
            for (int  j=0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }

}
