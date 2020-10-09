public class StringExperiments {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s4 = "Lindsay";
        String s5 = "Lindsay";

        System.out.printf("s1 == s2: %b%n",s1==s2);
        System.out.printf("s1.equals(s2): %b%n",s1.equals(s2));

        System.out.printf("s1==\"Java\": %b%n",s1=="Java");
        String s3 = s1;
        System.out.printf("s1 == s3: %b%n",s1==s3);
        System.out.printf("s4 == s5: %b%n",s4==s5);
        System.out.println(String.format("$%-10.2f", 78.6573652));

        String name = "Wright, Jaret, Fun, happy, thanksgiving";
        String[] contacts = name.split(",");
        for (int i=0; i<contacts.length; i++)
            System.out.printf("%2d: %s%n", i, contacts[i]);

        System.out.printf("Lindsay (index 2-5): '%s'%n",s5.substring(2));

        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        System.out.println(sb.toString());
    }
}
