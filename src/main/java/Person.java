/**
 * this class collects the data of a person
 * it has 2 additional methods
 * addSiblings: adding a new sibling to the arrayList
 * getSiblings: getting all the siblings and returning them as an array
 * @author Cindy Pan
 * @version 17.0.1
 */
class Person{

    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings;
    private Person[] siblings;

    /**
     * collects the data of a person and constructs the variables
     * @param first the firstname of the person
     * @param last the lastname of the person
     * @param day the birthday of the person
     * @param month the birthmonth of the person
     * @param year the birthyear of the person
     * @param ssn1 the ssn of the person 
     */
    public Person(String first, String last, int day, int month, int year, String ssn1){
        this.firstname = first;
        this.lastname = last;
        this.birthDay = day;
        this.birthMonth = month;
        this.birthYear = year;
        this.ssn = ssn1;
        this.numberOfSiblings = 0;
        this.siblings = new Person[0];
    }

    /**
     * sets a new data to the variable firstname
     * @param firstName the name of the person
     */
    public void setFirstname(String firstName){
        this.firstname = firstName;        
    }

    /**
     * returns the first name of the person
     * @return the first name of the person
     */
    public String getFirstname(){
        return this.firstname;
    }
    /**
     * sets a new data to the variable lastName
     * @param lastName the Last name of the person
     */
    public void setLastname(String lastName){
        this.lastname = lastName;
    }
    /**
     * returns the last name of the person
     * @return the last name of the person
     */
    public String getLastname(){
        return this.lastname;
    }

    /**
     * returns the birthday of the person in a string
     * in the format of day/month/year
     * @return the birthday of the person
     */
    public String getBirthday(){
        return this.birthDay+"/"+this.birthMonth+"/"+this.birthYear;
    }

    /**
     * this method adds a new sibling into the array
     * @param sibling the sibling of the person
     */
    public void addSibling(Person sibling){
        int len = this.siblings.length;
        Person[] temp = new Person[len+1];
        
        for(int i=0; i<len; i++){
            temp[i] = this.siblings[i];
        }
        temp[len]=sibling;
        this.siblings = temp;
    }
    /**
     * this is a getter for the siblings variable
     * @return siblings of the person
     */
    public Person[] getSiblings(){
        return this.siblings;
    }
}