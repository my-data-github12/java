package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;

public class TesterBook {
	
	
	public static int menu() {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order using random access.");
		System.out.println("3. Search a book with given isbn");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn.");
		System.out.println("6. Reverse the list (hint - Collections.reverseList())");
		System.out.println("7. Save books");
		System.out.println("8. load book");
		System.out.println("Enter the choice :");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}
	
	
	public static void main(String[] args) {
		int choice;
		List<Book> list = new ArrayList<>();
		Book b;
		ListIterator<Book> itr;

		int index,qty;
		while ((choice = menu())!=0) {
			
			switch (choice) {
			case 1:
				b = new Book();
				b.accept();
				String key = b.getIsbn();
				if(list.contains(b)) {
					index = list.indexOf(b);
					Book b1 = list.get(index);
					b1.setQuantity(b1.getQuantity()+b.getQuantity());
					}
				else {
					list.add(b);
					System.out.println("Successfully added ....");
				}
				break;
			case 2:
				System.out.println("Forward display: ");
				for (int i = 0; i < list.size(); i++) {
					b = list.get(i);
					System.out.println(b);
				}
				break;
			case 3:{
				System.out.println("Enter the isbn which book you have to search :");
				b = new Book();
				String isbn = new Scanner(System.in).next();
				b.setIsbn(isbn);
				index = list.indexOf(b);
				if(index == -1)
					System.out.println("Book is not found :");
				else {
					System.out.println("your book is :");
					b = list.get(index);
					System.out.println(b);
				}
			}
				break;
			case 4:
				System.out.println("Enter the index to delete from list :");
				index = new Scanner(System.in).nextInt();
				if(index>=list.size())
					System.out.println("please Enter valid Index...");
				else
					list.remove(index);
				break;
			case 5:{
				System.out.println("Enter the isbn which book you have to Delete :");
				String isbn = new Scanner(System.in).next();
				b = new Book();
				b.setIsbn(isbn);
				index = list.indexOf(b);
				if(index == -1)
					System.out.println("Book is not found :");
				else {
					list.remove(index);
					System.out.println("Successfully deleted....");
				}
			}
				break;
			case 6:
				System.out.println("Reverse List :");
				Collections.reverse(list);
				System.out.println(list);
				
				
			case 7: try { 
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("books.dat"));
			
			dos.writeInt(list.size()); // Write the number of books in the list 
			for (Book book : list) {
				book.accept(); // Assuming you have a save method in the Book class }
			}
			dos.close();
			System.out.println("Books saved to file successfully."); 
			} catch (IOException e) { 
				
			} 
			
			break;
			
			case 8: try { DataInputStream dis = new DataInputStream(new FileInputStream("books.dat"));
			int bookCount = dis.readInt(); // Read the number of books 
			list.clear(); // Clear the current list
			for (int i = 0; i < bookCount; i++) { 
				Book loadedBook = new Book(); 
				list.add(loadedBook);
				} dis.close(); System.out.println("Books loaded from file successfully."); 
				}
			catch (IOException e) 
			{ 
			
				break;
		}
			}
		}
	}
}
	
		
		
				
			
	

