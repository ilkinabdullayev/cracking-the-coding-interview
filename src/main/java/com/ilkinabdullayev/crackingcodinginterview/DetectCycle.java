/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilkinabdullayev.crackingcodinginterview;

import com.ilkinabdullayev.util.Node;

/**
 *
 * @author ilkinabdullayev
 */
public class DetectCycle {

    /*
    *Floyd's cycle algorithm
    */
    public boolean hasCycle(Node head) {
        Node slowN = head;
        Node fastN = head;
        
        while(slowN != null && fastN != null && fastN.next != null){
            slowN = slowN.next;
            fastN = fastN.next.next;
            
            if(slowN == fastN){
                return true;
            }
        }

        
        return false;
    }
}
