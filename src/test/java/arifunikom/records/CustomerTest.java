package arifunikom.records;

import org.junit.jupiter.api.Test;

import java.lang.reflect.RecordComponent;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    void createNewRecord() {

        var customer = new Customer("1","arif","arif@localhost.com","08777121231");
        assertNotNull(customer);

        System.out.println(customer);

    }

    @Test
    void getProperty() {

        var customer = new Customer("1","arif","arif@localhost.com","08777121231");

        assertEquals("1", customer.id());
        assertEquals("arif", customer.name());
        assertEquals("arif@localhost.com", customer.email());
        assertEquals("08777121231", customer.phone());
    }

    @Test
    void constructor() {
        var customer = new Customer("1","arif","arif@localhost.com");

        assertEquals("1", customer.id());
        assertEquals("arif", customer.name());
        assertEquals("arif@localhost.com", customer.email());

        assertNull(customer.phone());
    }

    @Test
    void method() {
        var customer = new Customer("1","arif","arif@localhost.com");
        assertEquals("Hello Alek, My name is arif", customer.sayHello("Alek"));
    }

    @Test
    void equals() {
        var customer1 = new Customer("1","arif","arif@localhost.com");
        var customer2 = new Customer("1","arif","arif@localhost.com");

        assertTrue(customer1.equals(customer2));
        assertEquals(customer1.hashCode(), customer2.hashCode());
        assertEquals(customer1.toString(), customer2.toString());

    }

    @Test
    void reflection() {

        assertTrue(Customer.class.isRecord());

        RecordComponent[] recordComponents = Customer.class.getRecordComponents();
        assertEquals(4, recordComponents.length);

        for (RecordComponent component : recordComponents){
            System.out.println(component.getName());
            System.out.println(component.getType());
            System.out.println("==========");
        }

    }
}
