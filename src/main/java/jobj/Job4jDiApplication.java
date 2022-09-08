package jobj;

import jobj.di.store.Store;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Job4jDiApplication {

	public static void main(String[] args) {
		StartUI ui;
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
			context.register(StartUI.class);
			context.register(ConsoleInput.class);
			context.register(Store.class);

			context.refresh();

			ui = context.getBean(StartUI.class);
		}
		String question = "question";
		ui.add("Petr Arsentev");
		ui.add("Ivan ivanov");
		ui.print();
		ui.askStr(question);
	}

}
