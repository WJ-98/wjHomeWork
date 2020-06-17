package day02;

public class HomeWork {


    public static void main(String[] args) {

        //打印等腰三角形
        for(int i = 0;i<5;i++){//控制行
            for(int j=0;j<=5-i;j++){//控制空格的数量
                System.out.print(" ");
            }
            for(int k =1;k<=2*i-1;k++){//控制图形的数量
                System.out.print("*");
            }
            System.out.println();
        }


    }


}
