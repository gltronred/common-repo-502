
import exceptions.*;
import programs.*;
import sources.*;

public class Main {
    public static void main(String[] args) {
	System.out.println("Working with sources...");
	ISource[] sources = new ISource[4];
	sources[0] = new WindowsSource();
	sources[1] = new LinuxSource();
	sources[2] = new TetrisSource();
	sources[3] = new MarioSource();

	for (int i=0; i<4; i++) {
	    try {
		System.out.println("Compiling: " + sources[i].getName());
		IProgram program = sources[i].compile();
		System.out.println("Got: " + program.getName());
		program.work();
	    } catch (CompilationFailedException e) {
		System.out.println("Oops! " + e);
	    }
	}

	System.out.println("Working with programs...");
	IProgram[] programs = new IProgram[4];
	programs[0] = new Linux();
	programs[1] = new Tetris();
	programs[2] = new Mario();
	programs[3] = new Windows();

	for (int i=0; i<4; i++) {
	    System.out.println("Starting: " + programs[i].getName());
	    programs[i].work();
	}

	System.out.println("Finished");
    }
}

