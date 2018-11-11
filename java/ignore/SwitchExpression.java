public class SwitchExpression {

    public static void main(String[] args) {
        // "C:\Program Files\Java\jdk-12\bin\javac.exe" --enable-preview --release 12 SwitchExpression.java Weekday.java
        // "C:\Program Files\Java\jdk-12\bin\java.exe" --enable-preview SwitchExpression
        Weekday weekday = Weekday.WEDNESDAY;

        int value = -1;
        switch (weekday) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                value = 1;
                break;
            case FRIDAY:
                value = 2;
                break;
            case SATURDAY:
            case SUNDAY:
                value = 3;
                break;
        }
        System.out.print(value); // 1

    }
}