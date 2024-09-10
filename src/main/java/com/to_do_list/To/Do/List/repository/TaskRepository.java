package com.to_do_list.To.Do.List.repository;

import com.to_do_list.To.Do.List.model.Task;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TaskRepository extends JpaRepository<Task, Long> {

}
