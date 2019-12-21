package jadaiGalaxy;

public class Engine {

    private String command;
    private ConsoleReader reader;
    private Enemy enemy;
    private Player player;

    public Engine(ConsoleReader reader,Enemy enemy,Player player){
    this.reader = reader;
    this.command = "";
    this.enemy = enemy;
    this.player = player;
    }

    public void run(){

        while (!command.equals("Let the Force be with you")) {
            int[] playerPosition =
                   InputParser.readArray(this.reader.readLine());

            int[] enemyPosition =
                   InputParser.readArray((this.reader.readLine()));

            int enemyRow = enemyPosition[0];
            int enemyCol = enemyPosition[1];

            enemy.destroyStars(enemyRow,enemyCol);


            int playerRow = playerPosition[0];
            int playerCol = playerPosition[1];

            player.collectStars(playerRow,playerCol);

            
        }

    }
}
