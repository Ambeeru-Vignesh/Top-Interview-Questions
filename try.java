import javafx.util.Pair;
  
class GfG {
    public static Pair<Integer, String> getTwo()
    {
        return new Pair<Integer, String>(10, "GeeksforGeeks");
    }
  
    // Return multiple values from a method in Java 8
    public static void main(String[] args)
    {
        Pair<Integer, String> p = getTwo();
        System.out.println(p.getKey() + " " + p.getValue());
    }
}