package com.java.application.LC;

import com.java.application.LC.common.ListNode;

public class SwapNode {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Result " + swapNode(head));
    }

    public static ListNode swapNode(ListNode head){

        ListNode tmp = new ListNode(0);


        tmp.next = head;
        ListNode currentNode = tmp;


        while(currentNode.next != null && currentNode.next.next != null){
            ListNode firstNode = currentNode.next;
            ListNode secNode = currentNode.next.next;

            firstNode.next = secNode.next;
            currentNode.next = secNode;

            currentNode.next.next= firstNode;
            currentNode  = currentNode.next.next;
        }



        if(head == null) return null;

        if(head.next == null) return head;

        ListNode temp=  head;
        head = head.next;
        temp.next = temp.next.next;
        head.next = temp;
        return swapNode(head.next.next);
    }
}
