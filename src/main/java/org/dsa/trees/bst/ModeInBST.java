package org.dsa.trees.bst;

import java.util.*;

public class ModeInBST {

    class Element {
        int data;
        int freq;

        public Element(int data, int freq) {
            this.data = data;
            this.freq = freq;
        }
    }

    Map<Integer, Integer> map = new HashMap<>();
    PriorityQueue<Element> pq = new PriorityQueue<>((a, b) -> b.freq - a.freq);

    public int[] findMode(Node root) {
        traverse(root);

        // Add elements to the priority queue based on frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(new Element(entry.getKey(), entry.getValue()));
        }

        List<Integer> list = new ArrayList<>();
        if (pq.isEmpty()) return new int[0];

        Element max = pq.poll();
        int maxFreq = max.freq;
        list.add(max.data);

        // Find other elements with the same highest frequency
        while (!pq.isEmpty()) {
            Element current = pq.poll();
            if (current.freq == maxFreq)
                list.add(current.data);
            else
                break;
        }

        // Convert list to array
        return list.stream().mapToInt(i -> i).toArray();
    }

    private void traverse(Node root) {
        if (root == null) {
            return;
        }

        traverse(root.left);
        map.put(root.data, map.getOrDefault(root.data, 0) + 1);
        traverse(root.right);
    }

    public static void main(String[] args) {
        // Creating a BST
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.right.left = new Node(8);
        root.right.right = new Node(10);

        System.out.println("BST Structure:");
        System.out.println("       5");
        System.out.println("      / \\");
        System.out.println("     2   8");
        System.out.println("    /   / \\");
        System.out.println("   2   8   10");

        ModeInBST modeFinder = new ModeInBST();
        int[] modes = modeFinder.findMode(root);

        System.out.println("Mode(s) in BST: " + Arrays.toString(modes));
    }
}
