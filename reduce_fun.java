import java.util.*;
public class streamapi1{
    public static void main(String[] args) {
        List<Integer> l1 = List.of(1,2,3,4,5,6,7,8,9);
        l1.stream().reduce((e1,e2)->e1+e2).ifPresent(System.out::println);
        
        //2nd way 
      int sum =  l1.stream().reduce(1, (e1,e2)->e1*e2); //multiplication  
      System.out.println(sum);

      //2 find the max number using reduce
      int max = l1.stream().reduce(Integer.MIN_VALUE, (e1,e2)->e1>e2?e1:e2);
      System.out.println(max);

      //3 Count total elements  using reduce()(without using count() method)
      int count = l1.stream().reduce(0, (acc, e) -> acc + 1);
      System.out.println(count);

      //4 wirte a java program to calculate the sum of all even numbers in a list using reduce() method
      int evenSum = l1.stream().filter(e -> e % 2 == 0).reduce(0, (acc, e) -> acc + e);
      System.out.println(evenSum);

      // 5 write a java program using reduce() to concatenate all strings whose length is greater than 3 in a list of strings
      List<String> strList = List.of("Java", "Stream", "API", "Programming", "Language");
      String concatenated = strList.stream().filter(s -> s.length() > 3).reduce("", (acc, s) -> acc + s);
      System.out.println(concatenated); 

      // 6 write a java program to multiply only the odd numbers in a list using reduce() method
      int oddProduct = l1.stream().filter(e -> e % 2 != 0).reduce(1, (acc, e) -> acc * e);
      System.out.println(oddProduct);

      //7 wap to replace all the negative numbers in a list with 0 and find the sum using reduce() method
      List<Integer> numbers = List.of(-1, 2, -3, 4, -5, 6);
      int sumNonNegative = numbers.stream().map(e -> e < 0 ? 0 : e).reduce(0, (acc, e) -> acc + e);
      System.out.println(sumNonNegative);

      //8 wap to concatenate all the strings in a list using reduce() method
      List<String> strings = List.of("Hello", " ", "World", "!");   
      String result = strings.stream().reduce("", (acc, s) -> acc + s);
      System.out.println(result);

      //9 wap to find the longest string in a list using reduce() method
      List<String> stringList = List.of("Java", "Stream", "API", "Programming", "Language");
      String longest = stringList.stream().reduce("", (s1, s2) -> s1.length() > s2.length() ? s1 : s2);
      System.out.println(longest);
    }
}
