public class StripSolution {

    public static void main(String[] args) {

        String value = "     Hello World !     ";

        String all = value.strip();
        System.out.println("-" + all + "-");

        String leading = value.stripLeading();
        System.out.println("-" + leading + "-");

        String trailing = value.stripTrailing();
        System.out.println("-" + trailing + "-");

    }

}
