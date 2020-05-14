//This is going to be the child class of human.
//inheritance is used when wanting to create something specific but needs to be similar to another class.
//use "extends" to inherit

public class Citizen extends Human{
    
    String occupation;
    double pay;
    
    public Citizen(String name, int age, String occupation, double pay){
        if (age >= 21){
         super(name, age, true);   
        }
        else{
         super(name, age, false);   
        }
        this.occupation = occupation;
        this.pay = pay;
        
    }
    
    
    
    
}
