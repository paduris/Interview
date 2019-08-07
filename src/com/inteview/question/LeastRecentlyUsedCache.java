package com.inteview.question;


import java.util.HashMap;

/**
 * Problem :
 * <p>
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.
 * <p>
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
 * <p>
 * Follow up:
 * Could you do both operations in O(1) time complexity?
 * <p>
 * Example:
 * <p>
 * LRUCache cache = new LRUCache( 2 /* capacity
 */

/*
        *cache.put(1,1);
        *cache.put(2,2);
        *cache.get(1);       // returns 1
        *cache.put(3,3);    // evicts key 2
        *cache.get(2);       // returns -1 (not found)
        *cache.put(4,4);    // evicts key 1
        *cache.get(1);       // returns -1 (not found)
        *cache.get(3);       // returns 3
        *cache.get(4);       // returns 4


        Solution: Use data structures hash map and double linked list  ,
        because of runtime O(1) for insertion and deletion and put and get

 */

public class LeastRecentlyUsedCache {

    private static int CAPACITY = 2;
    private int capacity;
    private HashMap<Integer, Node> cache;
    private Node start;
    private Node end;


    public LeastRecentlyUsedCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();

        start = new Node(0, 0);
        end = new Node(0, 0);

        start.left = null;
        start.right = end;
        end.left = start;
        end.right = null;
    }

    public static void main(String[] args) {

        LeastRecentlyUsedCache lru = new LeastRecentlyUsedCache(CAPACITY);
        lru.put(1, 1);
    }

    private int get(int key) {
        int val = 0;

        Node node = cache.get(key);

        if (node == null) {
            return -1;
        } else {
            // adjust positions
        }
        return node.value;
    }

    private void put(int key, int value) {

        if (!cache.containsKey(key)) {
            // add to cache
            if (cache.size() == CAPACITY) {
                removeNode(end);
            }

            Node node = new Node(key, value);
            cache.put(key, node);
            moveNodeToTop(node);
        } else {

            Node node = cache.get(key);
            moveNodeToTop(node);
            // adjust positions
        }

    }

    private void moveNodeToTop(Node node) {
        start.right = node.right;
        start.right.left = node;
        node.left = start;
        start.right = node;
    }

    private void removeNode(Node end) {

        cache.remove(end);
    }

    class Node {
        Node left;
        Node right;
        private int key;
        private int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

