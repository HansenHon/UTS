public class Account {
    private String id;
    private String pw;
    private String name;
    private int balance;

    Account(String userId, String userName){
        id = userId;
        name = userName;
    }

    Account(String userId, String userName, int userBalance){
        id = userId;
        name = userName;
        balance = userBalance;
    }

    String getId(){

        return id;
    }
    String passId(){

        return pw;
    }
    String getName(){

        return name;
    }
    int getBalance(){

        return balance;
    }

    public int tutor(int tutor){
        return tutor;
    }

    public int role(int role){
        return role;
    }

    public int roles(int roles){
        return roles;
    }

    public String toString(){
        return("Account=[id=" + getId() + ", name=" + getName() + ", umur=" + getBalance() + "]");
    }


}
