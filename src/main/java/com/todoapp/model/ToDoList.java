package com.todoapp.model;

import com.todoapp.repository.ToDoRepository;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class ToDoList extends VerticalLayout {

    @Autowired
    ToDoRepository repository;

    @PostConstruct
    void init(){
        setSpacing(true);

        setTodos(repository.findAll());
    }
    private void setTodos(List<ToDo> todos){
        removeAllComponents();
        todos.forEach(toDo -> {
            addComponent(new ToDoLayout(toDo));
        });
    }

}
