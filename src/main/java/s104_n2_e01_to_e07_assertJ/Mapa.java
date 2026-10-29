package s104_n2_e01_to_e07_assertJ;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    private HashMap<String,Integer> map;

    public Mapa() {
        this.map = new HashMap<>(Map.of(
                "Player1", 100,
                "Player2", 150,
                "Player3", 200
        ));
    }

    // Expose standard mutation methods
    public void addScore(String player, Integer score) {
        this.map.put(player, score);
    }

    public void removePlayer(String player) {
        this.map.remove(player);
    }

    public HashMap<String, Integer> getMap() {
        return new HashMap<>(this.map);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
