import java.util.Scanner;

public class DijkstraTwo {
public static void main(String args[]){
	
	int m;
	int i,j,k;
	int minPath=999999999;
	int minPoint=0;
	/*int P[][]={{0,7,999,18,15},
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
	int startPoint=2;
	int n=12;
	/*
	System.out.println("Input the Rank");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int P[][]= new int[n][n];
	System.out.println("Input the value");
	for(i=0; i<n; i++){
		for(j=0;j<n;j++){
			P[i][j]=scan.nextInt();
		}
	}
	System.out.println("Input the startPoint");
	int startPoint = scan.nextInt();
	*/
	
	int[] sLength = new int[n];        // store shortest length
	int[] path = new int[n];           // store last vest
	int[] tvest = new int[n];          // store test vest
	
	for(k=0; k<n; k++){                // store slength[],init path[],tvest[]
		sLength[k]=P[startPoint][k];
		path[k]=startPoint;
		tvest[k]=0;
		}
	
	tvest[startPoint]=1;
	path[startPoint]=-1;

	for(i=0;i<n-1;i++){
		minPath=999999999;
	    for(k=0; k<n; k++){ 
		    if (sLength[k]<minPath && tvest[k]==0){
			   minPath=sLength[k];
			   minPoint=k;
			   }
	    }
		for(j=0;j<n;j++){		
		    if (sLength[j]>sLength[minPoint]+P[minPoint][j]){
			   sLength[j]=sLength[minPoint]+P[minPoint][j];
			   path[j]=minPoint;}
		}
		tvest[minPoint]=1;
	}

	int index=startPoint;
	path[startPoint] = startPoint;
	for(k=0;k<n;k++){
			System.out.print(k);
			index = k;
		while(path[index]!=k){
			
			index=path[index];
			
			System.out.print(index);
	    if (path[startPoint] == index) {
			break;
		}
		}
		System.out.println(" is the path from "+k+" to "+startPoint);
		System.out.println("The shortest Path is:"+sLength[k]);
	}
		
}
}
