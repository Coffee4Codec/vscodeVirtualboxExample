public class traversString {
    public static void main(String[] args) {
        String words = "apples are so good";
        String vowels = "aeiouAEIOU";
        int count = 0;

        for(int i =0; i < words.length(); i++) {
            if(vowels.indexOf(words.charAt(i)) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
