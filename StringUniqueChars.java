public class StringUniqueChars{

     public static void main(String []args){
          boolean[] hit = new boolean[256];
          char [] str={'a','b','c','a','a','b','e'};
          int len=str.length;
          int tail =0;
          for(int i =0; i<len; i++){
              if(!hit[str[i]]){
                  str[tail]=str[i];
                  tail++ ;
                  hit[str[i]]= true;
              }
             // String  newString2 = String.valueOf(str);
            //  System.out.println("newString2 : " + newString2);
          }
          while(tail < len){
              str[tail] = 0;
              tail ++;
          }
          
        String  newString2 = String.valueOf(str);
        System.out.println("newString2 : " + newString2);
     }
}
