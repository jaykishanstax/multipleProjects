package com.java.application.LC;

import com.java.application.LC.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LargestValueInTree {

    public static void main(String[] args) {

        TreeNode data1 = new TreeNode(1);
        TreeNode data2 = new TreeNode(3);
        TreeNode data3 = new TreeNode(2);
        TreeNode data4 = new TreeNode(5);
        TreeNode data5 = new TreeNode(3);
        TreeNode data6 = new TreeNode(8);
        TreeNode data7 = new TreeNode(9);

        data1.left = data2;
        data1.right = data3;
        data2.left = data4;
        data2.right = data5;
        data3.left = data6;
        data3.right = data7;

        List<Integer> result = largestValue(data1);
        System.out.println("Result : " + result.toString());

    }

    /*
    find largest value in each tree row
       Input:
            1
           / \
          3     2
         / \   / \
        5   3 8   9

        op:  [1, 3,9]
     */

    /*
    Algo:
    use recursion - dfs
    create seprate method which have parameter as
        - root node
        - List of largets value int(this will store based on possition as row)
        - level (row)

    in method
        check if root is null -- return
        check if level == list.size  >> if same then add root.value to list
        if not, list.set(level, math.max(list.get(level), root.val))

        //then use recursive call
        method(root.left, largest_Val, level +1)
        method(root.right, largest_Val, level + 1)
     */
    public static List<Integer> largestValue(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        helpValue(root, res, 0);
        return res;
    }

    private static void helpValue(TreeNode root, List<Integer> res, int level) {

        if (root == null) return ;

        if(res.size() == level){
            res.add(root.val);
        } else {
            res.set(level, Math.max(res.get(level), root.val));
        }

        helpValue(root.left, res, level + 1);
        helpValue(root.right, res, level + 1);

    }
}

