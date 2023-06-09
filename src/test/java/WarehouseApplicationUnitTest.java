import org.example.WarehouseApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class WarehouseApplicationUnitTest {
    private WarehouseApplication application;

    @BeforeEach
    public void setUp() {
        application = new WarehouseApplication();
    }

    @Test
    public void testReadBedClothesInventoryFromFile() {
        String mockLine = "1,Shirt,BedClothes,19.99,10";

        InputStream inputStream = new ByteArrayInputStream((mockLine + System.lineSeparator() + null).getBytes());
        System.setIn(inputStream);

        application.readBedClothesInventoryFromFile();

    }
}