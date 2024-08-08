package enums;

public enum Race {
    HUMAN("Humans", 12, 20),
    ELF("Elves", 12, 20),
    DEMON("Demons", 12, 20),
    NECRO("Necromancers", 12, 20),
    GNOME("Gnomes", 12, 20);


    Race(String name, int cardWidth, int cardHeight) {
        this.name = name;
        this.cardWidth = cardWidth;
        this.cardHeight = cardHeight;
    }

    private final String name;
    private final int cardWidth;
    private final int cardHeight;

    public String getName() {
        return name;
    }

    public int getCardWidth() {
        return cardWidth;
    }

    public int getCardHeight() {
        return cardHeight;
    }
}
