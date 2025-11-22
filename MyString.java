public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    // Nowhere in the documentation it speicifies that i can not use str.toLowerCase()
    //  - i'm tempted to use it
    // used ascii value instead of a 26 "or" statement
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        char[] charArray = str.toCharArray();
        for(int i=0;i<charArray.length;i++){
            int charAsciival=(int) charArray[i];
            //System.out.println(charAsciival);
            if(charAsciival>=65 && charAsciival<=90){
                charAsciival+=32;
                charArray[i]=(char)charAsciival;
            }
        }
        String outputStr = new String(charArray);
        return outputStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if(str2.equals("")){
            return true;
        }
        for(int i=0;i<str1.length();i++){
            for(int j=i;j<str1.length();j++){
                //System.out.println(str1.substring(i, j+1));
                if(str1.substring(i, j+1).equals(str2)){
                    return true;
                }
            }
        }
        return false;
    }
}
