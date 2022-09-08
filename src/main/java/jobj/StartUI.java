package jobj;

import jobj.di.store.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    @Autowired
    private ConsoleInput input;
    @Autowired
    private Store store;


    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getData()) {
            System.out.println(value);
        }
    }

    public String askStr(String question) {
        return input.askStr(question);
    }
}
