package edu.learning.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.learning.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM Task WHERE id= :tid")
	public void deleteReocrd(@Param("tid") int id);
	
	@Query(value = "UPDATE task_details SET status= :st WHERE id= :tid", nativeQuery = true)
	public void updateReocrd(@Param("tid") int id,@Param("st") String status);
}
