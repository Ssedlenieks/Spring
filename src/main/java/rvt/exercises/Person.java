package rvt.exercises;


public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address =
         address;
    }

    public String toString() {
        return this.name + "\n  " + this.address;
    }

}
class Student extends Person {
    private int credits;
    
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

        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);

    
        
    }


}



