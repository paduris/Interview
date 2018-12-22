package com.company.upwork;


import java.util.HashMap;
import java.util.Map;

/**
 * Problem :
 *
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.
 *
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
 *
 * Follow up:
 * Could you do both operations in O(1) time complexity?
 *
 * Example:
 *
 * LRUCache cache = new LRUCache( 2 /* capacity */

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

public class LRUCache {

    private int CAPACITY = 2;
    private Map<Integer,Node> _cache = null;
    Node start;
    Node end;

    public static void main (String []a)
    {
        LRUCache cache = new LRUCache(2);
        cache.put(1,1);
        print(cache);
        cache.put(2,2);
        print(cache);
        System.out.println(cache.get(1));
        cache.put(3,3);
        print(cache);
        System.out.println(cache.get(2));
        cache.put(4,4);
        print(cache);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }

    private static void print(LRUCache cache) {
        System.out.println("\n");
        cache._cache.forEach((k,v) ->System.out.println("Key :: " + k +" Value : "+v.value));
    }


    public LRUCache(int CAPACITY){
        this.CAPACITY = CAPACITY;
        this._cache = new HashMap<>();
    }

    public int get(int key)
    {

        if(_cache.containsKey(key))
        {
            Node node = _cache.get(key);
            removeNode(node);
            moveNodeToTop(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value)
    {
        if(!_cache.containsKey(key))
        {
            Node node = new Node(key,value);
            // for new insertion left is always null and right points current start node.
            node.left = null;
            node.right=start;

            if(_cache.size()>=CAPACITY)
            {
                // when cache reached maximum size, remove from cache
                _cache.remove(end.key);
                removeNode(end);
                moveNodeToTop(node);

            }else{
                //now move the inserted node to top of the linked list
                this.moveNodeToTop(node);
            }
            _cache.put(key,node);
        }
        else{
            Node node = _cache.get(key);
            this.removeNode(node); // every time node is removed and moved to the top
            this.moveNodeToTop(node);
        }

    }

    //update node pointers
    private void removeNode(Node node) {

        if(node.left != null)
        {
            node.left.right = node.right;
        }else{
            start =node.right;
        }
        if(node.right != null)
        {
            node.right.left = node.left;
        }else{
            end = node.left;
        }
    }

    private void moveNodeToTop(Node node) {

        //current start
        if(start != null)  {
            start.left = node;
        }
        //now point start to current node
        start = node;
        if(end == null)
        {
            end = start;
        }
    }
}

class Node
{
    int key;
    int value;

    Node right;
    Node left;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
