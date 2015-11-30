
package programs;

import exceptions.ProgramDoesntWorkException;

public class Windows implements IProgram {
    public String getName() { return "Windows"; }
    public void work() { throw new ProgramDoesntWorkException(); }
}

