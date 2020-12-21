package org.campus02.blackjack;

import java.util.HashMap;
import java.util.Map;

public class Blackjack {

  private HashMap<Player,Integer> players = new HashMap<>();

  public boolean addPlayer(Player player) {

    if(players.containsKey(player)) {
      return false;
    }

    players.put(player,0);
    return true;

    /*
    if(players.containsKey(player) == false) {
      players.put(player,0);
      return true;
    }

    return false;
    */
  }

  public boolean addCard(Player player, Integer cardValue) {

    if(players.containsKey(player)) {
      Integer currentValue = players.get(player);
      players.put(player, currentValue + cardValue);
      return true;
    }

    return false;

  }

  public Integer getValue(Player player) {
    return players.get(player);
  }

  public String toString() {

    if(players.size() == 0) {
      return "Noch keine Spieler registriert";
    }

    String result = "";
    /*for(Player p : players.keySet()) {
      result += p.getName() + ", Kartenwert: " + players.get(p) + "\n";
    }*/
    for(Map.Entry<Player,Integer> entry : players.entrySet()) {
      result += entry.getKey().getName() + ", Kartenwert: " + entry.getValue() + "\n";
    }
    return result;
  }

}
