package creational.builder.buildertype2;

/**
 * Builder outside the class
 */
public class Student2 {
    private int id;
    private String name;
    private String address;
    //made variables public. In case if it is not public we can use getter and setter
    public Student2(StudentBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
    }
}
