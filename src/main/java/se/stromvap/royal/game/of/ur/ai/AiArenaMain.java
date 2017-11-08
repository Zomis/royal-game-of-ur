package se.stromvap.royal.game.of.ur.ai;

import se.stromvap.royal.game.of.ur.ai.ais.RandomAi;
import se.stromvap.royal.game.of.ur.ai.ais.SimpleAi;
import se.stromvap.royal.game.of.ur.ai.ais.ur.RoyalGameOfUrAIs;

import static se.stromvap.royal.game.of.ur.ai.ais.ur.RoyalGameOfUrAIs.*;

public class AiArenaMain {

    public static void main(String[] args) {
        RoyalGameOfUrAIs.URScorer zomis =
                new RoyalGameOfUrAIs.URScorer("KnockoutFlower", RoyalGameOfUrAIs.scf()
                        .withScorer(knockout, 5)
                        .withScorer(gotoFlower, 2)
                        .withScorer(riskOfBeingTaken, -0.1)
                        .withScorer(exit)
                )
        ;

        Battle battle = new Battle(1000, new SimpleAi(), zomis);
        AiArena.battle(battle);
    }
}
