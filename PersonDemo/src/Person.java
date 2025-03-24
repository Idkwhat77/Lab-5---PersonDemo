public class Person {
    // Instance variables (attributes)
    private String name;
    private int age;
    private String gender;
    private String hobby;
    
    // Default constructor
    public Person() {
        // Initialize with default values
        this.name = "Unknown";
        this.age = 0;
        this.gender = "Unspecified";
        this.hobby = "null";
    }
    
    // Parameterized constructor
    public Person(String name, int age, String gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }
    
    // Getter and Setter for 'name'
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter and Setter for 'age'
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Getter and Setter for 'gender'
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    // Getter and Setter for 'Hobby'
    public String getHobby() {
        return hobby;
    }
    
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Hobby: " + hobby);
    }
    
    // Method to provide a greeting
    public String greet() {
        if (this.age > 0 && this.age <= 6) {
            return "Hewwo... me name " + name + "!" ;
        }
        else if (this.age > 6 && this.age <= 12) {
            return "Hello! My name is " + name + "! Nice to meet you!";
        }
        else if (this.age > 18) {
            return "Hello, my name is " + name + ".";
        }
        else {
            return "Hi?";
        }
    }
}