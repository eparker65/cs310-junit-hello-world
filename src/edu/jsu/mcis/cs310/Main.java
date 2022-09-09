package edu.jsu.mcis.cs310;
import java.lang.Object;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        String reverse = m.reverse(message);
        StringBuilder s = new StringBuilder();
        s.append(message);
        
        
        
        
        System.out.println(message);
        
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        StringBuilder s = new StringBuilder();
        s.append(message);
        System.out.println(s.reverse());
        
        
        return s.toString();
    }
    
}