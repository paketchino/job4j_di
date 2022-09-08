package jobj;

import jobj.di.store.Store;

public class StartUI {

    private final ConsoleInput input;
    private final Store store;

    public StartUI(ConsoleInput input, Store store) {
        this.input = input;
        this.store = store;
    }

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
