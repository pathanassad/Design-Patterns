public class Main {
    public static void main(String[] args){

        long startTime = System.currentTimeMillis();
        GameBotCharacters gbc1 = new GameBotCharacters("Bot1", 100, 0);
        GameBotCharacters gbc2 = gbc1.customizedClone();
        GameBotCharacters gbc3 = gbc1.customizedClone();
        GameBotCharacters gbc4 = gbc1.customizedClone();

        long endTime = System.currentTimeMillis();
        System.out.println("Total Time Taken " + (endTime - startTime));


    }
}
