import java.util.Set;
import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> songList = new HashMap<String, String>();
        songList.put("Cya Later", "Bye Bye Bye");
        songList.put("Coding Dojo", "Coding dojo coming straight from the underground");
        songList.put("Your Backend", "Your backend so defined, looking like a SQL database");
        songList.put("Your Frontend", "Display Flex for me please, baby");

        System.out.println(songList.get("Your Backend"));

        Set<String> keys = songList.keySet();
        for(String key : keys) {
            System.out.print(key);
            System.out.print(": ");
            System.out.println(songList.get(key));
        }
    }
}