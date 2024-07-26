package com.example.fetchapi.fetchapicontroller;

import java.io.IOException;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.FetchRequestData;
import com.example.pojo.FetchResponseData;
import com.example.pojo.FetchTaskRequest;
import com.example.pojo.FetchTaskResp;
import com.example.serviceimpl.TaskListServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@ComponentScan("com.example.serviceimpl")
@ComponentScan("com.example.pojo")
public class FetchTaskController {
	
	private final TaskListServiceImpl taskListServiceImpl;
	
	public FetchTaskController(TaskListServiceImpl taskListServiceImpl) {
		this.taskListServiceImpl = taskListServiceImpl;
	}
	
	@GetMapping("/getAllTasks")
	public FetchResponseData<List<Object>> getTasks(@RequestBody FetchRequestData<List<Object>> requestBody) throws IOException {
		FetchResponseData<List<Object>> response = new FetchResponseData<>();
		List<Object> inputPayload = requestBody.getInputPayload();
		response = taskListServiceImpl.getAllTask(inputPayload.get(0));
		return response;
	}


}
