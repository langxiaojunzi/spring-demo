package com.example.pattern.command;

/**
 * <p>create at 2019/4/26</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class App {
    public static void main(String[] args) {
        Macro macro = new Macro();

//        macro.record(new Open(editor));
//        macro.record(new Save(editor));
//        macro.record(new Close(editor));
        macro.run();


//        Macro macro = new Macro();
//        macro.record(() -> editor.open());
//        macro.record(() -> editor.save());
//        macro.record(() -> editor.close());
//        macro.run();
    }
}
