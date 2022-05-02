package test;

public class Main {
    public final DependencyCode dependencyCode = new DependencyCode();

    public static final void main(String ... args) throws Exception {

        Main main = new Main();
        main.execute();
    }

    public void execute() {
        System.out.println("Main code start!");

        System.out.println("DependencyCode is at " + dependencyCode);
        dependencyCode.execute();
    }
}
