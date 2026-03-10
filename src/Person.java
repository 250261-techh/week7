public abstract class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;
    private Account account;

    Person(String name,Address address,String email,String phone, Account account){
        this.name=name;
        this.address=address;
        this.email=email;
        this.phone=phone;
        this.account=account;
    }
}

