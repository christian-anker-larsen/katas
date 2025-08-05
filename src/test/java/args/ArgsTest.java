package args;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import net.gamrath.junitpredict.Predict;

@ExtendWith(Predict.class)
public class ArgsTest {
    
    @org.junit.jupiter.api.Test
    public void shouldParseSingleBooleanFlag() {
        Args args = new Args("l", new String[]{"-l"});
        assertTrue(args.getBoolean('l'));
    }
    
    @org.junit.jupiter.api.Test
    public void shouldReturnFalseWhenBooleanFlagNotPresent() {
        Args args = new Args("l", new String[]{});
        assertFalse(args.getBoolean('l'));
    }
    
    @org.junit.jupiter.api.Test
    public void shouldReturnFalseWhenDifferentFlagIsPresent() {
        Args args = new Args("l,p", new String[]{"-l"});
        assertFalse(args.getBoolean('p'));
    }
}
