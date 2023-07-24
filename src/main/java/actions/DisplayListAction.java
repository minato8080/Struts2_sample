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
        

    	//画面用のデータを格納
        WorkListData workListData = new WorkListData();
        this.month = workListData.getMonth();
        this.person = workListData.getPerson();
        this.factory = workListData.getFactory();
        setBill("huga");
        setDeliver("hoge");
        setDate(new Date());
        
        return SUCCESS;
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
}
