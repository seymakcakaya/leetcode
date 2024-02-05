import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {
    @Test
    @DisplayName("Should check all items in the list")
    @Disabled
    void shouldCheckAllItemsInTheList() {
        //JUnit won’t run the assertions after the first failure
        List<Integer> items = Arrays.asList(2, 2, 3, 4, 5);
        assertEquals(1, items.get(0));
        assertEquals(2, items.get(1));
        assertEquals(5, items.get(2));
        assertEquals(4, items.get(3));


    }


    @Test
    @DisplayName("Should check all items in the list 2")
    void shouldCheckAllItemsInTheList2() {


        List<Integer> items = Arrays.asList(1, 2, 8, 4, 5);
        Assertions.assertAll(
                () -> assertEquals(1, items.get(0)),
                () -> assertEquals(4, items.get(0)),
                () -> assertEquals(2, items.get(1)),
                () -> assertEquals(8, items.get(2)),
                () -> assertEquals(6, items.get(3)));


    }
}
