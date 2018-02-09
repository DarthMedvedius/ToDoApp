package com.nikitenko.todoapp.repository;

import com.nikitenko.todoapp.todoapp.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ToDoRepository extends JpaRepository<ToDo, Long>{

}
