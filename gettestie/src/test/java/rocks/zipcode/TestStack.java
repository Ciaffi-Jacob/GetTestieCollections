package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

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


 //   For the Deque interface, ArrayDeque is the most commonly used implementation.


}
