package com.todoapp.view;
import com.todoapp.model.ToDoList;
import com.vaadin.annotations.Theme;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;


@SpringUI
@Theme("valo")
public class ToDoUI extends UI{

private VerticalLayout layout;

    @Autowired
    ToDoList todoList;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setupLayout();
        addHeader();
        addForm();
        addTodoList();
        addActionButton();
    }

    private void setupLayout() {
        layout = new VerticalLayout();
        layout.setSpacing(true);
        layout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        setContent(layout);
    }

    private void addHeader() {
        Label header = new Label("ToDo");
        header.addStyleName(ValoTheme.LABEL_H1);
        header.setSizeUndefined();
        layout.addComponent(header);
    }

    private void addForm() {
        HorizontalLayout formLayout = new HorizontalLayout();
        formLayout.setSpacing(true);
        formLayout.setWidth("80%");
        TextField taskField = new TextField();
        taskField.setWidth("100%");
        Button addButton = new Button("");
        addButton.setIcon(FontAwesome.PLUS);
        addButton.addStyleName(ValoTheme.BUTTON_PRIMARY);
        formLayout.addComponent(taskField);
        formLayout.setExpandRatio(taskField, 1);
        formLayout.addComponent(addButton);
        layout.addComponent(formLayout);
    }

    private void addTodoList() {
        todoList.setWidth("80%");
        layout.addComponent(todoList);
    }

    private void addActionButton() {
        Button deleteButton = new Button("Delete completed");
        layout.addComponent(deleteButton);
    }
}
