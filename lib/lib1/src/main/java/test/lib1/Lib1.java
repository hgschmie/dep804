package test.lib1;

import test.lib2.Lib2;

public class Lib1 {

    Lib2 lib2 = new Lib2();

    public void execute() {
        System.out.println("lib 1 start!");

        System.out.println("lib 2 is at " + lib2);
        lib2.execute();
    }
}
