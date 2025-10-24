public class traversString {
    public static void main(String[] args) {
        String words = "apples are so good";
        String vowels = "aeiouAEIOU";
        String reverse = "";
        int count = 0;

        for(int i =0; i < words.length(); i++) {
            if(vowels.indexOf(words.charAt(i)) != -1) {
                count++;
            }
        }
        System.out.println(count);

        for(int i = words.length() - 1; i >= 0; i--) {
            reverse += words.charAt(i);
        }
        System.out.println(reverse);
    }
    
}
