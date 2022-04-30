/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastrutures;

/**
 *
 * @author stephanos
 */
public class BinarySearchTree {
    private static class Node {
        Node left, right;
        int data;
        public Node(int data) {
            this.data = data;
        }
        
        public void insert (int data) {
            if (data > this.data) {
                if (right == null) right = new Node(data);
                else {
                    right.insert(data);
                }
            } else {
                if (left == null) left = new Node(data);
                else {
                    left.insert(data);
                }
            }
        }
        
        public boolean contains (int data) {
            if (data == this.data) return true;
            else {
                if (data > this.data) {
                    if (right != null) return right.contains(data);
                } else {
                    if (left != null) return left.contains(data);
                }
            }
            
            return false;
        }
        
        public void printInOrder() {
            if (left != null) {
                left.printInOrder();
            }
            System.out.println(data);
            if (right != null) {
                right.printInOrder();
            }
        }
    } 
    
    private Node head;
    
    public void add (int data) {
        if (head == null) head = new Node(data);
        else {
            head.insert(data);
        }
    }
    
    public boolean contains(int data) {
        if (head != null) return head.contains(data);
        return false;
    }
    
    public void printInOrder() {
        if (head != null) head.printInOrder();
        else System.out.println("Tree is empty");
    }
}
