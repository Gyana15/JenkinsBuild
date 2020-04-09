package MyOldPrograms;

import java.util.ArrayList;
import java.util.List;

public class repeatCount {
	public static void main(String[] args) {
		//System.out.println(m1());
		List<Integer> l=new ArrayList<>();
		
		l.add(5);
		l.add(5);
		l.add(5);
		l.add(1);
		l.add(1);
		l.add(4);
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		l1.add(0);
		l2.add(l.get(0));
		for(int i=1;i<l.size();i++)
		{
			System.out.println(l.get(i));
			if(l2.contains(l.get(i)))
			{
				l1.add(1);
				l2.add(l.get(i));
			}
			else
			{
				l1.add(0);
				l2.add(l.get(i));
			}
		}
		System.out.println(l1);
	
	
	
/*List<Integer> list = new ArrayList<Integer>();
list.add(0);
int count1,count2,j,k;
for(int i=1;i<l.size();i++){
	count1=0; count2=0;
	j=i; k=i;
	while(count1==0 && j<l.size()-1)
	if(l.get(i)==l.get(++j)){
		list.add(1);
		count1++;
	break;}
	if(j==l.size()-1){
	while(count2>0 && k>=0){
		j=i;
	if(l.get(i)==l.get(--k)){
		list.add(1);
		count2++;
	break;}}}
	if(count1==0 && count2==0)
	list.add(0);
}
System.out.println(list);*/
	}
}
