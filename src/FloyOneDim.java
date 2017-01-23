import java.util.Scanner;

public class FloyOneDim {
	
	public static void main(String args[]){
		
	    	int m=0;
			int i=0,j=0,k=0;
			int e=0;
			int ai=0,aj=0;
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
			/*System.out.println("Input the Rank");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int P[][]= new int[n][n];
			System.out.println("Input the value");
			for(i=0; i<n; i++){
				for(j=0;j<n;j++){
					P[i][j]=scan.nextInt();
				}
			}*/

			int a = n*(n-1)/2;
			int A[] = new int[a];
			for(i=0; i<n; i++){
				for (j=0; j<i; j++){
					e=(i-1)*i/2+j;
					A[e]=P[i][j];
				}
			}		
			for(k=0;k<n;k++)
				for(i=0;i<n;i++)
					for(j=0;j<i;j++){
						e=(i-1)*i/2+j;
					if(i>k){
						if(j>k){				
							ai=k+(i-1)*i/2;
							aj=k+(j-1)*j/2;
							if(( A[ai] != -1) && (A[aj] != -1) && ((A[e]>A[ai]+A[aj]) | (A[e] == -1))){
							A[e]=A[ai]+A[aj];}
						}
						else if(j<k){							
							ai=k+(i-1)*i/2;
							aj=j+(k-1)*k/2;
							if(( A[ai] != -1) && (A[aj] != -1) && ((A[e]>A[ai]+A[aj]) | (A[e] == -1))){
							A[e]=A[ai]+A[aj];}
							
						}
					}
					else if(i<k){
						if(j>k){
							ai=i+(k-1)*k/2;
							aj=k+(j-1)*j/2;	
							if(( A[ai] != -1) && (A[aj] != -1) && ((A[e]>A[ai]+A[aj]) | (A[e] == -1))){
							A[e]=A[ai]+A[aj];}
						}
						else if(j<k){
							ai=i+(k-1)*k/2;
							aj=j+(k-1)*k/2;
							if(( A[ai] != -1) && (A[aj] != -1) && ((A[e]>A[ai]+A[aj]) | (A[e] == -1))){
							A[e]=A[ai]+A[aj];}
						}
					}
					}
	
			int index = 0;
			for (i = 0; i < n; i++) {
			    for (j = 0; j < i; j++) {
			        System.out.println("From point " + i + " to Point"+"\t" + j + "\t"+"the shortest length is: " + A[index]);
			        index++;
			    }
			}
			
	    }
		
}