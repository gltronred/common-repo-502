package sources;

import exceptions.CompilationFailedException;
import programs.IProgram;
import programs.Tetris;

public class TetrisSource implements ISource {
    public String getName() { return "Tetris Source"; }
    public IProgram compile() throws CompilationFailedException { return new Tetris(); }
}

