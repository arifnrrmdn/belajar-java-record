package arifunikom.records;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {

    @Test
    void generic() {

        var data = new Data<String>("arif");
        assertEquals("arif", data.Data());

        var data2 = new Data<Integer>(100);
        assertEquals(100, data2.Data());



    }
}
