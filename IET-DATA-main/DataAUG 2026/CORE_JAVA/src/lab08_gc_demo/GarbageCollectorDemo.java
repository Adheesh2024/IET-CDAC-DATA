package lab08_gc_demo;

/**
 * Lab 08: Demonstrating System.gc() and Garbage Collection lifecycle.
 * Run command: java -cp bin lab08_gc_demo.GarbageCollectorDemo
 */
class SampleObject {
    private String name;

    public SampleObject(String name) {
        this.name = name;
        System.out.println("--> Object Created: " + name);
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        System.out.println(" [GC Action] Garbage Collector is reclaiming memory of: " + name);
    }
}

public class GarbageCollectorDemo {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       DEMONSTRATING System.gc() IN JAVA          ");
        System.out.println("==================================================");

        SampleObject obj1 = new SampleObject("Object-A (101)");
        SampleObject obj2 = new SampleObject("Object-B (102)");

        System.out.println("\n--- Dereferencing Objects ---");
        obj1 = null;
        obj2 = null;

        System.out.println("obj1 and obj2 set to null. They are now eligible for GC.");

        System.out.println("\n--- Requesting JVM to run Garbage Collection (System.gc()) ---");
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nMain method execution completed.");
        System.out.println("==================================================");
    }
}
