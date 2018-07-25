/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilkinabdullayev;

import com.ilkinabdullayev.crackingcodinginterview.DetectCycle;
import com.ilkinabdullayev.util.Node;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ilkinabdullayev
 */
public class DetectCycleTest {

    private DetectCycle detectCycle;
    private Node head = new Node(1, null);

    @Before
    public void setup() {
        detectCycle = new DetectCycle();
        
        Node second = new Node(2, null);
        Node third = new Node(3, null);
        Node fourth = new Node(4, null);
        Node fifth = new Node(5, null);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        
        fifth.next = third;
    }

    @Test
    public void givenLinkedList_whenNoDetectCycle_thenCorrect() {
        head.next.next.next.next.next = null;
        
        boolean result = detectCycle.hasCycle(head);
        assertFalse(result);
    }
    
    @Test
    public void givenLinkedList_whenDetectCycle_thenCorrect() {
        boolean result = detectCycle.hasCycle(head);
        assertTrue(result);
    }
}
