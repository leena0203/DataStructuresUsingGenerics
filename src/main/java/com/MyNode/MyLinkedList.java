package com.MyNode;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	public void add (INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);

		}
	}
	public void append(INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	public void insert(INode myNode,INode newNode) {
		INode tempNode = myNode.getNext() ;
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	public void printMyNode() {
		StringBuffer print = new StringBuffer(" Node: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			print.append(tempNode.getKey());
			if(! tempNode.equals(tail)) print.append("->");
			tempNode = tempNode.getNext();
		}
		print.append(tempNode.getKey());
		System.out.println(print);
	}
}

