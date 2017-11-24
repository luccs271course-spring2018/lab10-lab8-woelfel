package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter
  private WordCounter counter;
  Map<String, Integer> mapRef = new HashMap<String, Integer>();
  WordCounter counter = new WordCounter(mapRef);

  @Before
  public void setUp() {
    // TODO create the SUT instance
    this.counter=counter
  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
    counter = null
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
    assertTrue(mapRef.isEmpty());

  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
     Iterator itr = Arrays.asList("hello", "world", "hello", "world", "goodbye", "world").iterator();
    count.countWords(itr);
    assertEquals(2, count.getCount("hello"));
    assertEquals(3, count.getCount("hello"));
    assertNotEquals(3, count.getCount("world"));
    assertNotEquals(2, count.getCount("hel"));
    assertNotEquals(1, count.getCount("goodbye"));

  }
}
