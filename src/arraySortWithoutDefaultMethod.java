import java.util.Arrays;

public class arraySortWithoutDefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x[]={1,5,3,5,2,3,7,8,9,9,100,2};
int x1[]={99,1,5,3,5,2,3,7,8,9,9,100,2};
int temp;
for(int i=0;i<x.length;i++){
	for(int j=i+1; j<x.length; j++){
		if(x[i]>=x[j]){
			temp=x[i];
			x[i]=x[j];
			x[j]=temp;
		}
	}
}
int great=0;
for(int i=0;i<x1.length-1;i++){
	if(x1[i]>x1[i+1]){
		great=x1[i];
		x1[i]=x1[i+1];
		
		x1[i+1]=great;
	}
	i=-1;
}

/*for(int j=0; j<x.length; j++){
	System.out.println(x[j]);
}*/
for(int j=0; j<x.length; j++){
	System.out.println(x[j]);
}

	}

}
