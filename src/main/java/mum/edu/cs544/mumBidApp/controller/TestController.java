package mum.edu.cs544.mumBidApp.controller;

import org.springframework.web.bind.annotation.RestController;

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
