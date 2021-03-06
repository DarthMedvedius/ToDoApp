package com.todoapp.model;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

public class ToDoLayout extends HorizontalLayout {

    private CheckBox done;
    private TextField text;

    public ToDoLayout(ToDo todo) {
        setSpacing(true);
        setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

        done = new CheckBox();
        text = new TextField();

        FieldGroup fieldGroup = new FieldGroup

        addComponents(done, text);
    }
}
