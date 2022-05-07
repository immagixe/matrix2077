package Matrix2077;

public class Game {

    private final WorldSettlement worldSettlement;

    private final DataPrinter dataPrinter;

    public Game(final WorldSettlement worldSettlement,
                final DataPrinter dataPrinter) {
        this.worldSettlement = worldSettlement;
        this.dataPrinter = dataPrinter;
    }

    public void play() {

        worldSettlement.putItems();
        worldSettlement.putAnimals();

        System.out.println("Welcome to world simulation \"Matrix 2077\"");
        System.out.println("▲ - rock, ᛉ - tree, ✶ - grass");
        System.out.println("ꭥ - hervibore, X - predator");
        dataPrinter.printWorldMap(worldSettlement);
    }
}

