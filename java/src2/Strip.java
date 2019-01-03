public class Strip {

    public static void main(String[] args) {

        String value = "     Hello World !     ";

        String all = value.trim();
        System.out.println("-" + all + "-");

        String leading = value.replaceFirst("^\\s+", "");
        System.out.println("-" + leading + "-");

        String trailing = value.replaceFirst("\\s+$", "");
        System.out.println("-" + trailing + "-");

    }

}
