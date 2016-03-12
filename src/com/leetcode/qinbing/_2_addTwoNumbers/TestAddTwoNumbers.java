package com.leetcode.qinbing._2_addTwoNumbers;

import org.junit.Test;

/**
 * Created by Administrator on 16-3-11.
 */
public class TestAddTwoNumbers {
    @Test
    public void test_can_add_two_listNodes() {
        ListNode listNode1 = new ListNode(9);

        ListNode listNode20 = new ListNode(1);
        ListNode listnode21 = new ListNode(9);
        ListNode listnode22 = new ListNode(9);
        ListNode listnode23 = new ListNode(9);
        ListNode listnode24 = new ListNode(9);
        ListNode listnode25 = new ListNode(9);
        ListNode listnode26 = new ListNode(9);
        ListNode listnode27 = new ListNode(9);
        ListNode listnode28 = new ListNode(9);
        ListNode listnode29 = new ListNode(9);
        listnode28.next = listnode29;
        listnode27.next = listnode28;
        listnode26.next = listnode27;
        listnode25.next = listnode26;
        listnode24.next = listnode25;
        listnode23.next = listnode24;
        listnode22.next = listnode23;
        listnode21.next = listnode22;
        listNode20.next = listnode21;

        Solution solution = new Solution();
        solution.addTwoNumbers(listNode1, listNode20);


    }
}
