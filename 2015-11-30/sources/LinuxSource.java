package sources;

import exceptions.CompilationFailedException;
import programs.IProgram;
import programs.Linux;

public class LinuxSource implements ISource {
    public String getName() { return "Linux Source"; }
    public IProgram compile() throws CompilationFailedException { return new Linux(); }
}

