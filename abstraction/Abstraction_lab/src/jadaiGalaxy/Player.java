package jadaiGalaxy;

public class Player {

    private Galaxy galaxy;
    private long sum;

    public Player(Galaxy galaxy){
        this.galaxy = galaxy;
        this.sum = 0;
    }

    public void collectStars(int row, int col){
        while (row >= 0 && col < this.galaxy.getInnerLength(1)) {
            if (row < this.galaxy.getLength() && col >= 0 && col < this.galaxy.getInnerLength(0)) {
                this.sum +=this.galaxy.getStar(row,col);
            }

            col++;
            row--;
        }
    }


    public long getSum() {
        return this.sum;
    }
}
