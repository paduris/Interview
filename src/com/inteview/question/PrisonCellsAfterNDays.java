package com.inteview.question;

/**
 * There are 8 prison cells in a row, and each cell is either occupied or vacant.
 * <p>
 * Each day, whether the cell is occupied or vacant changes according to the following rules:
 * <p>
 * If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
 * Otherwise, it becomes vacant.
 * (Note that because the prison is a row, the first and the last cells in the row can't have two adjacent neighbors.)
 * <p>
 * We describe the current state of the prison in the following way: cells[i] == 1 if the i-th cell is occupied, else cells[i] == 0.
 * <p>
 * Given the initial state of the prison, return the state of the prison after N days (and N such changes described above.)
 */
public class PrisonCellsAfterNDays {
    public static void main(String[] args) {

        int size = 7;
        int[] array = {1, 0, 0, 1, 0, 0, 1, 0};

        //printArray(resetPrisonCells(array, size));
        printArray(prisonAfterNDays(array,size));

    }

    private static int[] resetPrisonCells(int[] array, int size) {


        return processArray(array, size);

    }

    private static int[] processArray(int[] cells, int N) {

        int[] processedArray = new int[cells.length];

        if (N == 0) return cells;

        for (int j = 0; j < cells.length; j++) {

            if (j == 0) {
                processedArray[j] = 0;
            } else if (j == cells.length - 1) {
                processedArray[cells.length - 1] = 0;
            } else {
                int left = cells[j - 1];
                int right = cells[j + 1];
                if (left == right) {
                    processedArray[j] = 1;
                } else {
                    processedArray[j] = 0;
                }
            }
        }

        return processArray(processedArray, N - 1);
    }

    private static void printArray(int[] processedArray) {
        StringBuilder builder = new StringBuilder();
        for (int m = 0; m < processedArray.length; m++) {
            builder.append(processedArray[m]);
        }
        System.out.println(builder.toString());
    }


    public static int[] prisonAfterNDays(int[] cells, int N) {
        N = N % 14;
        if (N == 0) N = 14;
        return prisonAfterNDaysT(cells, N);
    }


    public static int[] prisonAfterNDaysT(int[] cells, int N) {
        if (N == 0) return cells;

        int[] res = new int[8];
        for (int i = 0; i < cells.length; i++) {
            if (i == 0 || i == cells.length - 1) {
                if (cells[i] == 1) res[i] = 0;
                continue;
            }
            if (cells[i - 1] == cells[i + 1]) res[i] = 1;
            else res[i] = 0;
        }

        cells = res;
        return prisonAfterNDaysT(cells, N - 1);
    }
}
