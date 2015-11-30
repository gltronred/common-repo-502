package sources;

import exceptions.CompilationFailedException;
import programs.IProgram;
import programs.Windows;

public class WindowsSource implements ISource {
    public String getName() { return "Windows Source"; }
    public IProgram compile() throws CompilationFailedException {
	throw new CompilationFailedException();
    }
}

