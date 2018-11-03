package com.udea.empresariales.codebreaker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/guess")
public interface CodeBreakerController {

    @RequestMapping(value = "/{number}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> getClientById(@PathVariable("number") String number);

}