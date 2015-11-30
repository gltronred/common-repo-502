package sources;

import exceptions.CompilationFailedException;
import programs.IProgram;
import programs.Mario;

public class MarioSource implements ISource {
    public String getName() { return "Mario Source"; }
    public IProgram compile() throws CompilationFailedException { return new Mario(); }
}

