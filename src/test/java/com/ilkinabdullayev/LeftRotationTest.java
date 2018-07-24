/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilkinabdullayev;

import com.ilkinabdullayev.crackingcodinginterview.LeftRotation;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ilkinabdullayev
 */
public class LeftRotationTest {
    
    private LeftRotation leftRotation;
    
    @Before
    public void setup(){
        leftRotation = new LeftRotation();
    }
    
    @Test
    public void testArrayRotationNumber2Size7(){
        int[] givenArray = {1,2,3,4,5,6,7};
        int rotationNumber = 2;
        
        int[] rotatedArray = leftRotation.rotLeft(givenArray, rotationNumber);
        List<Integer> rotatedList = IntStream.of(rotatedArray).boxed().collect(Collectors.toList());
        
        assertThat(rotatedList,contains(3, 4, 5, 6, 7, 1, 2));
    }
    
    
    @Test
    public void testArrayRotationNumber10Size20(){
        int[] givenArray = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10 ,86 ,51};
        int rotationNumber = 10;
        
        int[] rotatedArray = leftRotation.rotLeft(givenArray, rotationNumber);
        List<Integer> rotatedList = IntStream.of(rotatedArray).boxed().collect(Collectors.toList());
        
        assertThat(rotatedList,contains(77,97,58,1,86,58,26,10,86,51,41,73,89,7,10,1,59,58,84,77));
    }
    
    
    @Test
    public void testArrayRotationNumber13Size15(){
        int[] givenArray = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
        int rotationNumber = 13;
        
        int[] rotatedArray = leftRotation.rotLeft(givenArray, rotationNumber);
        List<Integer> rotatedList = IntStream.of(rotatedArray).boxed().collect(Collectors.toList());
        
        assertThat(rotatedList,contains(87,97,33,47,70,37,8,53,13,93,71,72,51,100,60));
    }
    
    @Test
    public void testArrayRotationByOneNumber2Size7(){
        int[] givenArray = {1,2,3,4,5,6,7};
        int rotationNumber = 2;
        
        int[] rotatedArray = leftRotation.rotLeftByOne(givenArray, rotationNumber);
        List<Integer> rotatedList = IntStream.of(rotatedArray).boxed().collect(Collectors.toList());
        
        assertThat(rotatedList,contains(3, 4, 5, 6, 7, 1, 2));
    }
    
    
    @Test
    public void testArrayRotationByOneNumber10Size20(){
        int[] givenArray = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10 ,86 ,51};
        int rotationNumber = 10;
        
        int[] rotatedArray = leftRotation.rotLeftByOne(givenArray, rotationNumber);
        List<Integer> rotatedList = IntStream.of(rotatedArray).boxed().collect(Collectors.toList());
        
        assertThat(rotatedList,contains(77,97,58,1,86,58,26,10,86,51,41,73,89,7,10,1,59,58,84,77));
    }
    
    
    @Test
    public void testArrayRotationByOneNumber13Size15(){
        int[] givenArray = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
        int rotationNumber = 13;
        
        int[] rotatedArray = leftRotation.rotLeftByOne(givenArray, rotationNumber);
        List<Integer> rotatedList = IntStream.of(rotatedArray).boxed().collect(Collectors.toList());
        
        assertThat(rotatedList,contains(87,97,33,47,70,37,8,53,13,93,71,72,51,100,60));
    }
    
    
   @Test
    public void testArrayRotationMethod2Number2Size7(){
        int[] givenArray = {1,2,3,4,5,6,7};
        int rotationNumber = 2;
        
        int[] rotatedArray = leftRotation.rotLeftMethod2(givenArray, rotationNumber);
        List<Integer> rotatedList = IntStream.of(rotatedArray).boxed().collect(Collectors.toList());
        
        assertThat(rotatedList,contains(3, 4, 5, 6, 7, 1, 2));
    }
    
    
    @Test
    public void testArrayRotationMethod2Number10Size20(){
        int[] givenArray = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10 ,86 ,51};
        int rotationNumber = 10;
        
        int[] rotatedArray = leftRotation.rotLeftMethod2(givenArray, rotationNumber);
        List<Integer> rotatedList = IntStream.of(rotatedArray).boxed().collect(Collectors.toList());
        
        assertThat(rotatedList,contains(77,97,58,1,86,58,26,10,86,51,41,73,89,7,10,1,59,58,84,77));
    }
    
    
    @Test
    public void testArrayRotationMethod2Number13Size15(){
        int[] givenArray = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
        int rotationNumber = 13;
        
        int[] rotatedArray = leftRotation.rotLeftMethod2(givenArray, rotationNumber);
        List<Integer> rotatedList = IntStream.of(rotatedArray).boxed().collect(Collectors.toList());
        
        assertThat(rotatedList,contains(87,97,33,47,70,37,8,53,13,93,71,72,51,100,60));
    }
    
    
}
