package actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorldAction {
	private Logger logger = LogManager.getLogger(HelloWorldAction.class);
	private String name;
	public String execute() {
		logger.info("入力されたパラメータは「{}」です。", name);
		return "success";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
