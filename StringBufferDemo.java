public class StringBufferDemo {
    public static void main(String[] args) {
        System.out.println("StringBuffer is a Thread Safe");
        StringBuffer sb = new StringBuffer("Shiva");
        System.out.println(sb);
        sb.append(" murapala");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.insert(6,"sandhya ");
        System.out.println(sb);
    }
}
