import org.example.best.time.to.buy.and.sell.stock.BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BestTimeToBuyAnSellStockTest {

    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    @Test
    @DisplayName("Test Case 1")
    void maxProfitTest() {
        int []prices =new int[]{7,1,5,3,6,4};
        int maxProfit =bestTimeToBuyAndSellStock.maxProfit2(prices);
        Assertions.assertEquals(5,maxProfit);


    }
    @Test
    @DisplayName("Test Case 3")
    void maxProfitTest3() {
        int []prices =new int[]{1,1,9,3,6,4};
        int maxProfit =bestTimeToBuyAndSellStock.maxProfit(prices);
        Assertions.assertEquals(8,maxProfit);


    }
//    @Test
//    @Disabled("Not worked yet !")
//    void maxProfit1() {
//        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock=new BestTimeToBuyAndSellStock();
//        Assertions.assertEquals(1,bestTimeToBuyAndSellStock.maxProfit(null));
//    }
//    @Test
//    @Disabled("Not worked yet !")
//    @DisplayName("Test Case 2 ,method name:{ maxProfit2 }")
//    void maxProfit2(){
//        Assertions.assertNotEquals(0,20);
//
//    }
//    @Test
//    @Disabled("Not worked yet !")
//    @DisplayName("Test Case 3 ,method name:{ maxProfit3 }")
//    void maxProfit3(){
//
//        fail("Not implemented !");
//        Assertions.assertNotEquals(0,20);
//
//    }
    @BeforeAll
    public void  createInstance(){
        bestTimeToBuyAndSellStock=new BestTimeToBuyAndSellStock();
    }

}
