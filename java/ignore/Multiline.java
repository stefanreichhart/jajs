public class Multiline {
    public static void main(String[] args) {

        // "C:\Program Files\Java\jdk-12\bin\javac.exe" --enable-preview --release 12 Multiline.java
        // "C:\Program Files\Java\jdk-12\bin\java.exe" --enable-preview Multiline
        String script = "function hello() {\n" +
                "   print(\'\"Hello World\"\');\n" +
                "}\n" +
                "\n" +
                "hello();\n";
        System.out.print(script);

    }
}