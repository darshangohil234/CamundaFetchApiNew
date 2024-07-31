package com.example.controller;

import com.example.configuration.BearerTokenGeneratorConfig;
import com.example.configuration.HeaderConfig;
import com.example.domain.GenericResponseData;
import com.example.service.TaskListServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
/**
 * Controller class for handling requests related to tasklist
 * <p>
 * This controller provides endpoints to retrive task details and start process instance
 * </p>
 * <p> @author Darshan Gohil </p>
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@Import({TaskListServiceImpl.class, HeaderConfig.class, BearerTokenGeneratorConfig.class})
public class GenericApiController {

    /**
     * Tasklistserviceimpl provide to access TaskListServiceImpl available data
     */
    private final TaskListServiceImpl taskListServiceImpl;

    /**
     * Handles Get request for get tasks from the tasklist
     *
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
     * @return success message after executing successfully {@FetchResponseData<List<Object>>}
     * @throws IOException if an I/O error occurs.
     */
    @PostMapping("/startProcess")
    public GenericResponseData<List<Object>> startProcess() throws  IOException{
        GenericResponseData<List<Object>> response = taskListServiceImpl.start();
        return response;
    }

}
