package org.stringmethods;

public class Practice {
	public static void main(String[] args) {
		String s = "Andrew Vimal";
		String s1 = "Andrew vimal";
		String s2 = "My name is Andrew Vimal";
		// To find length
		int length = s.length();
		System.out.println(length);

		// To check whether the string is empty or not
		boolean empty = s.isEmpty();
		System.out.println(empty);

		// To get particular character
		char charAt = s.charAt(5);
		System.out.println(charAt);

		// To find index Position
		int indexOf = s.indexOf("w");
		System.out.println(indexOf);

		// To find the last index position
		int lastIndexOf = s.lastIndexOf("i");
		System.out.println(lastIndexOf);

		// To change Upper case
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);

		// To change lower case
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);

		// To check whether the string start with
		boolean startsWith = s.startsWith("A");
		System.out.println(startsWith);

		// To check [String end with]
		boolean endsWith = s.endsWith("l");
		System.out.println(endsWith);

		// To check the word is present
		boolean contains = s.contains("al");
		System.out.println(contains);

		// To replace character or String
		String replace = s.replace("V", "v");
		System.out.println(replace);

		// To Split the strings we have to use this method and forloop to get the result
		String[] split = s.split(" ");

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		// To change the Strings into character array we have to use this method and
		// forloop

		char charArray[] = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);

		}
		// To Change the entire String we have to use replace all

		String replaceAll = s.replaceAll("Andrew", "Vimal");
		System.out.println(replaceAll);

		// To remove unwanted Space

		String trim = s.trim();
		System.out.println(trim);

		// To Check whether the strings or equal or not
		boolean equals = s.equals(s1);
		System.out.println(equals);

		// To check whether the strings are equal without the case
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);

		// To find particular words Starts with index
		String substring = s2.substring(3);
		System.out.println(substring);

		// To find particular sentance start with string
		String substring2 = s2.substring(3, 17);
		System.out.println(substring2);

		// To connect two Strings
		String concat = s.concat(" " + s2);
		System.out.println(" " + concat);

		// To compare two strings
		int compareTo = s.compareTo(s1);
		System.out.println(compareTo);

		// To compare two strings ignore case
		int compareToIgnoreCase = s.compareToIgnoreCase(s1);
		System.out.println(compareToIgnoreCase);

		//
		String replaceFirst = s.replaceFirst("Andrew", "andrew");
		System.out.println(replaceFirst);
	}
}
