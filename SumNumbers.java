public class SumNumbers{
    public static void  main(String[] args){
     int [] arr={-1,2,3,4,5,6,7,8,10,11};
     int key=1;
     String result=SumNumbers.doStuff(arr,key,0,arr.length-1);
     System.out.println(result);
     
    }
    
    public static String doStuff(int [] arr,int key,int i,int j){
        int result=arr[i]+arr[j];
        if(i == j){
            return "Number not found";
        }
        
        if(result == key){
            return (arr[i]+"+"+arr[j]);
           
        }else if(result > key){
          return  SumNumbers.doStuff(arr,key,i,--j);
        }else {
          return   SumNumbers.doStuff(arr,key,++i,j);
        }
     
     
    }
}
