class User {
    private String firstName;
    private String lastName;
    private String fullName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here

    this.firstName = firstName == null ? "" : firstName;
    }


    public void setLastName(String lastName) {
        // write your code here
        this.lastName = lastName == null ? "" : lastName;
    }

    public String getFullName() {
        if (firstName.isEmpty() & lastName.isEmpty()) {
            fullName = "Unknown";
        } else {
            fullName = firstName + " " + lastName;
        }
        return fullName; // write your code here
    }
}