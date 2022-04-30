/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastrutures;

/**
 *
 * @author stephanos
 */
public class Stack {
    private static class Node {
        private int data;
        private Node next;
        private Node(int data) {
            this.data = data;
        }
    }
    
    private Node top;
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public int peak() {
        if (top == null) throw new NullPointerException("Stack is empty");
        return top.data;
    }
    
    public void push(int data) {
        Node node = new Node(data);
        top.next = top;
        top = node;
    }
    
    public int pop() {
        if (top == null) throw new NullPointerException("Stack is empty");
        int data = top.data;
        top = top.next;
        return data;
    }
}
