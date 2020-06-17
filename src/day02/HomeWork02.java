package day02;

public class HomeWork02 {
    //求100以内所有质数的和
    public static void main(String[] args) {

        int sum = 0;
        for(int i=2;i<=100;i++){
                int j=2;
                while(i % j!=0 ){
                    j++;
                }
                if(i==j){
                    sum+=i;
                }
        }
        System.out.println(sum);
    }
}



