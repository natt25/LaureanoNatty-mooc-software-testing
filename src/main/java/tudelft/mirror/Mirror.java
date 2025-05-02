package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;
        //for (; begin < end; begin++, end--) {
        for (; begin < string.length(); begin++, end--) {
            if (string.charAt(begin) == string.charAt(end)) {
                //mirror += String.valueOf(string.charAt(end));
                mirror += string.charAt(begin);
            }
            else {
                break;
            }
        }

        //return begin == end ? string : mirror;
        return mirror;
    }
}
