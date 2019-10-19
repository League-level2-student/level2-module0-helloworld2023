package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = {"Ava", "Nathan", "Cody", "Domarion", "Lily"};
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "Jaleal";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int n = 0; n < names.length; n++) {
			System.out.println(names[n]);
		}
		//6. make an array of 50 integers
		int[] ages = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int a = 0; a < ages.length; a++) {
			ages[a] = r.nextInt(49);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNumber = ages[0];
		for (int s = 0; s < ages.length; s++) {
			if(ages[s] < smallestNumber) {
				smallestNumber = ages[s];
			}
		}
		System.out.println(smallestNumber);
		//9 print the entire array to see if step 8 was correct
	for (int i = 0; i < ages.length; i++) {
		System.out.println(ages[i]);
	}
		//10. print the largest number in the array.
		int largestNumber = ages[49];
		for (int l = 0; l < ages.length; l++) {
			if(ages[l] > largestNumber) {
				largestNumber = ages[l];
			}
		}
		System.out.println(largestNumber);
	}
}
