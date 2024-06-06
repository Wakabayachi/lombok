package com.kodilla.hibernate.task.dao;

import com.crud.tasks.domain.Task;
import com.crud.tasks.repository.CrudRepository;

public interface TaskDao extends CrudRepository<Task, Integer> {

}
