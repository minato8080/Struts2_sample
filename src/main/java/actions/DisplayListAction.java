package actions;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork.ActionSupport;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import model.ProductService;
import model.SampleProduct;
import model.WorkListData;

/**
 * <code>Set welcome message.</code>
 */
@Log4j2
public class DisplayListAction extends ActionSupport {
    public String execute() throws Exception {
    	//ダミーを格納
        ProductService service = new ProductService();
        this.products = service.search();
        log.info("- search:{}" , products);
        

    	display();
        
        return SUCCESS;
    }
    
    public String update() throws Exception {
    	//ダミーを格納
        ProductService service = new ProductService();
        this.products = service.search();
        
		///新規(N)ボタンからデータがあれば受け取る
        if(n_id==null) {
        	display();
        	
            return SUCCESS;
        }
		int length = n_id.size();
		for (int i = 0; i < length; i++) {
			String id = n_id.get(i);
			String name = n_name.get(i);
			long stock = Integer.parseInt(n_stock.get(i));
			boolean secret = n_secret.get(i);
			boolean editable = n_editable.get(i);
			
			SampleProduct newProduct = new SampleProduct(id, name, stock, secret, editable, 100);
			products.add(newProduct);
        }
        
    	display();
        
        return SUCCESS;
    }
    
    private void display() {
    	//画面用のデータを格納
        WorkListData workListData = new WorkListData();
        this.month = workListData.getMonth();
        this.person = workListData.getPerson();
        this.factory = workListData.getFactory();
        
        setDate(new Date());
        
        //ダミー
        setBill("huga");
        setDeliver("hoge");
    }
    
    @Getter @Setter
    private List<SampleProduct> products;
    @Getter @Setter
    private Map<String,String> month;
    @Getter @Setter
    private List<String> person;
    @Getter @Setter
    private List<String> factory;
    @Getter @Setter
    private Date date;
    @Getter @Setter
    private String bill;
    @Getter @Setter
    private String deliver;
    
    
    //新規(N)ボタンから送信されるデータ
    @Getter @Setter
    private List<String> n_checked_list;
    @Getter @Setter
    private List<String> n_id;
    @Getter @Setter
    private List<String> n_name;
    @Getter @Setter
    private List<String> n_stock;
    @Getter @Setter
    private List<Boolean> n_secret;
    @Getter @Setter
    private List<Boolean> n_editable;
}
