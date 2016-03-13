package com.leetcode.qinbing._2_addTwoNumbers;

/**
 * Created by Administrator on 16-3-11.
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] resultArray = calTwoNode(l1.val, l2.val);

        ListNode listNode = new ListNode(resultArray[0]);
        if (resultArray[1] != 0) {
            ListNode listNode2 = new ListNode(1);
            listNode.next = listNode2;
        }
        return listNode;
    }

    public int addTwoNodes(ListNode resultListNode, int increaseDigit, ListNode listNode1, ListNode listNode2) {
        while (listNode1 == null && listNode2 == null) {
            int listNode1Val = 0;
            int listNode2Val = 0;
            if (listNode1 != null) {
                listNode1Val = listNode1.val;
            }
            if (listNode2 != null) {
                listNode2Val = listNode2.val;
            }
            int[] resultArray = calTwoNode(listNode1Val, listNode2Val);
            ListNode currentNode = new ListNode(resultArray[0]);
            if (resultArray[1] != 0) {
                int tempIncreateDigit = addTwoNodes(resultListNode, resultArray[1], listNode1.next, listNode2.next);
            }
        }
        return resultListNode;
    }

    public int[] calTwoNode(int nodeVal1, int nodeVal2) {
        int[] returnArray = new int[2];
        int result = nodeVal1 + nodeVal2;
        if (result < 10) {
            returnArray[0] = result;
            returnArray[1] = 0;
        } else if (result >= 10) {
            returnArray[0] = result % 10;
            returnArray[1] = 1;
        }
        return returnArray;
    }
}
