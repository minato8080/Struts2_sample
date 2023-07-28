package actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.Getter;
import lombok.Setter;

public class HelloWorldAction {
	private Logger logger = LogManager.getLogger(HelloWorldAction.class);

	public String execute() {
		logger.info("入力されたパラメータは「{}」です。", name);
		return "success";
	}
	
	@Getter @Setter
	private String name;
}
