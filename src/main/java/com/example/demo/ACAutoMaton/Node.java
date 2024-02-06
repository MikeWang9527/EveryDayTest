package com.example.demo.ACAutoMaton;

/**
 * @author MikeWang
 * @date 2024/2/6 10:47
 */
public class Node {
    Node parent;
    Node[] children;
    Node fail;
    char character;
    boolean isPatternEnd;

    public Node(Node parent,char character) {
        this.parent = parent;
        this.character = character;
        //假设只考虑小写字母
        this.children = new Node[26];
        this.isPatternEnd = false;
    }
}
