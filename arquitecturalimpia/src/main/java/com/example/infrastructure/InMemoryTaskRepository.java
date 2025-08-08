package com.example.infrastructure;

import com.example.domain.Task;
import com.example.domain.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemoryTaskRepository implements TaskRepository {

    private final List<Task> tasks = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong(1);

    @Override
    public Task save(Task task) {
        task.setId(counter.getAndIncrement());
        tasks.add(task);
        return task;
    }

    @Override
    public List<Task> findAll() {
        return tasks;
    }
}
