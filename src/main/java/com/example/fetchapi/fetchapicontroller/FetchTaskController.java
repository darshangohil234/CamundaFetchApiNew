package com.example.fetchapi.fetchapicontroller;

import java.io.IOException;
import java.util.List;

import com.example.domain.GenericResponseData;
import com.example.service.TaskListServiceImpl;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

/**
 * Controller class for handling requests related to tasklist
 * <p>
 * This controller provides endpoints to retrive task details and start process instance
 * </p>
 * <p> @author Darshan Gohil </p>
 */
@RestController
//@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class FetchTaskController {

	/**
	 * Tasklistserviceimpl provide to access TaskListServiceImpl available data
	 */
	private final TaskListServiceImpl taskListServiceImpl;

	/**
	 * Handles Get request for get tasks from the tasklist
	 *
	 * //@param requestBody the field for get tasks using some specific fields
	 * @return a tasks from tasklist as a {@GenericResponseData<List<Object>>}
	 * @throws IOException if an I/O error occurs.
	 */
	@GetMapping("/getAllTasks")
	public GenericResponseData<List<Object>> getAllTasks(@RequestBody Object requestBody) throws IOException {
		GenericResponseData<List<Object>> response = taskListServiceImpl.getAllTask(requestBody);
		return response;
	}

	/**
	 * Handles Post request for start process instance
	 *
	 * @param requestBody the field for get process instance id
	 * @return success message after executing successfully {@FetchResponseData<List<Object>>}
	 * @throws IOException if an I/O error occurs.
	 */
/*	@PostMapping("/startProcess")
	public GenericResponseData<List<Object>> startProcess(Object requestBody) throws  IOException{
		GenericResponseData<List<Object>> response = taskListServiceImpl.start(requestBody);
		return response;
	}*/

}
