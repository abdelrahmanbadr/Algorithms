
public class QuickSort {

	public static void  sort(int a [], int low, int high) {
		
		int middle= (low + high) / 2;
		int pivot= a[middle];
		int i=low; int j=high;
		
		while(i<=j)
		{
		    while(a[i]<pivot) i++;
		     while(a[j]>pivot) j--;
		     if(i<=j)
		     {
		         int temp=a[i];
		         a[i]=a[j];
		         a[j]=temp;
		         i++;
		         j--;
		     }
		}
		if(i<high) 
		   {sort(a,i,high) ;}
		    
			if(j>low) 
			    {sort(a,low,j);}
			    
			   
			    
			
 
	}
    
}
