package rvt.exercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        Money a = new Money(10,0);
        Money b = new Money(5,0);
    
        Money c = a.plus(b);
    
        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e
    
        a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
        //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it
    
        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e
    
    
        a = new Money(10, 0); // Fix: Remove duplicate declaration and assign a new value to "a"
        b = new Money(3, 0); // Fix: Remove duplicate declaration and assign a new value to "b"
        c = new Money(5, 0); // Fix: Remove duplicate declaration and assign a new value to "c"
    
        System.out.println(a.lessThan(b));  // false
        System.out.println(b.lessThan(c));  // true
       
        b = new Money(5,0);
        c = a.plus(b);  // Fix: Remove duplicate declaration of "c"
        b = new Money(3, 50); // Fix: Remove duplicate declaration and assign a new value to "b"
        
        c = a.minus(b); // Fix: Remove duplicate declaration of "c"
    
        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e
        
    
        c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
        //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it
    
    
        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
}
