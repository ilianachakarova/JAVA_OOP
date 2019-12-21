package jadaiGalaxy;

public class Field {
    private int [][] matrix;

    public Field(int[][] matrix){
        this.matrix = matrix;
        this.setFieldValues();
    }

    private void setFieldValues() {
        int value = 0;
        for (int i = 0; i <this.matrix.length; i++) {
            for (int j = 0; j <this.matrix[i].length ; j++) {
                matrix[i][j] = value++;
            }
        }
    }

    public int getLength() {
        return this.matrix.length;
    }

    public int getDimensionLength(int dimension) {
       return this.matrix[dimension].length;
    }

    public void setCell(int row, int col, int newValue) {
        this.matrix [row][col] = newValue;
    }

    public int getCell(int row, int col) {
        return this.matrix[row][col];
    }
}
