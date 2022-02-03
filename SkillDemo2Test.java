//import assert and jUnit
import static org.junit.Assert.*;
import org.junit.*;
//now lets get the libraries
public class SkillDemo2Test {
    @Test
    public void subtraction(){
        assertEquals(8,SkillDemo2.subtract(16,2));
    }
}
