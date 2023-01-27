package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    void getName() {
       Employee karlo = new Employee("Karlo");
        assertEquals("Karlo", karlo.getName());
    }

    @Test
    void getOtherName() {
        Employee ivan = new Employee("ivan");
        assertEquals("ivan", ivan.getName());
    }
}