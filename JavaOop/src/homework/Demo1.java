package homework;

import java.util.Scanner;

public class Demo1 {


    /**
     * 循环输入10个数,统计每个数出现的次数
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int []   arr=new int[10]; //数组用来装统计个数的
        int x=0;

        while(x<10){
            arr[x]=sc.nextInt();
            x++;
        }

        for (int i=0;i<10;i++){
              for(int k=0;k<10-i-1;k++){
                  if(arr[k] < arr[k+1]){
                      int temp = arr[k];
                      arr[k]=arr[k+1];
                      arr[k+1]=temp;
                  }
              }
        }

        for (int i = 0; i <10; i++) {
            System.out.print(" "+arr[i]);
        }

        int [] arr2=new int[10];
        int key=0;
        for(int  i=0;i<10;i++){
            int number=arr[i];
            int count=1;

            for(int  k=i;k<9;k++){
                if(number==arr[k+1]){
                    count++;
                    i=k;
                }else{
                    arr2[key++]=count;
                    break;
                }
            }
        }


        //   213 123 123 42 23 12 12 12 12 11

        System.out.println("---------");

        for (int i = 0; i <10; i++) {
           if(arr2[i]==0){
               System.out.print(" "+arr2[i]);
           }
        }




        }

}
