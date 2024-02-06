package com.example.demo.ACAutoMaton;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author MikeWang
 * @date 2024/2/6 10:50
 */
public class ACAutomaton {
    private Node root;

    public ACAutomaton() {
        this.root = new Node(null, ' ');
    }
    //构建AC自动机
    public void build(String[] patterns) {
        for (String pattern : patterns) {
            Node cur = root;
            for (char c : pattern.toCharArray()) {
                int index = c - 'a';
                if (cur.children[index] == null) {
                    cur.children[index] = new Node(cur, c);
                }
                cur = cur.children[index];
            }
            cur.isPatternEnd = true;
        }
        //构建失败指针
        Queue<Node> queue = new LinkedList<>();
        for (Node child : root.children) {
            if (child != null) {
                queue.add(child);
                child.fail = root;
            }
        }
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            for (int i = 0; i < 26; i++) {
                Node child = cur.children[i];
                if (child != null) {
                    queue.add(child);
                    Node fail = cur.fail;
                    while (fail != null) {
                        if (fail.children[i] != null) {
                            child.fail = fail.children[i];
                            break;
                        }
                        fail = fail.fail;
                    }
                    if (fail == null) {
                        child.fail = root;
                    }
                }
            }
        }
    }
    //匹配文本
    public void match(String text) {
        Node cur = root;
        for (char c : text.toCharArray()) {
            int index = c - 'a';
            while (cur.children[index] == null && cur != root) {
                cur = cur.fail;
            }
            cur = cur.children[index];
            if (cur == null) {
                cur = root;
            }
            Node temp = cur;
            while (temp != root) {
                if (temp.isPatternEnd) {
                    System.out.println("匹配到了一个模式串"+getPattern(temp));
                }
                temp = temp.fail;
            }
        }
    }

    private String getPattern(Node node) {
        StringBuilder sb = new StringBuilder();
        while (node != root) {
            sb.append(node.character);
            node = node.parent;
        }
        return sb.reverse().toString();
    }



        public static void main(String[] args) {
            ACAutomaton acAutomaton = new ACAutomaton();
            String[] patterns = {"he", "she", "his", "hers"};
            acAutomaton.build(patterns);
            String text = "hers";
            acAutomaton.match(text);
        }

}
