package model.card;

public abstract class CardBase implements ICard {
    @Override
    public abstract String getRace();

    @Override
    public abstract int[] getSize();
}
