public class OopsBannerJoin {
    public static void main(String[] args) {
        
        // Printing the OOPS banner line by line using String.join.
        // The first argument " " acts as the delimiter, automatically 
        // placing a single space between each 9-character letter block.
        
        // Line 1
        System.out.println(String.join(" ", "   *** ", "   *** ", "******* ", "  ***** "));
        
        // Line 2
        System.out.println(String.join(" ", " ** ** ", " ** ** ", "** ** ", " ** "));
        
        // Line 3
        System.out.println(String.join(" ", "** **", "** **", "** ** ", "** "));
        
        // Line 4
        System.out.println(String.join(" ", "** **", "** **", "******* ", "  ***** "));
        
        // Line 5
        System.out.println(String.join(" ", "** **", "** **", "** ", "      ** "));
        
        // Line 6
        System.out.println(String.join(" ", " ** ** ", " ** ** ", "** ", " ** ** "));
        
        // Line 7
        System.out.println(String.join(" ", "   *** ", "   *** ", "** ", "  ***** "));
    }
}