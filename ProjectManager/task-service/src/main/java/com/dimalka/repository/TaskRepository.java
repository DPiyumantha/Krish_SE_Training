package com.dimalka.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.dimalka.projectmanager.commons.model.taskservice.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findByProjectId(int id);

    @Modifying
    @Transactional
    @Query("update Task t set t.taskName=?1, t.projectId=?2, t.progress=?3, t.member=?4 where t.taskId=?5")
    int updateTask(String taskName, int projectId, float progress, String member, int taskId);
}
