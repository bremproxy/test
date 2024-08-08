import enums.Race;
import model.card.CardBase;
import model.card.NecroCard;
//опечатки остальные правь сам)
public class Cards {
    private final CardBase card = new NecroCard();
    private final int[] deckSizes = new int[30]; //переместить в настройки?)
    void sizecard() {
        int[] size = card.getSize();

        System.out.print("Размер карты - ");
        System.out.println(size[0] + "/" + size[1] + "/" + size[0] + "/" + size[1]); //вряд ли карта будет не ровная Оо
    }

    void arrrace() {
        StringBuilder builder = new StringBuilder();
        builder.append("Рассы карт - ");
        Race[] races = Race.values();
        for (Race race : races) {
            builder.append(race.getName()).append(" ");
        }
        System.out.println(builder.toString());
    }

    void caunt() {
        System.out.print("Карт в колоде - ");
        System.out.println(deckSizes.length);
    }


    class RaсeCards {
        void printSize() {
            String[] race = {"Humans", "Elfs", "Demons", "Necro", "Gnoms"};
            for (int i = 0; i < race.length; i++) {
                System.out.println("Рассы карт - " + race[i]);
            }
        }
    }
}
