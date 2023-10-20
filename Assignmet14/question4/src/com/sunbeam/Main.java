package com.sunbeam;

	@FunctionalInterface
	interface Check<T> { // generic interface
	    boolean compare(T x, T y);
	}

	public class Main {
	    public static <T> int countIf(T[] arr, T key, Check<T> c) {
	        int count = 0;
	        for (T item : arr) {
	            if (c.compare(item, key)) {
	                count++;//This method should return count of elements in the array for which given check is satisﬁed.
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        Integer[] arr = {44, 77, 99, 22, 55, 66};
	        Integer key = 50;

	        int cnt = countIf(arr, key, (x, y) -> x > y);
	        System.out.println("Count = " + cnt); // Output: Count = 4
	    }
	}