/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/


import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    private int result = 0;
    public int getResult() {
        //implement this
        return result;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long result = 1;
    private final int M = 1000000007;
    public int getResult() {
        //implement this
        return (int) result;
    }

    public void visitNode(TreeNode node) {
        //implement this
        if (node.getColor() == Color.RED){
            result = (result*node.getValue()) % M;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if (leaf.getColor() == Color.RED){
            result = (result* leaf.getValue()) % M;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int nonLeafEvenDeptSum = 0;
    private int greenLeavesSum = 0;
    public int getResult() {
        //implement this

        return Math.abs(nonLeafEvenDeptSum - greenLeavesSum);
    }

    public void visitNode(TreeNode node) {
        //implement this
        if (node.getDepth() % 2 == 0){
            nonLeafEvenDeptSum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if (leaf.getColor() == Color.GREEN){
            greenLeavesSum += leaf.getValue();
        }
    }
}

public class Solution {
    private static int [] values;
    private static Color [] colors;
    private static HashMap<Integer, HashSet<Integer>> map;
    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner scanner = new Scanner(System.in);
        int nNode = scanner.nextInt();
        values = new int[nNode];
        colors = new Color[nNode];
        map = new HashMap<>(nNode);

        for (int i = 0; i < nNode; i++){
            values[i] = scanner.nextInt();
        }
        for (int i = 0; i < nNode; i++){
            colors[i] = scanner.nextInt() == 0 ? Color.RED : Color.GREEN;
        }
        for (int i = 0; i <nNode - 1; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            HashSet<Integer> uNgh = map.get(x);
            if (uNgh == null){
                uNgh = new HashSet<>();
                map.put(x,uNgh);
            }
            uNgh.add(y);
            HashSet<Integer> vNgh = map.get(y);
            if (vNgh == null){
                vNgh = new HashSet<>();
                map.put(y, vNgh);
            }
            vNgh.add(x);
        }
        scanner.close();
        if (nNode == 1){
            return new TreeLeaf(values[0],colors[0],0);
        }
        TreeNode root = new TreeNode(values[0],colors[0],0);
        addChildn(root,1);
        return root;
    }
    private static void addChildn(TreeNode parentTN, Integer parentI){
        for (Integer treeNum : map.get(parentI)){
            map.get(treeNum).remove(parentI);

            HashSet<Integer> gChild = map.get(treeNum);
            boolean childinchild = (gChild != null && !gChild.isEmpty());
            Tree tree;
            if (childinchild){
                tree = new TreeNode(values[treeNum - 1],colors[treeNum - 1],parentTN.getDepth()+1);
            }
            else {
                tree = new TreeLeaf(values[treeNum - 1],colors[treeNum - 1],parentTN.getDepth()+1);
            }
            parentTN.addChild(tree);
            if (tree instanceof TreeNode){
                addChildn((TreeNode) tree, treeNum);
            }
        }
    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}