import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListImplTest {

    IntegerListImpl IntegerList = new IntegerListImpl(10);

    @BeforeEach
    void filling() {
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(3);
        IntegerList.add(4);

    }

    @Test
    void addByItem() {
        Integer actual = IntegerList.add(1);
        assertEquals(actual, 1);

    }

    @Test
    void addByIndex() {
        Integer actual = IntegerList.add(0, 1);
        assertEquals(1, actual);
    }

    @Test
    public void setByIndexAndItem() {
        Integer expect = IntegerList.set(0, 1);
        assertEquals(1, expect);
    }

    @Test
    public void removeByItem() {
        Integer result = IntegerList.remove(1);
        for (Integer i : IntegerList.toArray()) {
            if (i != result);
        }
    }

    @Test
    public void removeByIndex() {
        Integer result = IntegerList.remove(0);
        for (Integer i : IntegerList.toArray()) {
            if (i != result);
        }
    }

    @Test
    public void contains() {
        Integer result = IntegerList.add(0, 1);
        result.toString(IntegerList.get(0));

    }

    @Test
    public void indexOf() {
        int result = 0;
        assertEquals(result, IntegerList.indexOf(1));
    }

    @Test
    public void lastIndexOf() {
        int result = -1;
        assertEquals(result, IntegerList.indexOf(0));
    }

    @Test
    public void get() {
        assertEquals(1, IntegerList.get(0));
    }

    @Test
    public void testEquals() {
        Integer result = IntegerList.add(1);
        Integer expect = IntegerList.add(0, 1);
        assertEquals(expect, result);
    }

    @Test
    public void size() {
        assertEquals(4, IntegerList.size());
    }

    @Test
    public void isEmpty() {
        assertEquals(false, IntegerList.isEmpty());
    }

    @Test
    public void clear() {
        IntegerList.clear();
        assertEquals(true, IntegerList.isEmpty());
    }

}