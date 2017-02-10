import java.util.*;
public class CR396A {
	public static void  main(String[] args) {
		Scanner key = new Scanner(System.in);
		String a = key.next();
		String b = key.next();
		int result;
		if(a.length()!=b.length())
			result =  (a.length()>b.length())?  a.length():b.length();
		else
			if(a.equals(b))
				result = -1;
			else
				result = a.length();
		System.out.println(result);
		key.close();
	}
}
/*
SOLVED
A. Mahmoud and Longest Uncommon Subsequence
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
While Mahmoud and Ehab were practicing for IOI, they found a problem which name was Longest common subsequence. They solved it, and then Ehab challenged Mahmoud with another problem.

Given two strings a and b, find the length of their longest uncommon subsequence, which is the longest string that is a subsequence of one of them and not a subsequence of the other.

A subsequence of some string is a sequence of characters that appears in the same order in the string, The appearances don't have to be consecutive, for example, strings "ac", "bc", "abc" and "a" are subsequences of string "abc" while strings "abbc" and "acb" are not. The empty string is a subsequence of any string. Any string is a subsequence of itself.

Input
The first line contains string a, and the second line — string b. Both of these strings are non-empty and consist of lowercase letters of English alphabet. The length of each string is not bigger than 105 characters.

Output
If there's no uncommon subsequence, print "-1". Otherwise print the length of the longest uncommon subsequence of a and b.
*/