
package programs;

public class Linux implements IProgram {
    public String getName() { return "Linux"; }
    public void work() { System.out.println("Working with "+getName()); }
}

