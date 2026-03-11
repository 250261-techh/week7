public abstract class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;
    private Account account;

    public Person(String name,Address address,String email,String phone, Account account){
        this.name=name;
        this.address=address;
        this.email=email;
        this.phone=phone;
        this.account=account;
    }

    public String getName() { 
        return name; 
    }
    public String getEmail() { 
        return email; 
    }
    public Account getAccount() { 
        return account; 
    }
}

