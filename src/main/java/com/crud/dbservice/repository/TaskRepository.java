package com.crud.dbservice.repository;

import com.crud.dbservice.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
