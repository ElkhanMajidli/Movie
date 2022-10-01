package been;

public class User {

    public String name;
    public String surname;
    public String email;
    public String password;
    public Integer money;


    public User(){

    }

    public User(String name,String surname,String email,String password){
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.password=password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getAllInfo(){
        return (getName()+" "+getSurname()+" "+getEmail()+" "+getMoney());
    }


}
