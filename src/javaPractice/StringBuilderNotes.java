package javaPractice;

public class StringBuilderNotes {
	public static void main(String[] args) {

        // ============================================
        // 1. WHY STRINGBUILDER?
        // ============================================

        // ❌ BAD — creates new String object every iteration (memory waste)
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += i;
        }

        // ✅ GOOD — modifies same object in memory
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(i);
        }
        System.out.println(sb); // 01234


        // ============================================
        // 2. CREATING A STRINGBUILDER
        // ============================================

        StringBuilder sb1 = new StringBuilder();           // empty
        StringBuilder sb2 = new StringBuilder("Visa");     // with initial value
        StringBuilder sb3 = new StringBuilder(50);         // with initial capacity


        // ============================================
        // 3. MUST KNOW METHODS
        // ============================================

        StringBuilder s = new StringBuilder("Visa");

        // append() — add to end
        s.append(" Payment");
        System.out.println(s); // Visa Payment

        // insert() — add at specific index
        s.insert(4, " Direct");
        System.out.println(s); // Visa Direct Payment

        // delete() — remove from index to index (end exclusive)
        s.delete(4, 11);
        System.out.println(s); // Visa Payment

        // deleteCharAt() — remove single character
        s.deleteCharAt(0);
        System.out.println(s); // isa Payment

        // replace() — replace between indexes
        s.replace(0, 3, "Visa");
        System.out.println(s); // Visa Payment

        // reverse() — reverses the whole thing
        StringBuilder rev = new StringBuilder("Visa");
        rev.reverse();
        System.out.println(rev); // asiV

        // charAt() — get char at index
        StringBuilder s2 = new StringBuilder("Visa");
        System.out.println(s2.charAt(0)); // V

        // setCharAt() — change char at index (String can't do this!)
        s2.setCharAt(0, 'B');
        System.out.println(s2); // Bisa

        // indexOf() — find index of substring
        System.out.println(s2.indexOf("isa")); // 1

        // length() — number of characters
        System.out.println(s2.length()); // 4

        // toString() — convert back to String
        String str = s2.toString();
        System.out.println(str); // Bisa

        // ============================================
        // 4. CHAINING — methods return 'this' so you can chain
        // ============================================

        String chained = new StringBuilder()
                .append("Visa")
                .append(" ")
                .append("Payment")
                .reverse()
                .toString();
        System.out.println(chained); // tnemyaP asiV


        // ============================================
        // 5. COMMON INTERVIEW CODING PATTERNS
        // ============================================

        // --- Reverse a String ---
        String reversed = new StringBuilder("Visa").reverse().toString();
        System.out.println(reversed); // asiV

        // --- Check Palindrome ---
        String word = "racecar";
        boolean isPalindrome = word.equals(new StringBuilder(word).reverse().toString());
        System.out.println(isPalindrome); // true

        // --- Remove spaces from string ---
        String sentence = "V i s a";
        StringBuilder noSpaces = new StringBuilder();
        for (char c : sentence.toCharArray()) {
            if (c != ' ') noSpaces.append(c);
        }
        System.out.println(noSpaces); // Visa

        // --- Reverse words in a sentence ---
        String[] words = "Hello World Visa".split(" ");
        StringBuilder reversedWords = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords.append(words[i]);
            if (i != 0) reversedWords.append(" ");
        }
        System.out.println(reversedWords); // Visa World Hello


        // ============================================
        // 6. STRING vs STRINGBUILDER vs STRINGBUFFER
        // ============================================

        // String        — immutable, thread safe, slow in loops
        // StringBuilder — mutable, NOT thread safe, fastest
        // StringBuffer  — mutable, thread safe, slower than StringBuilder

        // Use StringBuilder in single-threaded code (99% of interview questions)
        // Use StringBuffer only if multiple threads modify same object


        // ============================================
        // 7. CAPACITY — bonus point in interviews
        // ============================================

        StringBuilder cap = new StringBuilder(); // default capacity = 16
        System.out.println(cap.capacity());      // 16

        cap.append("Visa Interview Prep");
        System.out.println(cap.capacity());      // auto expands when needed
        // new capacity = (old capacity * 2) + 2

        // ============================================
        // 8. KEY DIFFERENCE FROM STRING — setCharAt
        // ============================================

        // String — CANNOT modify individual characters
        String immutable = "Visa";
        // immutable.charAt(0) = 'B'; ❌ compile error

        // StringBuilder — CAN modify individual characters
        StringBuilder mutable = new StringBuilder("Visa");
        mutable.setCharAt(0, 'B'); // ✅
        System.out.println(mutable); // Bisa
    }
}