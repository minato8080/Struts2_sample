package actions;

import java.util.List;

import com.opensymphony.xwork.ActionSupport;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import model.ProductService;
import model.SampleProduct;

@Log4j2
public class DisplayConfirmAction extends ActionSupport{
	public String execute() {
		log.info("- checkedList:{}" , checkedList);

		//ダミーを格納
		ProductService service = new ProductService();
		this.products = service.search();
		
		sumPrice=0;
		for(String ch:checkedList) {
			int index = Integer.parseInt(ch);
			sumPrice += this.products.get(index).getPrice();	
		}

		return "success";
	}
	@Getter @Setter
	private List<String> checkedList;
	@Getter @Setter
	private List<SampleProduct> products;
	@Getter @Setter
	private int sumPrice;
}
