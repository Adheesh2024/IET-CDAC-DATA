package lab17_string_memory;

/**
 * Lab 17: String Javadocs API, Immutability, String Pool, StringBuffer, and StringBuilder.
 * Run command: java -cp bin lab17_string_memory.StringMemoryAndApiDemo
 */
public class StringMemoryAndApiDemo {

    public static void demonstrateStringMethods() {
        System.out.println("--- 1. Exploring String Class Javadoc API Methods ---");
        String sample = "  Hello Java World  ";

        System.out.println("Original String              : '" + sample + "'");
        System.out.println("length()                     : " + sample.length());
        System.out.println("trim()                       : '" + sample.trim() + "'");
        System.out.println("trim().toUpperCase()         : '" + sample.trim().toUpperCase() + "'");
        System.out.println("charAt(8)                    : " + sample.charAt(8));
        System.out.println("substring(8, 12)             : '" + sample.substring(8, 12) + "'");
        System.out.println("replace('a', '@')            : '" + sample.replace('a', '@') + "'");
        System.out.println("indexOf(\"Java\")              : " + sample.indexOf("Java"));
        System.out.println("contains(\"World\")            : " + sample.contains("World"));
    }

    public static void demonstrateImmutability() {
        System.out.println("\n--- 2. String Immutability Demonstration ---");
        String str1 = "Java";
        System.out.println("Before concat()              : str1 = " + str1);
        
        str1.concat(" Programming");
        System.out.println("After concat() without save  : str1 = " + str1 + " (Original Unchanged!)");
        
        str1 = str1.concat(" Programming");
        System.out.println("After reassigning result     : str1 = " + str1 + " (New Object Created)");
    }

    public static void demonstrateStringConstantPool() {
        System.out.println("\n--- 3. String Constant Pool (SCP) & Memory Comparison ---");
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = s3.intern();

        System.out.println("Literal s1 == Literal s2 (SCP reference check)     : " + (s1 == s2) + " (True: Same SCP memory)");
        System.out.println("Literal s1 == Heap s3    (Reference check)         : " + (s1 == s3) + " (False: Different memory locations)");
        System.out.println("Literal s1.equals(Heap s3) (Value check)            : " + s1.equals(s3) + " (True: Content is identical)");
        System.out.println("Literal s1 == Heap s3.intern() (Intern check)       : " + (s1 == s4) + " (True: Pointing to same SCP object)");
    }

    public static void demonstrateBufferAndBuilder() {
        System.out.println("\n--- 4. Mutable Strings: StringBuffer vs StringBuilder ---");

        StringBuffer buffer = new StringBuffer("Java");
        buffer.append(" StringBuffer (Synchronized)");
        System.out.println("StringBuffer Result          : " + buffer);

        StringBuilder builder = new StringBuilder("Java");
        builder.append(" StringBuilder (Faster)");
        builder.reverse();
        System.out.println("StringBuilder Reversed       : " + builder);
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   STRING API, MEMORY & IMMUTABILITY EXPLORER     ");
        System.out.println("==================================================");

        demonstrateStringMethods();
        demonstrateImmutability();
        demonstrateStringConstantPool();
        demonstrateBufferAndBuilder();

        System.out.println("==================================================");
    }
}
