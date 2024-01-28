package arifunikom.records;

public record Customer(String id, String name, String email, String phone) implements SayHello{

    // canonical constructor
    public Customer(String id, String name, String email, String phone){
        System.out.println("Create Customer");
        this.id = id;
        this.name = name;
        this.email = email != null ? email.toLowerCase() : null;
        this.phone = phone != null ? phone.toLowerCase() : null;
    }

    public Customer(String id, String name, String email){
        this(id, name, email, null);
    }

    public Customer(String id, String name){
        this(id, name, null);
    }

    @Override
    public String sayHello(String name){
        return "Hello " + name + ", My name is " + this.name;
    }

}
