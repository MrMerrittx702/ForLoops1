import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.io.*;

class ForLoops1Test {
  
  @Test
  public void testCountUp()
  {
    PrintStream originalOut = System.out; ByteArrayOutputStream bos = new ByteArrayOutputStream(); System.setOut(new PrintStream(bos));

    // action
    ForLoops1.countUp(10);

    // assertion
    assertEquals("1 2 3 4 5 6 7 8 9 10 ", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testCountDown()
  {
    PrintStream originalOut = System.out; ByteArrayOutputStream bos = new ByteArrayOutputStream(); System.setOut(new PrintStream(bos));

    // action
    ForLoops1.countDown(10);

    // assertion
    assertEquals("10 9 8 7 6 5 4 3 2 1 ", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testCountUpMultiples()
  {
    PrintStream originalOut = System.out; ByteArrayOutputStream bos = new ByteArrayOutputStream(); System.setOut(new PrintStream(bos));

    // action
    ForLoops1.countUpMultiples(10,2);

    // assertion
    assertEquals("1 3 5 7 9 ", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testCountDownMultiples()
  {
    PrintStream originalOut = System.out; ByteArrayOutputStream bos = new ByteArrayOutputStream(); System.setOut(new PrintStream(bos));

    // action
    ForLoops1.countDownMultiples(10, 2);

    // assertion
    assertEquals("10 8 6 4 2 ", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testEnhancedFor()
  {
    PrintStream originalOut = System.out; ByteArrayOutputStream bos = new ByteArrayOutputStream(); System.setOut(new PrintStream(bos));
    
    String[] array = {"a", "b" , "c" ,"d"};
    // action
    ForLoops1.enhancedFor(array);

    // assertion
    assertEquals("a b c d ", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testProcessString()
  {
    PrintStream originalOut = System.out; ByteArrayOutputStream bos = new ByteArrayOutputStream(); System.setOut(new PrintStream(bos));
    
    String str = "Hello World";
    
    // action
    ForLoops1.processString(str);

    // assertion
    assertEquals("H e l l o   W o r l d ", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testProcessArray()
  {
    PrintStream originalOut = System.out; ByteArrayOutputStream bos = new ByteArrayOutputStream(); System.setOut(new PrintStream(bos));
    
    String[] array = {"a","b","c","d"};
    
    // action
    ForLoops1.processArray(array);

    // assertion
    assertEquals("a b c d ", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testProcess2dArray()
  {
    PrintStream originalOut = System.out; ByteArrayOutputStream bos = new ByteArrayOutputStream(); System.setOut(new PrintStream(bos));
    
    String[][] array = {{"a","b","c","d"},{"e","f","g","h"},{"i","j","k","l"}};
    
    // action
    ForLoops1.process2dArray(array);

    // assertion
    assertEquals("a b c d " + System.lineSeparator() + "e f g h " + System.lineSeparator() + "i j k l " + System.lineSeparator(), bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
  
  @Test
  public void testEnhanced2dArray()
  {
    PrintStream originalOut = System.out; ByteArrayOutputStream bos = new ByteArrayOutputStream(); System.setOut(new PrintStream(bos));
    
    String[][] array = {{"a","b","c","d"},{"e","f","g","h"},{"i","j","k","l"}};
    
    // action
    ForLoops1.enhanced2dArray(array);

    // assertion
    assertEquals("a b c d " + System.lineSeparator() + "e f g h " + System.lineSeparator() + "i j k l" + System.lineSeparator(), bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  } 
}
