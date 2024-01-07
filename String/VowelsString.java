package String;
import java.util.*;
class VowelsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[] = s.split(" ");
        int count = 0;
        System.out.print("[");
        for (String b : a) {
            int vowelsCount = CountVowels(b);
            if (vowelsCount >= 3) {
                if (count > 0) {
                    System.out.print(", ");
                }
                System.out.print("\'" + b + "\'");
                count++;
            }
        }
        System.out.print("]");
    }

    static int CountVowels(String word) {
        int vowelsCount = 0;
        String words = word.toUpperCase();
        for (int i = 0; i < words.length(); i++) {

            char c = words.charAt(i);

            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowelsCount++;
            }

        }
        return vowelsCount;
    }

}


// package main

// import (
// 	"fmt"
// 	"strings"
// )

// func main() {
// 	var s string
// 	fmt.Scanln(&s)
// 	words := strings.Split(s, " ")
// 	var count int
// 	fmt.Print("[")
// 	for _, word := range words {
// 		vowelsCount := countVowels(word)
// 		if vowelsCount >= 3 {
// 			if count > 0 {
// 				fmt.Print(", ")
// 			}
// 			fmt.Printf("'%s'", word)
// 			count++
// 		}
// 	}
// 	fmt.Print("]")
// }

// func countVowels(word string) int {
// 	vowelsCount := 0
// 	word = strings.ToUpper(word)
// 	for _, c := range word {
// 		if c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' {
// 			vowelsCount++
// 		}
// 	}
// 	return vowelsCount
// }