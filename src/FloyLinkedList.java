import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;

public class FloyLinkedList {
		public static void main(String args[]){
		int m=0;							//
		int i=0,j=0,k=0;					//i is row index, j is column index
		int e=0;							//e is one-dimension index
		int ai=0,aj=0;
		/*
		System.out.println("Input the Rank");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();				//n is the rank of matrix
		int P[][]= new int[n][n];           //P[][] is the value of matrix
		System.out.println("Input the value");
		for(i=0; i<n; i++){
			for(j=0;j<n;j++){
				P[i][j]=scan.nextInt();
			}
		}*/
		/*int n=5;
		int P[][]={{0,7,999,18,15},
				   {7,0,11,7,5},
				   {999,11,0,29,999},
				   {18,7,29,0,8},
				   {15,5,999,18,0}};*/
		int P[][]={{999,999,999,999,999,999,999,999,999,8,999,999},
				{999,999,17,13,999,999,999,17,12,999,999,999},
				{999,17,999,999,999,999,999,999,999,7,999,9},
				{999,13,999,999,999,999,15,999,999,13,5,13},
				{999,999,999,999,999,18,999,999,5,999,999,999},
				{999,999,999,999,18,999,999,17,999,999,999,999},
				{999,999,999,15,999,999,999,17,999,999,8,11},
				{999,17,999,999,999,17,17,999,999,999,999,999},
				{999,12,999,999,5,999,999,999,999,999,15,999},
				{8,999,7,13,999,999,999,999,999,999,999,14},
				{999,999,999,5,999,999,18,999,15,999,999,999},
				{999,999,9,13,999,999,11,999,999,14,999,999}};
		int n=12;
		
		LinkedList<Integer> A=new LinkedList<Integer>();

				for(i=0; i<n; i++){
					for (j=0; j<i; j++){
						e=(i-1)*i/2+j;
						A.add(P[i][j]);
					}
				}
					
		for(k=0;k<n;k++)					//Floyd's Algorithm
			for(i=0;i<n;i++)
				for(j=0;j<i;j++){
					e=(i-1)*i/2+j;						
						if(i>k){
							ai=k+(i-1)*i/2;}
						else if(i<k){
							ai=i+(k-1)*k/2;}
						if(j>k){
							aj=k+(j-1)*j/2;}
						else if(j<k){
							aj=j+(k-1)*k/2;}
						if(( A.get(ai) != -1) && (A.get(aj) != -1) && ((A.get(e)>A.get(ai)+A.get(aj)) | (A.get(e) == -1))){	
							A.set(e,(A.get(ai)+A.get(aj)));
							}	
															
				}

		int index = 0;
		for (i = 0; i < n; i++) {
		    for (j = 0; j < i; j++) {
		        System.out.println("From point " + i + " to Point"+"\t" + j + "\t"+"the shortest length is: " + A.get(index));
		        index++;
		    }
		}
}
}
