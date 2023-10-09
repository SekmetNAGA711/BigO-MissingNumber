import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BalancedBracketsTest {

    @Test
    public void testHasBalancedParentheses() {
        assertTrue(DataStructures.hasBalancedParentheses("((()))"), "Expected ((())) to be balanced");
        assertFalse(DataStructures.hasBalancedParentheses(")("), "Expected )( to be unbalanced");
        assertTrue(DataStructures.hasBalancedParentheses("(a+b)"), "Expected (a+b) to be balanced");
        assertFalse(DataStructures.hasBalancedParentheses("(a+b)("), "Expected (a+b)( to be unbalanced");
    }

    @Test
    public void testHasBalancedBrackets() {
        assertTrue(DataStructures.hasBalancedBrackets("{[()]}"), "Expected {[()]} to be balanced");
        assertFalse(DataStructures.hasBalancedBrackets("{[(])}"), "Expected {[(])} to be unbalanced");
        assertTrue(DataStructures.hasBalancedBrackets("<{[()]}>"), "Expected <{[()]}> to be balanced");
        assertFalse(DataStructures.hasBalancedBrackets("<{[(])}>"), "Expected <{[(])}> to be unbalanced");
        assertFalse(DataStructures.hasBalancedBrackets("{"), "Expected { to be unbalanced");
        assertFalse(DataStructures.hasBalancedBrackets("["), "Expected [ to be unbalanced");
    }

    @Test
    public void testEmptyString() {
        assertTrue(DataStructures.hasBalancedParentheses(""), "Expected empty string to be balanced");
        assertTrue(DataStructures.hasBalancedBrackets(""), "Expected empty string to be balanced");
    }

    @Test
    public void testWithOtherCharacters() {
        assertTrue(DataStructures.hasBalancedBrackets("a+b"), "Expected a+b to be balanced");
        assertFalse(DataStructures.hasBalancedBrackets("(a+b"), "Expected (a+b to be unbalanced");
    }

}

