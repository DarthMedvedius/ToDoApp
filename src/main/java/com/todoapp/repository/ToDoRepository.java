package com.todoapp.repository;

import com.todoapp.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ToDoRepository extends JpaRepository<ToDo, Long>{

}
