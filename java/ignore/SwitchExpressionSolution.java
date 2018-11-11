public class SwitchExpressionSolution {

    public static void main(String[] args) {
        // "C:\Program Files\Java\jdk-12\bin\javac.exe" --enable-preview --release 12 SwitchExpressionSolution.java Weekday.java
        // "C:\Program Files\Java\jdk-12\bin\java.exe" --enable-preview SwitchExpressionSolution
        Weekday weekday = Weekday.WEDNESDAY;

        int value = switch (weekday) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> 1;
            case FRIDAY -> 2;
            case SATURDAY, SUNDAY -> 3;
        };
        System.out.print(value); // 1

    }
}