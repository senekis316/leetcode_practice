package practice.leecode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReorganizeString_767Test {

    @Test
    public void reorganizeString_1() {
        ReorganizeString_767 reorganizeString_767 = new ReorganizeString_767();
        assertEquals("aba", reorganizeString_767.reorganizeString("aab"));
    }

    @Test
    public void reorganizeString_2() {
        ReorganizeString_767 reorganizeString_767 = new ReorganizeString_767();
        assertEquals("", reorganizeString_767.reorganizeString("aaab"));
    }

    @Test
    public void reorganizeString_3() {
        ReorganizeString_767 reorganizeString_767 = new ReorganizeString_767();
        assertEquals("vlvov", reorganizeString_767.reorganizeString("vvvlo"));
    }

    @Test
    public void reorganizeString_4() {
        ReorganizeString_767 reorganizeString_767 = new ReorganizeString_767();
        assertEquals("ndnfirw", reorganizeString_767.reorganizeString("wfndrin"));
    }

    @Test
    public void reorganizeString_5() {
        ReorganizeString_767 reorganizeString_767 = new ReorganizeString_767();
        assertEquals("eweweweweweweweweweweweweweueueueueueueueueueueueueueueuhuhuhuhuhuhshshshshshshshshshshshshshshshshshshshphphphpcpcpcpcpcpcpcpcpcpcpcpcpcpcpcrcrcrcrcrcrcrcrcrcrcrcrmrmrmrmrmrmrmxmxmxmxmxmxmxmxmxmxmxmxmxmxmxmxmxmxmgmgvgvgvgvgvgvgvgvgvgvgvgvgvgvgvgvovovovovovovovovonononononononononbnbnbnbnbnbnbnbnbnbnbnbnbnbnbabaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiatatatatatftftftftftftftftftftftfdfdfdfdfdfdfdfdfdfdfdydydydydyzyzyzyzyzyzyzyzyzyzyzyzyzyzyjyjyjyjkjkjkjkjkjkjkjklklklklklklklklklklklkqkqkqwqwqwqwqwqwqwqwq", reorganizeString_767.reorganizeString("tndsewnllhrtwsvxenkscbivijfqnysamckzoyfnapuotmdexzkkrpmppttficzerdndssuveompqkemtbwbodrhwsfpbmkafpwyedpcowruntvymxtyyejqtajkcjakghtdwmuygecjncxzcxezgecrxonnszmqmecgvqqkdagvaaucewelchsmebikscciegzoiamovdojrmmwgbxeygibxxltemfgpogjkhobmhwquizuwvhfaiavsxhiknysdghcawcrphaykyashchyomklvghkyabxatmrkmrfsppfhgrwywtlxebgzmevefcqquvhvgounldxkdzndwybxhtycmlybhaaqvodntsvfhwcuhvuccwcsxelafyzushjhfyklvghpfvknprfouevsxmcuhiiiewcluehpmzrjzffnrptwbuhnyahrbzqvirvmffbxvrmynfcnupnukayjghpusewdwrbkhvjnveuiionefmnfxao"));
    }

}