package one.digitalinnovation.gof.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseConnectionTest {

    @Test
    public void testEqualsGetInstanceDatabaseConnection(){

        DatabaseConnection connectionOne = DatabaseConnection.getInstance();
        DatabaseConnection connectionTwo = DatabaseConnection.getInstance();

        assertEquals(connectionOne, connectionTwo);

    }
}
