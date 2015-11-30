package sources;

import exceptions.CompilationFailedException;
import programs.INamed;
import programs.IProgram;

public interface ISource extends INamed {
    IProgram compile() throws CompilationFailedException;
}

