import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {

    StringListImpl stringList = new StringListImpl(10);

    @BeforeEach
    void filling() {
        stringList.add("один");
        stringList.add("два");
        stringList.add("три");
        stringList.add("четыре");

    }

    @Test
    void addByItem() {
        String actual = stringList.add("один");
        assertEquals(actual, "один");

    }

    @Test
    void addByIndex() {
        String actual = stringList.add(0, "текст");
        assertEquals("текст", actual);
    }

    @Test
    public void setByIndexAndItem() {
        String expect = stringList.set(0, "текст");
        assertEquals("текст", expect);
    }

    @Test
    public void removeByItem() {
        String result = stringList.remove("один");
        for (String i : stringList.toArray()) {
            if (i != result);
        }
    }

    @Test
    public void removeByIndex() {
        String result = stringList.remove(0);
        for (String i : stringList.toArray()) {
            if (i != result);
        }
    }

    @Test
    public void contains() {
        String result = stringList.add(0, "один");
        result.contains(stringList.get(0));

    }

    @Test
    public void indexOf() {
        int result = 0;
        assertEquals(result, stringList.indexOf("один"));
    }

    @Test
    public void lastIndexOf() {
        int result = -1;
        assertEquals(result, stringList.indexOf("not true text"));
    }

    @Test
    public void get() {
        assertEquals("один", stringList.get(0));
    }

    @Test
    public void testEquals() {
        String result = stringList.add("один");
        String expect = stringList.add(0, "один");
        assertEquals(expect, result);
    }

    @Test
    public void size() {
        assertEquals(4, stringList.size());
    }

    @Test
    public void isEmpty() {
        assertEquals(false, stringList.isEmpty());
    }

    @Test
    public void clear() {
        stringList.clear();
        assertEquals(true, stringList.isEmpty());
    }

}