package rvt.exercises;

class Student extends Person {
    private int credits;
    @Override
    public String toString() {
        return super.toString();
    }
    
    public Student(String name, String address) {
        super(name, address);
    }
    public int study() {
        return credits++;
    }

    public int credits() {
        return credits;
    }
public static void main(String[] args) {
    // Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
    // System.out.println(ollie);
    // System.out.println("Study credits " + ollie.credits());
    // ollie.study();
    // System.out.println("Study credits " + ollie.credits());

    Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
    System.out.println(ollie + "\n  Study credits " + ollie.credits());
    ollie.study();
    System.out.println(ollie + "\n  Study credits " + ollie.credits());
}
}