package Lamdaexp;

@FunctionalInterface  
interface Start{  
    String say(String msg);  
}  
  
public class MultipleStatements{  
    public static void main(String[] args) {  
      
        // printing multiple statements in lambda expression  
        Start p = (msg)-> {  
            String str1 = "My Day is Ending,";  
            String str2 = str1 + msg;           //Adding to strings 
            return str2;  
        };  
            System.out.println(p.say("time is precious.")); 
            System.out.println(p.say("A new day is Ahead."));  
    }  
}