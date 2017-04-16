package playground.codeWars;

import java.util.Scanner;

public class LinearE {
    class Cell {
        int row;
        int col;
    }

    private char[][] data;
    private int rows;
    private int cols;
    private StringBuffer result = new StringBuffer();

    public static void main(String[] args) {
        LinearE linearE = new LinearE();
        linearE.init();
        linearE.solve();
        System.out.println(linearE.getResult());
    }

    public void init() {
        Scanner scanner = new Scanner(System.in);
        rows = scanner.nextInt();
        cols = scanner.nextInt();
        scanner.nextLine();
        data = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < line.length(); j++) {
                data[i][j] = line.charAt(j);
            }
        }
    }

    public void solve() {
        Cell cell = getStart();
        do {
            int i = cell.row;
            int j = cell.col;
            result.append(data[i][j]);
        } while ((cell = findNextCell(cell)) != null);
    }

    public String getResult() {
        return result.toString();
    }

    private Cell getStart() {
        Cell cell = new Cell();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (findOpenEdges(i, j) >= 2) {
                    cell.row = i;
                    cell.col = j;
                    return cell;
                }
            }
        }
        return null;
    }

    private int findOpenEdges(int i, int j) {
        int count = 0;
        char space = ' ';
        if (data[i][j] == space)
            return count;
        if (j-1 >= 0 && data[i][j-1] == space) {
            count += 1;
        }
        if (j+1 < cols && data[i][j+1] == space) {
            count += 1;
        }
        if (i-1 >= 0 && data[i-1][j] == space) {
            count += 1;
        }
        if (i+1 < rows && data[i+1][j] == space) {
            count += 1;
        }
        return count;
    }

    private Cell findNextCell(Cell cell) {
        int i = cell.row;
        int j = cell.col;
        Cell nextCell = new Cell();
        if (goUp(cell)) {
            data[i][j] = ' ';
            nextCell.row = i-1;
            nextCell.col = j;
            return nextCell;
        }
        else if (goRight(cell)) {
            data[i][j] = ' ';
            nextCell.row = i;
            nextCell.col = j+1;
            return nextCell;
        }
        else if (goDown(cell)) {
            data[i][j] = ' ';
            nextCell.row = i+1;
            nextCell.col = j;
            return nextCell;
        }
        else if (goLeft(cell)) {
            data[i][j] = ' ';
            nextCell.row = i;
            nextCell.col = j-1;
            return nextCell;
        }
        else {
            return null;
        }
    }

    private boolean goRight(Cell cell) {
        return true;

    }

    private boolean goUp(Cell cell) {
        return true;

    }

    private boolean goLeft(Cell cell) {
        return true;


    }

    private boolean goDown(Cell cell) {
        return true;


    }

}
