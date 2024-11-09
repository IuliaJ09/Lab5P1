package teste;
import problema1.PerecheNumere;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class TesteNumere {
    @Test
    void test1_Fibonaci()

    {
        PerecheNumere pereche = new PerecheNumere(10, 20);
        assertEquals(false,pereche.Fibonaci());
    }
    @Test
    void test2_Fibonaci(){
        PerecheNumere pereche = new PerecheNumere(1, 2);
        assertTrue(pereche.Fibonaci()==true);
    }
    @Test
    void test3_Fibonaci(){
        PerecheNumere pereche = new PerecheNumere(1, 2);
        assertFalse(pereche.Fibonaci()==false);
    }
    @Test
    void test1_cmmmc(){
        PerecheNumere pereche = new PerecheNumere(12, 18);
        assertEquals(36,pereche.cmmmc());
    }
    @Test
    void test2_cmmmc(){
        PerecheNumere pereche = new PerecheNumere(12, 18);
        assertTrue(pereche.cmmmc()==36);
    }
    @Test
    void test3_cmmmc(){
        PerecheNumere pereche = new PerecheNumere(12, 18);
        assertFalse(pereche.cmmmc()!=36);
    }
    @Test
    void test1_SumCif(){
        PerecheNumere pereche = new PerecheNumere(56, 23);
        assertEquals(false,pereche.SumCif());
    }
    @Test
    void test2_SumCif(){
        PerecheNumere pereche = new PerecheNumere(32, 23);
        assertTrue(pereche.SumCif()==true);
    }
    @Test
    void test3_SumCif(){
        PerecheNumere pereche = new PerecheNumere(32, 23);
        assertFalse(pereche.SumCif()==false);
    }
   @Test
    void test1_CifPare(){
        PerecheNumere pereche = new PerecheNumere(12, 18);
        assertEquals(true,pereche.CifPare());
   }
   @Test

    void test2_CifPare(){
        PerecheNumere pereche = new PerecheNumere(12, 18);
        assertTrue(pereche.CifPare()==true);
   }
   @Test

    void test3_CifPare(){
        PerecheNumere pereche = new PerecheNumere(11, 18);
        assertFalse(pereche.CifPare()==true);
   }
}
