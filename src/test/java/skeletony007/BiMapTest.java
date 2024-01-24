package skeletony007;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BiMapTest {

    @Test
    public void testBiMap() {
        BiMap<String, Integer> biMap = new BiMap<>();

        biMap.put("apple", 1);
        biMap.put("banana", 2);

        assertEquals(Integer.valueOf(1), biMap.get("apple"));
        assertEquals(Integer.valueOf(2), biMap.get("banana"));
        assertEquals("apple", biMap.inverse(1));
        assertEquals("banana", biMap.inverse(2));

        biMap = new BiMap<>(2);

        biMap.put("apple", 1);
        biMap.put("banana", 2);

        assertEquals(Integer.valueOf(1), biMap.get("apple"));
        assertEquals(Integer.valueOf(2), biMap.get("banana"));
        assertEquals("apple", biMap.inverse(1));
        assertEquals("banana", biMap.inverse(2));
    }
}
