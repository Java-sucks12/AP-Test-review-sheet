//This is going to be an example of classes, inheritance, and polymorphism.
//This will be the parent class known as Human however on the test it must be equal to the file name.

public class Human
{
    //public lets you access variable outside class without relying on getters
    public String name;
    //private means you must rely on getters and setters to access the variable
    private int age;
    //If you do not declare a variable as public or private it automatically becomes private, do not rely on it tho
    boolean canDrink;
    
    
    //constructor example
    //Treat it as a function. It must have the same name as the class.
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        
        //if and else statement example. pretty self explanitory.
        //don't worry about using "this" before setting the variable unless there is something with the same name as seen above.
        if (age >= 21){
            canDrink = true;
        }
        
        else{
            canDrink = false;
        }
    }
    
    
    
    //function returns void. do not put return statement.
    public void birthday(){
        //the age incremented by one
        //you could also use age = age + 1; or age += 1; whatever works for you
        age++;
    }
    
    
    //getter example. Use when variable is private. must declare return type.
    public int getAge(){
      return age;
    }

    //setter example. Must declare void.
    public void setAge(int age){
        this.age = age;
    }

    //This is completely useless but is very common and might be on the AP test
    //It must be named toString and returned as a String.
    public String toString(){
        return "Hi I am " + name + " I am " + age + " years old!";
    }
}
