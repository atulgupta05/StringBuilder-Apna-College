public class StringBuilderP {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("AtulGupta");
        System.out.println(sb);
        System.out.println();
        for (int i = 0; i < sb.length() / 2; i++) {

            // Initialization
            int front = i, back = sb.length() - 1 - i;

            // Storing Values
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            // Setting Values
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }
}
