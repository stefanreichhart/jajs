public class MultilineSolution {
    public static void main(String[] args) {

        // "C:\Program Files\Java\jdk-12\bin\javac.exe" --enable-preview --release 12 MultilineSolution.java
        // "C:\Program Files\Java\jdk-12\bin\java.exe" --enable-preview MultilineSolution
        String script2 = `function hello() {
                        print('"Hello World"');
                     }

                     hello();
                    `;
        System.out.print(script2);

    }
}