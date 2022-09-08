package jobj.di;

import jobj.StartUI;
import jobj.di.context.Context;
import jobj.di.store.Store;
import jobj.ConsoleInput;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        String question = "question";
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        ui.askStr(question);

    }
}
