//this class is going to be all about loops
//make sure you can understand classes a little bit before you read

public class Loops{
    
    int count;
    int arr;
    
    public Loops(){
      count = 0;
    }
    
    public void forLoop(){
      //basic for loop that counts to 10
      //please always start at 0 unless there are certain situations. (will explain later)
      
      for (int i=0; i<11; i++){
          System.out.println(i);
      }
      
      //loop that counts backwards
      
      for (int i=10; i>=0; i--){
          System.out.println(i);
      }
      
      
    }
    
    public void whileLoop(){
        //while loop that counts to 10
        
        int i = 0;
        
        while (i <= 10){
          System.out.println(i);
          i++;
        }
        
        //while loop that counts backwards
        i = 10;
        
        while (i >= 0){
          System.out.println(i)
          i--;
        }
        
    }
    
    public void dumbPyramidShit(){
        //self explanitory
        //only place where i starts at 1
        
        String str = "";
        for (int i=1; i < 11; i++){
            for (int j=0; j<i; j++){
                  str += "*";
            }
            System.out.println(str);
        }
        //it prints pyramid.
    }

}
