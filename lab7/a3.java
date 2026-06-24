package lab7;
import java.util.Scanner;
class VowelCounter {
    int countA = 0;
    int countE = 0;
    int countI = 0;
    int countO = 0;
    int countU = 0;
    

    public void countVowels(String sentence) {
        String lowerSentence = sentence.toLowerCase();
        
        for (char ch : lowerSentence.toCharArray()) {
            switch (ch) {
                case 'a':
                    countA++;
                    break;
                case 'e':
                    countE++;
                    break;
                case 'i':
                    countI++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 'u':
                    countU++;
                    break;
            }
        }
    }
    
  
    public void displaySentenceCount(String sentence) {
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        String lowerSentence = sentence.toLowerCase();
        
        for (char ch : lowerSentence.toCharArray()) {
            switch (ch) {
                case 'a': a++; break;
                case 'e': e++; break;
                case 'i': i++; break;
                case 'o': o++; break;
                case 'u': u++; break;
            }
        }
        
        System.out.println("A: " + a + ", E: " + e + ", I: " + i + ", O: " + o + ", U: " + u);
    }
    
  
    public void displayTotalCount() {
        System.out.println("A: " + countA);
        System.out.println("E: " + countE);
        System.out.println("I: " + countI);
        System.out.println("O: " + countO);
        System.out.println("U: " + countU);
        System.out.println("Total Vowels: " + (countA + countE + countI + countO + countU));
    }
}
public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VowelCounter counter = new VowelCounter();
        
        while (true) {
            System.out.print("Enter a sentence: ");
            String input = sc.nextLine();
            
       
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            
     
            counter.countVowels(input);
            counter.displaySentenceCount(input);
        }
        
        
        counter.displayTotalCount();
        
        sc.close();
    }
}
