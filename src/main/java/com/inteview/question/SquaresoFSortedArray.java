package com.inteview.question;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SquaresoFSortedArray {

    public static void main(String[] args) {

        int a [] = {-4,-1,0,3,10};




        SquaresoFSortedArray obj =new SquaresoFSortedArray();

        int r[]=obj.sortedSquares(a);

        for (int i = 0; i <r.length ; i++) {
            System.out.println(r[i]);
        }



    }

    public int[] sortedSquares(int[] A) {

        List<Integer> returnVal = new ArrayList();

        for (int i = 0; i < A.length ; i++) {

            returnVal.add(A[i]*A[i]);

        }

        return returnVal.stream().mapToInt( i -> i).sorted().toArray();

    }
}

