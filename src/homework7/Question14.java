package homework7;

public class Question14 {
String firstName ="";
String lastName = "";
int age = 0;
//get firstname method

    public String getFirstName(){
        return firstName;
            }
            //Get Lastname method
    public String getLastName(){
        return lastName;

    }
    // get age method
    public int getAge(){
        return age;

    }
    // set firstname
    public void setFirstname(String updatedFirstName){
        this.firstName = updatedFirstName;

    }
    // set lastname
    public void setLastname(String updatedLastName) { this.lastName = updatedLastName;}
    // set age
    public void setAge(int updatedAge){
        if(updatedAge > 100 || updatedAge < 0){
            System.out.println("Invalid value for age");
            return;
                    }
        this.age = updatedAge;
    }
    // is Teen
    public boolean isTeen(){
        return age > 12 && age < 20 ; //eg.true
    }
    //get full name
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) return " ";
        if (firstName.isEmpty()) return this.lastName;
        if (lastName.isEmpty()) return this.firstName;
        return this.firstName + " " + this.lastName;
    }

    public static void main(String[] args) {
        Question14 person = new Question14();

        person.setFirstname(" ");
        person.setLastname(" ");

        person.setAge(10);
        System.out.println("fullname = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());

        person.setFirstname("Josh");
        person.setAge(18);

        System.out.println("Fullname = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        person.setLastname("Sahaj");
        System.out.println("Fullname = " + person.getFullName());


    }


           }

