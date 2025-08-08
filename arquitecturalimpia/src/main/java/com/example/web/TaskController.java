package com.example.web;

import com.example.application.TaskService;
import com.example.domain.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    public TaskResponse createTask(@RequestBody TaskRequest request) {
        Task task = taskService.createTask(request.getTitle());
        return new TaskResponse(task.getId(), task.getTitle());
    }

    @GetMapping
    public List<TaskResponse> listTasks() {
        return taskService.listTasks().stream()
                .map(t -> new TaskResponse(t.getId(), t.getTitle()))
                .toList();
    }
}

