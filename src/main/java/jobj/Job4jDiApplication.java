package jobj;

import jobj.di.store.Store;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Job4jDiApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("ru.job4j.di");
		context.refresh();
		Store store = context.getBean(Store.class);
		store.add("Petr Arsentev");
		Store another = context.getBean(Store.class);
		another.getData().forEach(System.out::println);
	}

}
