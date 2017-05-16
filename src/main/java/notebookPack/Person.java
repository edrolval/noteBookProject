package notebookPack;


import java.util.ArrayList;

public class Person extends Note {
    private String firstName;
    private String lastName;
//    private String mail;
//    private String address;
    private String note;
    private ArrayList<String> phone;

    Person  (String pFirstName
            ,String pLastName
//            ,String pMail
//            ,String pAddress
             ,String pNote
            ,ArrayList<String> pPhone) {

        firstName = pFirstName;
        lastName = pLastName;
//        mail = pMail;
//        address = pAddress;
        phone = pPhone;
    }


    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
//    public String getMail() { return mail; }
//    public String getAddress() { return address; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }
//    public void setMail(String mail) { this.mail = mail; }
//    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return "Record{" +
                "id='" + this.getId() + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


}
