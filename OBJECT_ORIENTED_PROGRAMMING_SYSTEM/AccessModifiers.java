public class AccessModifiers {
    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Debashis";
        System.out.println(myAcc.username);
        myAcc.setPassword("abc123"); //Just set the password but not display beacuse it is a private member
    }
}
class BankAccount {
    public String username;
    private String password;
    public void setPassword(String myPassword) {
        password = myPassword;
    }
}
