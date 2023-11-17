package edu.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.learning.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
