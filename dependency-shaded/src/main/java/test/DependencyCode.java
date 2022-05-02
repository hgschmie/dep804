package test;

import test.lib1.Lib1;

public class DependencyCode {
    public final Lib1 lib1 = new Lib1();

    public void execute() {
        System.out.println("DependencyCode code start!");

        System.out.println("lib1 is at " + lib1);
        lib1.execute();
    }
}
