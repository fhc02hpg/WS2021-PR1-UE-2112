package org.campus02.blackjack;

public class Demo {

  public static void main(String[] args) {

    Player p1 = new Player("Max Mustermann",33);
    Player p2 = new Player("Silvia Musterfrau",27);
    Player p3 = new Player("Ano Nym",55);

    Blackjack blackjack = new Blackjack();

    System.out.println(blackjack.toString());

    System.out.println(p1 + " -> " + blackjack.getValue(p1));
    System.out.println("register p1 -> " + blackjack.addPlayer(p1));
    System.out.println(p1 + " -> " + blackjack.getValue(p1));
    System.out.println("register p1 again -> " + blackjack.addPlayer(p1));

    blackjack.addPlayer(p2);

    System.out.println(blackjack);

    blackjack.addCard(p2,24);
    blackjack.addCard(p2,12);
    blackjack.addCard(p1,7);

    System.out.println(blackjack);

    System.out.println("adding value 100 for p3 -> " +blackjack.addCard(p3,100));

    System.out.println(blackjack);

  }

}
