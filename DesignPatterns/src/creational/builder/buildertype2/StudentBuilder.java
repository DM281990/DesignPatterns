package creational.builder.buildertype2;


public class StudentBuilder {

        // instance fields
        public int id;
        public String name;
        public String address;

        public static StudentBuilder newInstance()
        {
            return new StudentBuilder();
        }

        private StudentBuilder() {}

        // Setter methods
        public StudentBuilder setId(int id)
        {
            this.id = id;
            return this;
        }
        public StudentBuilder setName(String name)
        {
            this.name = name;
            return this;
        }
        public StudentBuilder setAddress(String address)
        {
            this.address = address;
            return this;
        }

        // build method to deal with outer class
        // to return outer instance
        public Student2 build()
        {
            return new Student2(this);
        }
    

}
