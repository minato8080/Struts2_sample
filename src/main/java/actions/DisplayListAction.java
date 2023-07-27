package actions;

import java.util.ArrayList;
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
        
		/***********新規項目のデータ受け取り*************/
		if(n_checked_list == null) {
			this.n_checked_list = new ArrayList<String>(){};
		}
        log.info("- n_checked_list:{}" , n_checked_list);
		/***********新規項目のデータ受け取り*************/
        
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
    private List<String> n_secret;
    @Getter @Setter
    private List<String> n_editable;
}
