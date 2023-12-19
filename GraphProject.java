
public class GraphProject {
    /**
     * @param args
     *            Command line parameters
     */
    public static void main(String[] args)
        throws NumberFormatException,
        Exception {
        // This is the main file for the program.
        // checks for three arguments
        if (args != null && args.length == 2) {

            CommandProcessor processor = new CommandProcessor(Integer.parseInt(
                args[0]), args[1]);

        }
        else {
            CommandProcessor hello = new CommandProcessor(10,
                "P4sampleInput.txt");

        }
        // This is the main file for the program.
    }
}
