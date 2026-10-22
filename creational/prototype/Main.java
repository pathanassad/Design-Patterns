import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        long startTime = System.currentTimeMillis();
        GameBotCharacters gbc1 = new GameBotCharacters("Bot1", 100, 0, new ArrayList<>(Arrays.asList("Assault Rifle")));
        GameBotCharacters gbc2 = gbc1.customizedClone();
        gbc2.setName("Bot2");
        GameBotCharacters gbc3 = gbc1.customizedClone();
        GameBotCharacters gbc4 = gbc1.customizedClone();
        List<String> weapons  = gbc1.getWeapons();
        weapons.add("Short Machine Gun");

        long endTime = System.currentTimeMillis();
        System.out.println("Total Time Taken " + (endTime - startTime));
        System.out.println(gbc1);
        System.out.println(gbc2);

    }
}
