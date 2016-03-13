package com.leetcode.qinbing._2_addTwoNumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 16-3-11.
 */
public class TestAddTwoNumbers {

    @Test
    public void test_can_add_two_single_list_node_to_one_listNode() {

        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(9);
        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(listNode1, listNode2);
        assertEquals(8, listNode.val);
        assertEquals(1, listNode.next.val);
    }

    @Test
    public void test_can_add_two_list_with_multi_nodes_to_one_listNode() {
        ListNode listNode11 = new ListNode(2);
        ListNode listNode12 = new ListNode(3);
        ListNode listNode13 = new ListNode(4);
        ListNode listNode21 = new ListNode(4);
        ListNode listNode22 = new ListNode(5);
        ListNode listNode23 = new ListNode(6);

        listNode22.next = listNode23;
        listNode21.next = listNode22;

        listNode12.next = listNode13;
        listNode11.next = listNode12;

        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(listNode11, listNode21);
        assertEquals(6, listNode.val);
        assertEquals(8, listNode.next.val);
        assertEquals(1, listNode.next.next.val);
        assertEquals(0, listNode.next.next.next.val);
    }

    @Test
    public void test_can_add_two_list_with_unequal_nodes_to_one_listNode() {
        
    }
}
