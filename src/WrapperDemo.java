public class WrapperDemo {
    public static void main(String[] args) {
        int b1 = 100;
        //primitive type has no features
        Integer b2 = 100;
        //wrapper class of int type
        String s = b2.toString();
        short s1 = b2.shortValue();
        //wrapper class object are not just values they also have features to
        // operate upon those values

        String cost = "310";
        int amount = Integer.parseInt(cost);
        //Integer wrapper class also has some static methods we can
        // call without using object

        System.out.println("Binary sequence : " +Integer.toBinaryString(b2));
        System.out.println("Maximum Integer value : "+Integer.MAX_VALUE);
        System.out.println("Minimum Integer value : "+Integer.MIN_VALUE);

        Character c = 'P';
        System.out.println("Character c is " +c);
        System.out.println(Character.getName(1234));
        System.out.println(Character.toString(1234));

        System.out.println(Character.getName(2325));
        System.out.println(Character.toString(2325));

    }
}
