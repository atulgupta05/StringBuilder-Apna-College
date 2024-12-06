public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Atulgupta");

        // Printing a character
        System.out.println(sb.charAt(0));

        // Setting a Character or Replace 'g'-->'G'
        sb.setCharAt(4, 'G');
        System.out.println(sb);

        // Inserting a value or Space
        sb.insert(4, ' ');
        System.out.println(sb);

        // Deleting a value from startIndex to endIndex+1, It ignores the last value
        sb.delete(4, 5);
        System.out.println(sb);

        //Append an value -->Only a Single character can be Appended
        sb.append('A');
        System.out.println(sb);

    }
}