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
    public String getFaculty(){
        return faculty;
    }

    public static void main(String[] args) {
    }
}
