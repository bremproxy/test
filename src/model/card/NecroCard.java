package model.card;

import enums.Race;

public class NecroCard extends CardBase {
    private final static Race race = Race.NECRO;

    @Override
    public String getRace() {
        return race.getName();
    }

    @Override
    public int[] getSize() {
        return new int[]{race.getCardHeight(), race.getCardWidth()};
    }
}
