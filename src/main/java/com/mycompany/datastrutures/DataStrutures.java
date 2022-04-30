/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.datastrutures;

/**
 *
 * @author stephanos
 */
public class DataStrutures {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(8);
        
        System.out.println(tree.contains(8));
        System.out.println(tree.contains(9));
        
        tree.printInOrder();
        
        tree.add(11);
        tree.printInOrder();
    }
}
