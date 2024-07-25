package com.example.FetchCamundaTaskApi.FetchTaskController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.POJO.FetchTaskRequest;
import com.example.POJO.FetchTaskResp;
import com.example.ServiceImpl.TaskListServiceImpl;

@RestController
@ComponentScan("com.example.ServiceImpl")
@ComponentScan("com.example.POJO")
public class FetchTaskController {

	@Autowired
	private TaskListServiceImpl taskListServiceImpl;

	@GetMapping("/getAllTasks")
	public List<FetchTaskResp> getTasks(@RequestBody FetchTaskRequest requestBody) throws IOException {
		List<FetchTaskResp> response = new ArrayList<>();
		response = taskListServiceImpl.getAllTask(requestBody);
		return response;
	}

}
