import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


class ItemsProviderTest {
    ItemsProvider testObject;
    static String expectedToString = "ItemsProvider{items=[just, a, default, list, of, items]}";

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals(expectedToString, testObject.toString());
    }

    @BeforeEach
    void setUp() {
        testObject = new ItemsProvider();
    }

}