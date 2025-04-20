class Account {
    public String name;
    int age; 
    protected String  email;
    private String password;
    public String getPassword(){
        return this.password;
    };
    public void setPassword(String password){
        this.password = password;
    };

    public void printInformation(){
        System.out.println("The name of user is : " + name);
        System.out.println("The age of user is : " + age);
        System.out.println("The email of user is : " + email);
        System.out.println("The password of user is : " + password);
    }
}

public class AccessModifire {
    public static void main(String[] args) throws Exception {
        Account account = new Account();
        account.name = "Bidhan Deb Nath";
        account.age = 25;
        account.email = "Bidhandebnath.office@gmail.com";
        account.setPassword("abcd");
        account.getPassword();
        account.printInformation();

    }
}
