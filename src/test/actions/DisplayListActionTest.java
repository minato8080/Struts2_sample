package actions;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import model.ProductService;
import model.SampleProduct;

public class DisplayListActionTest {

	@Test
	public void test() throws Exception {
		DisplayListAction displayListAction = new DisplayListAction();
		ProductService service = ProductService.getInstance();
        List<SampleProduct> expected = service.search();
        displayListAction.execute();
        List<SampleProduct> actual0 = displayListAction.getProducts();
        assertEquals(expected,actual0);
        
        displayListAction.update();
        List<SampleProduct> actual1 = displayListAction.getProducts();
        assertEquals(expected,actual1);
	}
}
