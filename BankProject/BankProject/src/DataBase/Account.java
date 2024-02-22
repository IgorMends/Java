package DataBase;

public class Account {

    private String name;
    private String password;
    private double age;
    private double ballance;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public double getAge(){
        return age;
    }

    public void setAge(double age){
        this.age = age;
    }

    public double getBallance(){
        return ballance;
    }

    public void setBallance(double ballance){
        this.ballance = ballance;
    }
}
