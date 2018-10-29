import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
    Main main = new Main();

    @Test
    public void shouldFindCorrectString1() {
        assertEquals(0, main.check_letter("12"));
    }

    @Test
    public void shouldFindCorrectString2() {
        assertEquals(0, main.check_letter("1"));
    }

    @Test
    public void shouldFindCorrectString3() {
        assertEquals(0, main.check_letter("asd"));
    }

    @Test
    public void shouldFindCorrectString4() {
        assertEquals(0, main.check_letter("@"));
    }

    @Test
    public void shouldFindCorrectString5() {
        assertEquals(0, main.check_letter("*$*$*%*$"));
    }

    @Test
    public void shouldFindCorrectString6() {
        assertEquals(0, main.check_letter("я"));
    }

    @Test
    public void shouldFindCorrectString7() {
        assertEquals(0, main.check_letter("лвнвнлв"));
    }

    @Test
    public void shouldFindCorrectString8() {
        assertEquals(0, main.check_letter(""));
    }
    @Test
    public void shouldFindCorrectString9(){
        assertEquals(1, main.check_letter("a"));
    }
    @Test
    public void shouldFindCorrectString10(){
        assertEquals(1, main.check_letter("D"));
    }

}
