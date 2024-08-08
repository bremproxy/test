import interfaces.DefaultCards;

public class Cards {
    void sizecard() {
        CardSize cardSize = new CardSize();
        cardSize.printSize();
    }
    void arrrace(){
        RaсeCards racecard = new RaсeCards();
        racecard.printSize();
    }
    void caunt(){
        CauntCards cauntcards = new CauntCards();
        cauntcards.countCard();
    }

    class CardSize {
        int top = 12;
        int bottom = 12;
        int left = 20;
        int right = 20;

        void printSize() {
            System.out.print("Размер карты - ");
            System.out.println(top + "/" + left + "/" + bottom + "/" + right);
        }
    }
    class RaсeCards {
        void printSize() {
            String[] race = {"Humans", "Elfs", "Demons", "Necro", "Gnoms"};
            for (int i = 0; i < race.length; i++) {
                System.out.println("Рассы карт - " + race[i]);
            }
        }
    }
    class CauntCards extends DefaultCards {
        public void countCard() {
            int[] deckSizes = new int[30];
            System.out.print("Карт в колоде - ");
            System.out.println(deckSizes.length);
        }
    }

}
