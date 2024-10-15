//Questions:-1

// import java.util.*;
// public class normal {
//     public static String solution(String input) {
//         input = input.trim();
//         input = input.replaceAll("[^a-zA-Z0-9 ]", "");
//         input = input.replaceAll(" +", " ");
//         String[] words = input.split(" ");
//         StringBuilder result = new StringBuilder();
//         for (String word : words) {
//             result.append(Character.toUpperCase(word.charAt(0)))
//                   .append(word.substring(1).toLowerCase())
//                   .append(" ");
//         }
//         return result.toString().trim();
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String input = sc.nextLine();
//         String normalString = solution(input);
//         System.out.println("Normale String is: " + normalString);
//     }
// }



//Question:-2

import java.util.*;
public class normal{ 
    public static String getAnswer(String userQuestion, Map<String, String> keyValuePairs) {
        userQuestion = userQuestion.toLowerCase(); 

        for (String question : keyValuePairs.keySet()) {
            if (userQuestion.contains(question.toLowerCase())) {
                return keyValuePairs.get(question); 
            }
        }
        return "I'm sorry, I don't understand the question.";
    }

    public static void main(String[] args) {
        Map<String, String> keyValuePairs = new HashMap<>();
        keyValuePairs.put("What is your name?", "My name is Chatbot.");
        keyValuePairs.put("How can I help you?", "I can assist you with your queries.");
        keyValuePairs.put("What is the weather today?", "The weather is sunny.");

        Scanner sc = new Scanner(System.in);
        System.out.println("User question:- ");
        String userQuestion = sc.nextLine();
        String answer = getAnswer(userQuestion, keyValuePairs);
        System.out.println("Application answer:- " + answer);
    }
}
