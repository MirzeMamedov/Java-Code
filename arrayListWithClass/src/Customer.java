public class Customer {
    int id;
    String firstname;
    String lastname;
    Customer(int id, String firstname, String lastname){

        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public String getCustomer() {
        return "id : " + id  + " | firstname : " + firstname + " | lastname : " + lastname ;
    }

}
