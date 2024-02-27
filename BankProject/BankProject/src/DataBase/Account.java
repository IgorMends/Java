package DataBase;

public class Account {

    private String name;
    private String password;
    private int age;
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

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getBallance(){
        return ballance;
    }

    public void setBallance(double ballance){
        this.ballance = ballance;
    }
}
