package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrainTest {

    Train train = new Train(Train.Size.SMALL);
    @Test
    void getCapacity() {
        assertEquals(8, train.getCapacity());
    }
}