public class Main {

    /*
     [0-255] [0][0][0][][][][][][][][][]...[] <- 30_000
      ^

     > - move caret right
     < - move caret left
     + - inc number in cell
     - - dec number in cell
     . - print as ascii
     ...and 3 more...
     */

    public static void main(String[] args) {
        // reference type (default - null)
        String s = ">>>+++++++.";
        // primitive type (0 / false)
        char[] cells = new char[30_000];
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // TODO: write switch
        }
    }
}

