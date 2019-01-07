public class RawStrings {

    public static void main(String[] args) {

        // "C:\Program Files\Java\jdk-12\bin\javac.exe" -encoding utf8 -Xlint:preview --enable-preview --release 12 RawStrings.java
        // "C:\Program Files\Java\jdk-12\bin\java.exe" --enable-preview RawStrings

        String script = "function hello() {\n" +
                "   print(\'\"Hello World\"\');\n" +
                "}\n" +
                "\n" +
                "hello();\n";
        System.out.print(script);


        System.out.println(`\n`.equals("\\n"));
        System.out.println(`\n`.length() == 2);

        System.out.println(`\\n`.equals("\\\\n"));
        System.out.println(`\\n`.length() == 3);

        System.out.println("\n".length() == 1);

        System.out.println(`❤`.equals("\u2764"));
        System.out.println(`❤`.length() == 1);

    }

}