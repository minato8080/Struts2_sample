package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

public class WorkListData {
	
	public WorkListData() {
		monthInit();
		personInit();
		factoryInit();
	}

    @Getter @Setter
    private Map<String,String> month;
    
    private void monthInit(){
		this.month = new HashMap<String, String>();
		this.month.put("01","January");
		this.month.put("02","February");
		this.month.put("03","March");
		this.month.put("04","April");
		this.month.put("05","May");
		this.month.put("06","June");
		this.month.put("07","July");
		this.month.put("08","August");
		this.month.put("09","September");
		this.month.put("10","October");
		this.month.put("11","November");
		this.month.put("12","December");
    }
    @Getter @Setter
    private List<String> person;
    
    private void personInit(){
		this.person = new ArrayList<String>();
		this.person.add("佐藤");
		this.person.add("田中");
		this.person.add("鈴木");
		this.person.add("山本");
		this.person.add("福田");
		this.person.add("東野");
		this.person.add("後藤");
    }
    @Getter @Setter
    private List<String> factory;
    
    private void factoryInit(){
		this.factory = new ArrayList<String>();
		this.factory.add("本社");
		this.factory.add("川崎");
		this.factory.add("品川");
		this.factory.add("蒲田");
    }
}