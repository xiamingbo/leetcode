package com.leetcode.qinbing._2_addTwoNumbers;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 16-3-11.
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode returnListNode;
        List<Integer> linkedList1 = new LinkedList<Integer>();
        linkedList1 = listNode2LinkedList(l1, linkedList1);
        int number1 = linkedList2Number(linkedList1);

        List<Integer> linkedList2 = new LinkedList<Integer>();
        linkedList2 = listNode2LinkedList(l2, linkedList2);
        int number2 = linkedList2Number(linkedList2);

        int returnNumber = number1 + number2;

        List<Integer> returnList = number2LinkedList(returnNumber);
        returnListNode = linkedList2ListNode(returnList);

        return returnListNode;
    }

    public List<Integer> listNode2LinkedList(ListNode listNode, List<Integer> returnList) {
        returnList.add(listNode.val);
        if (listNode.next != null) {
            listNode2LinkedList(listNode.next, returnList);
        }
        return returnList;
    }

    public int linkedList2Number(List<Integer> linkedList) {
        int length = linkedList.size();
        int number = 0;
        for (int i = 0; i < length; i++) {
            number += linkedList.get(i) * Math.pow(10, i);
        }
        return number;
    }


    public ListNode linkedList2ListNode(List<Integer> linkedList) {

        ListNode listNode = new ListNode(linkedList.get(0));

        if (linkedList.size() > 1) {
            for (int i = 1; i < linkedList.size() - 1; i++) {
                ListNode listNode1 = new ListNode(linkedList.get(i));
                ListNode listNode2 = new ListNode(linkedList.get(i + 1));
                listNode1.next = listNode2;
                if (i == 1) {
                    listNode.next = listNode1;
                }
            }
        }
        return listNode;
    }

    public List<Integer> number2LinkedList(int number) {
        String numberString = String.valueOf(number);
        List<Integer> linkedList = new LinkedList<Integer>();
        char[] charArray = numberString.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            int num = Integer.parseInt(String.valueOf(charArray[i]));
            linkedList.add(num);
        }
        return linkedList;
    }
}
