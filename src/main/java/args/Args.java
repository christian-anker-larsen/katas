package args;

public class Args {
    private String[] arguments;
    
    public Args(String schema, String[] arguments) {
        this.arguments = arguments;
    }
    
    public boolean getBoolean(char flag) {
        return arguments.length > 0 && arguments[0].equals("-" + flag);
    }
}