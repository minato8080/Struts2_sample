package actions;

import java.util.ArrayList;
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
		log.info("- checkedList:{}" , checked_list);

		if(checked_list == null) {
			this.checked_list = new ArrayList<String>(){};
			return "success";
		}
		
		//ダミーを格納
		ProductService service = new ProductService();
		this.products = service.search();
		
		for(String ch:checked_list) {
			int index = Integer.parseInt(ch);
			sumPrice += this.products.get(index).getPrice();	
		}

		return "success";
	}
	@Getter @Setter
	private List<String> checked_list;
	@Getter @Setter
	private String select_factory;
	@Getter @Setter
	private String select_person;
	@Getter @Setter
	private String select_date;
	@Getter @Setter
	private List<SampleProduct> products;
	@Getter @Setter
	private int sumPrice = 0;
}
