public class Account {
    private String id;
    private String password;
    private AccountStatus status;
    public boolean resetPassword(String oldPassword,String newPassword){
        if (this.password.equals(oldPassword)){
            this.password=newPassword;
            return true;
        }
        else{
            return false;
        }
    }

    Account(String id, String password){
        this.id=id;
        this.password=password;
        this.status=AccountStatus.ACTIVE;
    }
}


