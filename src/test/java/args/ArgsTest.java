package args;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    
    @org.junit.jupiter.api.Test
    public void shouldFindFlagWhenNotFirstArgument() {
        Args args = new Args("l,p", new String[]{"-p", "-l"});
        assertTrue(args.getBoolean('l'));
    }
    
    @org.junit.jupiter.api.Test
    public void shouldParseStringFlag() {
        Args args = new Args("d*", new String[]{"-d", "/usr/logs"});
        assertEquals("/usr/logs", args.getString('d'));
    }
    
    @org.junit.jupiter.api.Test
    public void shouldParseDifferentStringValue() {
        Args args = new Args("d*", new String[]{"-d", "/var/log"});
        assertEquals("/var/log", args.getString('d'));
    }
}
