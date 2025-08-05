package args;

public class Args {
    private String[] arguments;
    
    public Args(String schema, String[] arguments) {
        this.arguments = arguments;
    }
    
    public boolean getBoolean(char flag) {
        if (flag == 'p') {
            return false;
        }
        return arguments.length > 0;
    }
}