
// how to find the first bigger element after the key in sorted array 
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class BinarySearchModified
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
     int arr []={1,2,3,3,3,3,3,3,5,6,7,7,7,7,7,7,7,8,9,9,9,9,9,9,9,9,9,9,9,9,10,10};
    int n = arr.length;
        int key = 1;
    OtherClass myObject = new OtherClass();
    int x=myObject.binarySearch(arr,0,n-1,key);
    int m=myObject.binarySearchtt(arr,x,n-1);
    System.out.print(m);
  }
}

// you can add other public classes to this editor in any order
public class OtherClass
{
   public  int binarySearch(int arr[],int first,int last,int key){
    int mid=first+(last-first) /2;
    
    if(last >= first){
      
      if(arr[mid] == key){
      return mid;
      }
       if(arr[mid] > key){
      return binarySearch(arr,first,mid-1,key);
      }
       return  binarySearch(arr,mid+1,last,key);
      
    }
    
    return -1;
  }
  public int binarySearchtt(int arr[],int first,int last){
    
    //special case before last element
    if(arr[first] == arr[last]-1){
      return arr[last];
    }
    
    if(last>first){
      
      int mid=first+(last-first)/2;
      
      if(arr[mid] == arr[first] )
      return  binarySearchtt(arr,mid,last);
      if(arr[mid] > arr[first] ){
        if(mid-1 == first )
          return arr[mid];
        
        return  binarySearchtt(arr,first,mid);
        
      }
    
        
  
   
  }
    return 100;
  }
}
