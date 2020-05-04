

class Employee {

    // write fields
    private String name;
    private String email;
    private int experience;

    // write constructor
    protected Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    // write getters
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getExperience() {
        return experience;
    }
}

class Developer extends Employee {

    // write fields
    private String mainLanguage;
    private String[] skills;
    // write constructor
    protected Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = java.util.Arrays.copyOf(skills, skills.length);
    }

    // write getters
    public String getMainLanguage() {
        return mainLanguage;
    }
    public String[] getSkills() {
        return java.util.Arrays.copyOf(skills, skills.length);
    }
}
class DataAnalyst extends Employee {

    // write fields
    boolean phd;
    String[] methods;

    // write constructor
    protected DataAnalyst(String name, String email, int experience, boolean phd, String[]methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = java.util.Arrays.copyOf(methods, methods.length);
    }
    public boolean isPhd() {
        return phd;
    }
    public String[] getMethods() {
        return java.util.Arrays.copyOf(methods, methods.length);
    }

    // write getters
}