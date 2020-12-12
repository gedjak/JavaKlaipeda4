package basics;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionExamples {
    @Test
    public void testAssertEquals(){
        //given
        int firstNum = 5;
        int secondNum = 20;
        //when
        int result = firstNum * secondNum;
        //then
        assertEquals(100, result);
        assertNotEquals(50, result);
    }

    @Test
    public void testAssertTrueFalse(){
        //given
        int firstNum = 5;
        int secondNum = 20;
        //when
        boolean condition = firstNum == secondNum;
        //then
        assertTrue(firstNum != secondNum);
        assertFalse(condition);
    }
    @Test
    public void testArrayEquals(){
        //given
        int[] firstArr = {1,2,3};
        int[] secondArr = {1,2,3};
        //when

        //then
        Assertions.assertThat(firstArr).isEqualTo(secondArr);
    }
    @Test
    public void testAssertNull(){
        //given
        String emptyText = null;
        String text = "sugalvotas textas";
        //when

        //then
        assertNull(emptyText);
        assertNotNull(text);
    }
    @Test
    public void testAssertSame(){
        //given
        String text1 = "abc";
        String text = "abc";
        String text2 = new String("abc");
        //when
        //then
        assertSame(text1, text);
        assertNotSame(text, text2);
    }
}
