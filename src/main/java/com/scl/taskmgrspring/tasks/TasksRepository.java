package com.scl.taskmgrspring.tasks;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public interface TasksRepository extends JpaRepository<TasksEntity, Long> {

    TasksEntity findByDueDate(Date dueDate);


}
