package Stream;

public class Students {
    private int id;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String address;
    private String telephone;
    private String faculty;
    private String course;
    private String group;

    public Students(int id, String firstName, String lastName, int yearOfBirth,
                    String address, String telephone, String faculty, String course, String group){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.telephone = telephone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId(){ return id; }
    public String getFirstName(){ return firstName; }
    public String getName(){ return firstName + lastName; }
    public String getLastName(){ return lastName; }
    public int getYearOfBirth(){ return yearOfBirth; }
    public String getAddress(){ return address; }
    public String getTelephone(){ return telephone; }
    public String getFaculty(){
        return faculty;
    }
    public String getCourse(){ return course; }
    public String getGroup(){ return group; }

    public String setFaculty(String facultyName){
        return this.faculty = facultyName;
    }

    public String setGroup(String groupName){
        return this.group = groupName;
    }

    @Override
    public String toString () {
        return "Student{" + "id: " + id + ", firstName: " + firstName + ", lastName: " + lastName + ", yearOfBirth: " + yearOfBirth + ", address: " + address + ", telephone: " + telephone + ", faculty: " + faculty + ", course: " + course + ", group: " + group + "}";
    }
}
