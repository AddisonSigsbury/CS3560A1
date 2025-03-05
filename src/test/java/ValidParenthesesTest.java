import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
    @Test
    public void testIsValid() {
        ValidParentheses vp = new ValidParentheses();
        assertTrue(vp.isValidParentheses("()"));
        assertTrue(vp.isValidParentheses("()[]{}"));
        assertFalse(vp.isValidParentheses("(]"));
        assertFalse(vp.isValidParentheses("([)]"));
    }
}