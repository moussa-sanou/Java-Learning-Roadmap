public class FinallyDemo {
    public static void main(String[] args) {
        java.io.PrintWriter output = null;

        try {
            // Create a file
            output = new java.io.PrintWriter("Text.txt");

            // Write formatted output to the file
            output.println("Welcome to java");
        }
        catch (java.io.IOException ex){
            ex.printStackTrace();
        }
        finally {
            // Close the file
            if (output != null) output.close();
        }
    }
}
