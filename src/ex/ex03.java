package ex;import java.util.Scanner;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021044 鐘岑哲
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn=new Scanner(System.in);
    System.out.print("輸入=");
    int n=scn.nextInt();
    int tal=0;
    System.out.print("所有因數:");
    for(int i=1;i<=n;i++){    	
    	if(n%i==0){    		
    		System.out.print(i+" ");
            tal++;
    	}  
    	
    }
	System.out.println();
    	if(tal==2){
    		System.out.print("質數");
    	}else{
    		System.out.print("不是質數");
    	}
    	
    	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
