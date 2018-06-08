package chegg.apr18.q8;

import java.util.List;

/**
 * Container for storing all the Shares of a trader
 */
public class ShareList {
    // Name of trader whose share are stored here
    private String traderName;

    // List of Share objects hold by the trader
    private List<Share> shareList;

    // Constructor
    public ShareList(String traderName, List<Share> shareList) {
        this.shareList = shareList;
        this.traderName = traderName;
    }

    /**
     * Adds a new share to the ShareList
     * @param share
     */
    public void add(Share share) {
        shareList.add(share);
    }

    @Override
    public String toString() {
        final StringBuffer stringBuffer = new StringBuffer(traderName).append("\n").append("\n");
        for (Share share : shareList) {
            stringBuffer.append(share.toString());
        }
        return stringBuffer.toString();
    }
}
