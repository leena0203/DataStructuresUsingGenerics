package com.MyNode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyLinkedListTest {

	@Test
	void given3NumbersWhenAddedToLinkesListShouldBeAddedToTop() {
		MyNode<Integer> firstElement = new MyNode<>(70);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(56);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.add(secondElement);
		test.add(thirdElement);
		test.printMyNode();
		boolean result = test.head.equals(thirdElement) &&
				test.head.getNext().equals(secondElement) &&
				test.tail.equals(firstElement);				
		assertEquals(true, result);
	}
	
	@Test
	void given3NumbersWhenAddedToLinkesListShouldBeAddedToEndd() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(secondElement);
		test.append(thirdElement);
		//test.printMyNode();
		boolean result = test.head.equals(firstElement) &&
				test.head.getNext().equals(secondElement) &&
				test.tail.equals(thirdElement);				
		assertEquals(true, result);
	}		
		@Test
		void given3NumbersInsertBetweenTwoNumbers() {
			MyNode<Integer> firstElement = new MyNode<>(56);
			MyNode<Integer> secondElement = new MyNode<>(30);
			MyNode<Integer> thirdElement = new MyNode<>(70);
			MyLinkedList test = new MyLinkedList();
			test.add(firstElement);
			test.append(thirdElement);
			test.insert(firstElement, secondElement);
			//test.printMyNode();
			boolean result = test.head.equals(firstElement) &&
					test.head.getNext().equals(secondElement) &&
					test.tail.equals(thirdElement);				
			assertEquals(true, result);
	}

}
