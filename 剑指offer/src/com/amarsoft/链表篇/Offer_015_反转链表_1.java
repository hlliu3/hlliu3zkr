package com.amarsoft.链表篇;

import java.util.ArrayList;

/**
 * @className:
 * @description:
 * @author:
 * @date:2019-09-02 22:25
 */
public class Offer_015_反转链表_1 {
    //todo 需要重新看
    public ListNode ReverseList(ListNode head) {

        if(head==null){
            return null;
        }

        ListNode newHead = null;
        ListNode pNode = head;
        ListNode pPrev = null;
        while(pNode!=null){
            //下一个节点
            ListNode pNext = pNode.next;
            if(pNext==null){
                newHead = pNode;
            }
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        return newHead;
    }
}
