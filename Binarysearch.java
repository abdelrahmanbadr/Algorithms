import java.util.Arrays;
public class Binarysearch{

     public static void main(String []args){
       
        Binarysearch obj=new Binarysearch();
        int [] input={1,2,3,4,5,6,7,8,9,10,11,11,11,11,11,12,15,18,20};
       int key=-11;
      
         System.out.println(obj.search(input,key));
        
     }
     public int search(int [] arr,int key){
         Binarysearch obj=new Binarysearch();
        	Arrays.sort(arr);
        	int top=arr.length-1;
        	if(key < arr[0] || key > arr[top]){
        	    return -1;
        	}
         
        
         return obj.doStuff(0,top, arr, key);
     }
     
     public int doStuff(int start,int end,int [] arr,int key){
         int mid=(start + end) /2;
           if(start > end){
             return -2;
         }
         if(arr[mid] == key){
             return mid;
         }else if(arr[mid] > key){
          
              return doStuff(start,mid-1, arr, key);
         }else if(arr[mid] < key){
             
             return doStuff(mid+1,end, arr, key);
         }
         return -1;
       
     }
}

