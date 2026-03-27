package Model;

public class User {

    private int id;
    private String name;
    private int date;
    private String password;
    private String email;

    //Constructor
    public User(){

    }

    //Getter and Setter
    public int setId(){
        return this.id;
    }
    public String setName(String userName){
        return this.name;
    }
    public int setDate(){
        return this.date;
    }
    public String setPassword(String userPassword){
        return this.password;
    }
    public String setEmail(String userEmail){
        return this.email;
    }


    public void getId(int newId){
        this.id = newId;
    }
    public void getName(String newName){
        this.name = newName;
    }
    public void getDate(int newDate){
         this.date = newDate;
    }
    public void getPassword(String newPassword){
         this.password = newPassword;
    }
    public void getEmail(String newEmail){
         this.email = newEmail;
    }








}
