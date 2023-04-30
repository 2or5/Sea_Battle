public enum Ship {
    SINGLE_DECK(1,"\uD83D\uDEE5\uFE0F"), DOUBLE_DECKER(2,"\uD83D\uDEE5\uFE0F\uD83D\uDEE5\uFE0F"),
    TREE_DECK(3,"\uD83D\uDEE5\uFE0F\uD83D\uDEE5\uFE0F\uD83D\uDEE5\uFE0F"),
    FOUR_DECK(4,"\uD83D\uDEE5\uFE0F\uD83D\uDEE5\uFE0F\uD83D\uDEE5\uFE0F\uD83D\uDEE5\uFE0F"),
    EMPTY (-1, "⬜"), OREOL(-1, "\uD83D\uDFE6"),
    RED_CELL(-1,"\uD83D\uDFE5");

    int sizeShip;
    String symbolShip;

    Ship(int sizeShip, String symbolShip) {
        this.sizeShip = sizeShip;
        this.symbolShip = symbolShip;
    }

    public int getSizeShip() {
        return sizeShip;
    }

    public String getSymbolShip() {
        return symbolShip;
    }
}
