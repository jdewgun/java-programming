/**
 * Person
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstNameValue) {
        this.firstName = firstNameValue;
    }

    public void setLastName(String lastNameValue) {
        this.lastName = lastNameValue;
    }

    public void setAge(int ageValue) {
        if (ageValue < 0 || ageValue > 100) {
            ageValue = 0;
        }

        this.age = ageValue;
    }

    public boolean isTeen() {
        if (this.age < 20 && this.age > 12) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {

        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        }

        if (this.lastName.isEmpty() && !this.firstName.isEmpty()) {
            return this.firstName;
        } else if (!this.lastName.isEmpty() && this.firstName.isEmpty()) {
            return this.lastName;
        } else {
            return this.firstName + " " + this.lastName;
        }
    }
}