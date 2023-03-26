package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();

        stack.push("Hello world");

        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

  //  For the Set interface, HashSet is the most commonly used implementation.
     @Test
    public void hashMapTest(){
        HashMap<String, Integer> Map = new HashMap<>();
        Map.put("Roll", 2);
        Integer expected = 2;
         Assert.assertEquals(expected, Map.get("Roll"));
     }

 //   For the List interface, ArrayList is the most commonly used implementation.
    @Test
    public void testArrayList(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        Integer expected = 5;
        Assert.assertEquals(expected, arr.get(0));
    }

 //   For the Map interface, HashMap is the most commonly used implementation.
    @Test
    public void testHashSet(){
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        Integer expected = 2;
        Assert.assertTrue(set.contains(2));
    }

  //  For the Queue interface, LinkedList is the most commonly used implementation.
    @Test
    public void testLinkedList(){
        LinkedList<Integer> link = new LinkedList<>();
        link.add(1);
        link.add(2);
        Integer expected = 2;
        Assert.assertEquals(expected, link.getLast());
    }

 //   For the Deque interface, ArrayDeque is the most commonly used implementation.
    @Test
    public void testArrayDeque(){
        ArrayDeque<String> que = new ArrayDeque<>();
        que.add("ayy");
        que.add("lmao");
        String expected = "lmao";
        que.pop();
        Assert.assertEquals(expected, que.getFirst());
    }
    @Test
    public void testVector(){
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        boolean expected = false;
        Assert.assertEquals(expected, vector.isEmpty());
    }
    @Test
    public void testTreeMap(){
        TreeMap<String, Integer> seed = new TreeMap<>();
        seed.put("Maple", 1);
        boolean expected = false;
        Assert.assertEquals(expected, seed.isEmpty());
    }
    @Test
    public void testStack(){
        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        intStack.push(2);
        Integer expected = 2;
    }
}
