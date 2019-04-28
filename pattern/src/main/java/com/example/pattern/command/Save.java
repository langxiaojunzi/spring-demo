package com.example.pattern.command;

/**
 * <p>create at 2019/4/26</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Save implements Action {
    private final Editor editor;

    public Save(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.save();
    }
}
