import java.util.Scanner;

public class DijkstraOne {
	public static void main(String args[]){
		int m;
		int i,j,k;
		int e=0,e1=0;
		int minPath=999999999;
		int mp=0;    //mp is minPoint
		int mpj=0;
		
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
		int st=2;
		int n=12;
		//System.out.println("Input the startPoint");
		//int st = scan.nextInt(); 		   //st is startPoint

		
		int a = n*(n-1)/2;
		int A[] = new int[a];
		for(i=0; i<n; i++){
			for (j=0; j<i; j++){
				e=(i-1)*i/2+j;
				A[e]=P[i][j];
			}
		}
		
		int[] sLength = new int[n];        // store shortest length
		int[] path = new int[n];           // store last vest
		int[] tvest = new int[n];          // store test vest
		
		for(k=0; k<n; k++){                // store slength[],,
			path[k]=st;                    // init path[] as startPoint st;
			tvest[k]=0;   // init tvest[] equals 0; tvest store whether this point has been tested
			if(st>k){
				e1=st*(st-1)/2+k;}
			else if(st<k){
				e1=k*(k-1)/2+st;}
			if(k==st){
				sLength[k]=0;              // point to self-point equals to 0
			}
			else{
			sLength[k]=A[e1];}             // transform from two dimension to one dimension
		}
		
		tvest[st]=1;					   // startPoint is firstly to be tested
		
		
		
		for(i=0;i<n-1;i++){
			minPath=999999999;
		    for(k=0; k<n; k++){ 
			    if (sLength[k]<minPath && tvest[k]==0){
				   minPath=sLength[k];
				   mp=k;
				   }
		    }
			for(j=0;j<n;j++){
				if(mp>j){
					mpj=j+mp*(mp-1)/2;}
				else if(mp<j){
					mpj=mp+j*(j-1)/2;	
				}
			    if (sLength[j]>sLength[mp]+A[mpj]){
				   sLength[j]=sLength[mp]+A[mpj];
				   path[j]=mp;}
			}
			tvest[mp]=1;
		}
		/*for(k=0;k<n;k++){
			System.out.println("The shortest length are");
			System.out.println(sLength[k]);}
		for(k=0;k<n;k++){
			System.out.println("The shortest path are");
			System.out.println(path[k]);}*/
		int index=st;
		path[st] = st;
		for(k=0;k<n;k++){
				System.out.print(k);
				index = k;
			while(path[index]!=k){
				
				index=path[index];
				
				System.out.print(index);
		    if (path[st] == index) {
				break;
			}
			}
			System.out.println(" is the path from "+k+" to "+st);
			System.out.println("The shortest Path is:"+sLength[k]);
		}
	}
}
