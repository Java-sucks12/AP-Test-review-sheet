//string methods that are not used in any other programming language which is why java is trash for taking up memory in my brain as well as my computer.



public class StringShit{
      String thestring;
      
      public StringShit(String str){
          thestring = str;
      }
      
      public void iterate(){
          for (int i=0; i < thestring.length(); i++){
            System.out.println(thestring.charAt(i));
          }
      }
      
      public bool compare(String str){
        //when using strings in if or else statements, you have to use .equals
        
        if (thestring.equals(str)){
            return true;
        }
        return false;
      }
      
      
}
