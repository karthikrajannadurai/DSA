package org.dsa.Tree.ConstructionOfBT;

import java.util.*;

public class L_889_ConstructionOfBinaryTree_Preorder_Postorder {

    public static TreeNode buildTree(Character[] pre, Character[] post, int startPre, int endPre, int startPost, int endPost, HashMap<Object, Integer> preHashMap, HashMap<Object, Integer> postHashMap) {

        TreeNode newNode;

        newNode = new TreeNode(pre[startPre]);

        newNode.left = buildTree(pre, post, startPre + 1, preHashMap.get(post[endPost - 1]) - 1, startPost, postHashMap.get(pre[startPre + 1]), preHashMap, postHashMap);
        newNode.right = buildTree(pre, post, preHashMap.get(post[endPost - 1]), endPre, postHashMap.get(pre[startPre + 1]) + 1, endPost - 1, preHashMap, postHashMap);
        return newNode;
    }

    public static void main(String[] args) {
        Character[] preOrder = new Character[]{'F', 'B', 'A', 'D', 'C', 'E', 'G', 'I', 'H'};
        Character[] postOrder = new Character[]{'A', 'C', 'E', 'D', 'B', 'H', 'I', 'G', 'F'};

//        Character[] preOrder = new Character[]{'G', 'H'};
//        Character[] postOrder = new Character[]{'H', 'G'};
        HashMap<Object, Integer> preHashMap = new HashMap<>();
        HashMap<Object, Integer> postHashMap = new HashMap<>();
        for (int index = 0; index < preOrder.length; index++) {
            preHashMap.put(preOrder[index], index);
            postHashMap.put(postOrder[index], index);
        }
        System.out.println(levelOrder(buildTree(preOrder, postOrder, 0, preOrder.length - 1, 0, postOrder.length - 1, preHashMap, postHashMap)));

    }

    public static List<List<Character>> levelOrder(TreeNode root) {
        List<List<Character>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Character> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add((char) node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (!list.isEmpty()) {
                result.add(list);
            }
        }
        return result;
    }
}