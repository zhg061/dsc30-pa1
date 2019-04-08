

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StartupTest {
    int[] a1;
    int[] a2;
    int[] a3;
    int[] a4;
    int[] a5;
    int[] a6;
    int[] a7;
    int[] a8;
    int[] b1;
    int[] b2;
    int[] b3;
    int[] b4;
    int[] b5;
    int[] b6;
    int[] c1;
    int[] c2;
    int[] c3;
    int[] c4;
    int[] c5;
    int[] d1;
    int[] d2;
    int[] d3;
    int[] d4;
    int[] d5;
    int[] e1;
    int[] e2;
    int[] e3;
    int[] e4;
    int[] e5;
    int[] e6;
    int[] f1;
    int[] f2;
    int[] f3;
    int[] f4;
    int[] f5;
    int[] f6;
    int[] g1;
    int[] g2;
    int[] g3;
    int[] g4;
    int[] g5;
    int[] g6;
    int[] g7;
    @Before
    public void setup(){
        a1 = new int[]{2, 1, 8};
        a2 = new int[]{1, 1, 1};
        a3 = new int[]{2, 4, 6, 3 ,5, 7};
        a4 = new int[]{2};
        a5 = new int[]{1, 2, 3, 4, 4};
        a6 = new int[]{1, 5, 4, 2, 8, 1, 8, 9, 9, 1};
        a7 = new int[]{7, 1, 2, 8, 3, 1};
        a8 = new int[]{};
        b1 = new int[]{1, 1, 1, 1};
        b2 = new int[]{1, 2, 2, 3};
        b3 = new int[]{1, 1, 1, 2, 2, 2};
        b4 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4};
        b5 = new int[]{999, 444, 555, 34252};
        b6 = new int[]{-1, -1, -1, 2, 3, 4, 4, -5};
        c1 = new int[]{1, 1, 1, 1};
        c2 = new int[]{1, 2, 2, 3};
        c3 = new int[]{1, 1, 1, 2, 2, 2};
        c4 = new int[]{2, 3, 5, 6};
        c5 = new int[]{5, 7, 4};
        d1 = new int[]{1, 1, 1, 1};
        d2 = new int[]{1, 2, 2, 3};
        d3 = new int[]{1, 1, 1, 2, 2, 2};
        d4 = new int[]{2, 3, 5, 6};
        d5 = new int[]{2, 3, 4, 5, 5, 5, 7};
        e1 = new int[]{3, 2, 1, 2};
        e2 = new int[]{3, 4, 5, 6, 7, 8, 9};
        e3 = new int[]{6, 4, 2, 0};
        e4 = new int[]{4, 4, 4, 3};
        e5 = new int[]{6, 4, 7, 5, 8 ,6};
        e6 = new int[]{6, 6, 6, 6};
        f1 = new int[]{3, 2, 1, 2};
        f2 = new int[]{3, 4, 5, 6, 7, 8, 9};
        f3 = new int[]{6, 4, 2, 0};
        f4 = new int[]{4, 4, 4, 3};
        f5 = new int[]{6, 4, 7, 5, 8 ,6};
        f6 = new int[]{6, 6, 6, 6};
        g1 = new int[]{0, 1, 2};
        g2 = new int[]{1, 0};
        g3 = new int[]{1, 2, 2, 0, 0};
        g4 = new int[]{1, 0, 2, 6, 8};
        g5 = new int[]{3, 0, 0, 3};
        g6 = new int[]{3, 0, 0, 0, 3};
        g7 = new int[]{2, 0, 3, 0, 0, 0};
    }

    @org.junit.Test
    public void secondMax() {
        int result1 = Startup.secondMax(a1) ;
        assertEquals(2, result1);
        int result2 = Startup.secondMax(a2) ;
        assertEquals(1, result2);
        int result3 = Startup.secondMax(a3) ;
        assertEquals(6, result3);
        int result4 = Startup.secondMax(a4) ;
        assertEquals(Integer.MAX_VALUE, result4);
        int result5 = Startup.secondMax(a5) ;
        assertEquals(4, result5);
        int result6 = Startup.secondMax(a6) ;
        assertEquals(9, result6);
        int result7 = Startup.secondMax(a7) ;
        assertEquals(7, result7);
        int result8 = Startup.secondMax(a8) ;
        assertEquals(Integer.MAX_VALUE, result8);
    }

    @org.junit.Test
    public void mostFreqInt() {
        int result1 = Startup.mostFreqInt(b1) ;
        assertEquals(1, result1);
        int result2 = Startup.mostFreqInt(b2) ;
        assertEquals(2, result2);
        int result3 = Startup.mostFreqInt(b3) ;
        assertEquals(1, result3);
        int result4 = Startup.mostFreqInt(b4) ;
        assertEquals(0, result4);
        int result5 = Startup.mostFreqInt(b5) ;
        assertEquals(999, result5);
        int result6 = Startup.mostFreqInt(b6) ;
        assertEquals(-1, result6);
    }

    @org.junit.Test
    public void rearrange() {
        int[] result1 = Startup.rearrange(c1) ;
        assertArrayEquals(new int[]{1, 1, 1, 1}, result1);
        int[] result2 = Startup.rearrange(c2) ;
        assertArrayEquals(new int[]{2, 2, 3, 1}, result2);
        int[] result3 = Startup.rearrange(c3) ;
        assertArrayEquals(new int[]{2, 2, 2, 1, 1, 1}, result3);
        int[] result4 = Startup.rearrange(c4) ;
        assertArrayEquals(new int[]{2, 6, 5, 3}, result4);
        int[] result5 = Startup.rearrange(c5) ;
        assertArrayEquals(new int[]{4, 7, 5}, result5);
    }

    @org.junit.Test
    public void removeDuplicates() {
        int result1 = Startup.removeDuplicates(d1) ;
        assertEquals(1, result1);
        assertArrayEquals(new int[]{1, 1, 1, 1}, d1);
        int result2 = Startup.removeDuplicates(d2) ;
        assertEquals(3, result2);
        assertArrayEquals(new int[]{1,2,3,3}, d2);
        int result3 = Startup.removeDuplicates(d3) ;
        assertEquals(2, result3);
        assertArrayEquals(new int[]{1, 2, 1, 2, 2, 2}, d3);
        int result4 = Startup.removeDuplicates(d4) ;
        assertEquals(4, result4);
        assertArrayEquals(new int[]{2, 3, 5, 6}, d4);
        int result5 = Startup.removeDuplicates(d5) ;
        assertEquals(5, result5);
        assertArrayEquals(new int[]{2, 3, 4, 5, 7, 5, 7}, d5);
    }

    private boolean testIsSameBeginning(int[] a, int[] b){
        int[] result = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            result[i] = b[i];
        }
        return a == result;
//        int result1 = Startup.removeDuplicates(d1) ;
//        assertArrayEquals(new int[]{1, 1, 1, 1}, d1);
//        int result2 = Startup.removeDuplicates(d2) ;
//        assertArrayEquals(new int[]{1,2,3,3}, d2);
//        int result3 = Startup.removeDuplicates(d3) ;
//        assertArrayEquals(new int[]{1, 2, 1, 2, 2, 2}, d3);
//        int result4 = Startup.removeDuplicates(d4) ;
//        assertArrayEquals(new int[]{2, 3, 5, 6}, d4);
//        int result5 = Startup.removeDuplicates(d5) ;
//        assertArrayEquals(new int[]{2, 3, 4, 5, 7, 5, 7}, d5);
    }


    @org.junit.Test
    public void maxProfitOne() {
        int result1 = Startup.maxProfitOne(e1) ;
        assertEquals(1, result1);
        int result2 = Startup.maxProfitOne(e2) ;
        assertEquals(6, result2);
        int result3 = Startup.maxProfitOne(e3) ;
        assertEquals(0, result3);
        int result4 = Startup.maxProfitOne(e4) ;
        assertEquals(0, result4);
        int result5 = Startup.maxProfitOne(e5) ;
        assertEquals(4, result5);
        int result6 = Startup.maxProfitOne(e6) ;
        assertEquals(0, result6);
    }

    @org.junit.Test
    public void maxProfitMany() {
        int result1 = Startup.maxProfitMany(f1) ;
        assertEquals(1, result1);
        int result2 = Startup.maxProfitMany(f2) ;
        assertEquals(6, result2);
        int result3 = Startup.maxProfitMany(f3) ;
        assertEquals(0, result3);
        int result4 = Startup.maxProfitMany(f4) ;
        assertEquals(0, result4);
        int result5 = Startup.maxProfitMany(f5) ;
        assertEquals(6, result5);
        int result6 = Startup.maxProfitMany(f6) ;
        assertEquals(0, result6);
    }

    @org.junit.Test
    public void jumpGame() {
        assertEquals(false, Startup.jumpGame(g1));
        assertEquals(true, Startup.jumpGame(g2));
        assertEquals(true, Startup.jumpGame(g3));
        assertEquals(false, Startup.jumpGame(g4));
        assertEquals(true, Startup.jumpGame(g5));
        assertEquals(false, Startup.jumpGame(g6));
        assertEquals(true, Startup.jumpGame(g7));
    }

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void secondMax1() {
    }

    @Test
    public void mostFreqInt1() {
    }

    @Test
    public void rearrange1() {
    }

    @Test
    public void removeDuplicates1() {
    }

    @Test
    public void maxProfitOne1() {
    }

    @Test
    public void maxProfitMany1() {
    }

    @Test
    public void jumpGame1() {
    }
}