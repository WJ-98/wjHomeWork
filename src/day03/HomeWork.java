package day03;

import javax.swing.*;

public class HomeWork {
    public static void output(int num[]){
        int oddNum[];//奇数数组
        int evenNum[];//偶数数组

        int evenCount = 0;//偶数个数5
        int oddCount = 0;//奇数个数
        for(int i = 0;i<num.length;i++){
            if(num[i]%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        oddNum = new int[oddCount];
        evenNum = new int[evenCount];

        int p = 0,q = 0;
        for (int i =0;i<num.length;i++){
            if(num[i]%2==0){
                evenNum[p]=num[i];
                p++;
            }else{
                oddNum[q] = num[i];
                q++;
            }
        }//将数组Num按奇数、偶数分拣到两个数组中去
        if(evenNum.length>oddNum.length){
            for (int i = 0;i<=oddNum.length-1;i++){
                System.out.println(oddNum[i]+" "+evenNum[i]+" ");
            }//按奇数个数交替输出
            for(int i = oddNum.length;i<evenNum.length-1;i++){
                System.out.println(evenNum[i]+" ");
            }//输入剩下的偶数
        }else{
            for(int i = 0;i<evenNum.length-1;i++){
                System.out.println(oddNum[i]+" "+evenNum[i]+" ");
            }//先按偶数个数交替输出
            for(int i = evenNum.length;i<oddNum.length-1;i++){
                System.out.println(oddNum[i]+" ");
            }//输出剩下的奇数
        }
    }


    public static void main(String[] args) {
        int n[] = new int[8];
        for(int i = 0;i<n.length;i++){
            String s = JOptionPane.showInputDialog("请输入第"+(i+1)+"个整数");
            n[i]=Integer.parseInt(s);
        }
        output(n);
    }

}
