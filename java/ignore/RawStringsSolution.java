public class RawStringsSolution {
    public static void main(String[] args) {

        // "C:\Program Files\Java\jdk-12\bin\javac.exe" -encoding utf8 -Xlint:preview --enable-preview --release 12 RawStringsSolution.java
        // "C:\Program Files\Java\jdk-12\bin\java.exe" --enable-preview RawStringsSolution
        String script2 = `function hello() {
                        print('"Hello World"');
                     }

                     hello();
                    `;
        System.out.print(script2);

        System.out.println(`\n`.equals("\\n"));
        System.out.println(`\n`.length() == 2);
        System.out.println(`❤`.equals("\u2764"));

    }
}