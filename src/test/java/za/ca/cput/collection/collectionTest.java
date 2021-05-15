package za.ca.cput.collection;
/*
name: Sindiswa Mbhele
date: 15 May 2021
student number: 219279616
 */
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class collectionTest {

    @Test
    public void collection(){

        Collection<String> clothes = new LinkedList<String>();
        clothes.add("dress");
        clothes.add("vest");
        clothes.add("socks");
        clothes.add("T-shirt");
        clothes.add("jacket");

        assertEquals(5, clothes.size());

        //remove
        clothes.remove("socks");
        assertEquals(4, clothes.size());

        //find
        assertTrue(clothes.contains("jacket"));

    }
    @Test
    public void list() {
        List<Integer> numbers = new ArrayList<>();

        //add
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        assertFalse(numbers.isEmpty());
        assertEquals(3, numbers.size());

        //remove
        numbers.remove(1);
        assertEquals("[1, 7]", numbers.toString());

        //find
        assertTrue(numbers.contains(7));
    }

    @Test
    public void set(){
        Set<String> names = new HashSet<>();
        //add
        names.add("Sindy");
        names.add("James");
        names.add("Junior");
        names.add("Angel");
        assertEquals(4, names.size());

        //remove
        names.remove( "Sindy");
        names.remove("Junior");
        assertEquals("[James, Angel]", names.toString());

        //find
        assertTrue(names.contains("James"));
    }

    @Test
    public void map(){
        Map<Integer, String> weight =  new HashMap<>();
        //add
        weight.put(20, "biscuit");
        weight.put(50, "scone");
        weight.put(100, "cake");
        assertEquals(3, weight.size());

        //remove
        weight.remove(20);
        assertEquals(2, weight.size());

        //find
        assertTrue(weight.containsKey(50));
    }
}