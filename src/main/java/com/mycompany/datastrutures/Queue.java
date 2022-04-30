/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastrutures;

/**
 *
 * @author stephanos
 */
public class Queue {
    private static class Node {
        private int data;
        private Node next;
        private Node(int data) {
            this.data = data;
        }
    }
    
    private Node head;
    private Node tail;
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public int peak() {
        if (head == null) throw new NullPointerException("Queue is empty");
        return head.data;
    }
    
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) head = newNode;
        else {
           if (tail != null) tail.next = newNode;
           tail = newNode; 
        }
    }
    
    public int remove() {
        int data = head.data;
        head = head.next;
        return data;
    }
}
