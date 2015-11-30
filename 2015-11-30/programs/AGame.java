
package programs;

public abstract class AGame implements IProgram {
    abstract String gameName();
    abstract void play();
    public String getName() { return "game " + gameName(); }
    public void work() {
	System.out.println("Playing a " + getName());
	play();
    }
}

