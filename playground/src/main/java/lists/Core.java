package lists;

/**
 * 야매 리스트??*
 */
public class Core {

    private final static int MX = 1000005;
    private final static int[] data = new int[1000005];
    private final static int[] pre = new int[1000005];
    private final static int[] nxt = new int[1000005];

    private static int unused = 1;

    void insert(int addr, int num){
        data[unused] = num;
        pre[unused] = addr;
        nxt[unused] = nxt[addr];

        if (nxt[addr] != -1) pre[nxt[addr]] = unused;
        nxt[addr] = unused;
        unused++;
    }

    void erase(int addr) {
        nxt[pre[addr]] = nxt[addr];
        if (nxt[addr] != -1) pre[nxt[addr]] = pre[addr];
    }
}
