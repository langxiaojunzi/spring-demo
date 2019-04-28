package com.example.pattern.command;

/**
 * <p>create at 2019/4/26</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Open implements Action {

    private final Editor editor;

    public Open(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.open();
    }
}
