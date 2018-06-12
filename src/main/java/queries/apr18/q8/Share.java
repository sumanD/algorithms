package queries.apr18.q8;

/**
 * Represent a Single share Entity
 */
public class Share {
    String buyOrSell;
    Integer quantity;
    String tickerSymbol;

    // Constructor
    public Share(String buyOrSell, Integer quantity, String tickerSymbol) {
        this.buyOrSell = buyOrSell;
        this.quantity = quantity;
        this.tickerSymbol = tickerSymbol;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(tickerSymbol).append(",").append(quantity).append("\n");
        return sb.toString();
    }
}
