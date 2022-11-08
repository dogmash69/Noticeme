public class Decipherer {
    public static String kamoulox (String message) {
        double keyNumber= message.length()/2;
        String substring = message.substring(5, (int) (5+keyNumber));
        String replacedStr = substring.replaceAll("@#\\?"," ");
        StringBuilder sb=new StringBuilder(replacedStr);
        sb.reverse();
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(kamoulox("0@sn9sirppa@#?ia'jgtvryko1") + " " + kamoulox("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj")+ " " + kamoulox("aopi?sedohtém@#?sedhtmg+p9l!"));
    }
}
