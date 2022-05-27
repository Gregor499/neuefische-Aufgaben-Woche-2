package wednesday.linkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalListItemTest {

    @Test
    void shouldAddElement(){
        Animal a = new Animal("a");
        AnimalList list = new AnimalList();
        list.add(a);
        //list.add(b);
        //list.add(c);
        assertEquals("a", list.toString());
    }
}
