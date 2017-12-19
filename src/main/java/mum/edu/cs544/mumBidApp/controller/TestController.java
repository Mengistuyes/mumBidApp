package mum.edu.cs544.mumBidApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mum.edu.cs544.mumBidApp.model.Response;

import mum.edu.cs544.mumBidApp.service.TestService;

@RestController
public class TestController {
	/*
	@Autowired
	TestService testService;

    @RequestMapping(value = "/user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@RequestBody @Validated User user) {

        Response resp = new Response();
        testService.save(user);
        HttpStatus httpCode = (user.getId() > 0) ? HttpStatus.CREATED : HttpStatus.INTERNAL_SERVER_ERROR;
        resp.setDescription((user.getId() > 0) ? "Operation successful" : "Operation failed");

        return new ResponseEntity<>(resp, httpCode);
    }
*/
}
