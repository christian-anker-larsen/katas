package args;

public class Args {
    private String[] arguments;
    
    public Args(String schema, String[] arguments) {
        this.arguments = arguments;
    }
    
    public boolean getBoolean(char flag) {
        for (String arg : arguments) {
            if (arg.equals("-" + flag)) {
                return true;
            }
        }
        return false;
    }
    
    public String getString(char flag) {
        return arguments[1];
    }
}