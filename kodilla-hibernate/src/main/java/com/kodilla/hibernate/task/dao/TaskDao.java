package com.kodilla.hibernate.task.dao;

import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
}