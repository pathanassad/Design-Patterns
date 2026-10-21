public class GameBotCharacters implements Cloneable<GameBotCharacters> {
        private String name;
        private int health;
        private int attackPower;

        public GameBotCharacters(String name, int health, int attackPower){
            System.out.println("Loading character animations from DB...");
            System.out.println("Loading Sound effects from DB");
            System.out.println("Preparing AI Battle settings File");

            try {
                Thread.sleep(2000);
            } catch(InterruptedException e){
                System.out.println("Error in thread");
            }

            this.name = name;
            this.health = health;
            this.attackPower = attackPower;
        }

        // copy constructor
        private GameBotCharacters(GameBotCharacters gbc){
            this.name = gbc.name;
            this.health = gbc.health;
            this.attackPower = gbc.attackPower;
        }

        @Override
        public GameBotCharacters customizedClone(){
            return new GameBotCharacters(this);
        }

@Override
public String toString() {
    return "GameBotCharacters{" +
            "name='" + name + '\'' +
            ", health=" + health +
            ", attackPower=" + attackPower +
            '}';
}
}
