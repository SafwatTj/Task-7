public class Person {

    private String fName;
    private String lName;
    private int age;
    private String email;
    private String phone;


    public Person(String fName, String lName, int age, String email, String phone) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }


    @Override
    public String toString() {
        return String.format("%s %s (%d) email:%s phone:%s", fName,lName,age,email,phone);
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
