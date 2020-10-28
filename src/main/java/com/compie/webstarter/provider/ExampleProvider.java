package com.compie.webstarter.provider;

import com.compie.webstarter.model.domain.Example;
import com.compie.webstarter.service.ExampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class ExampleProvider {
    private final ExampleService exampleService;

    @Autowired()
    public ExampleProvider(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    public String getExample(){
       return exampleService.getExample();
    }

    public Example createNew(Example example){
        return  exampleService.createNew(example);
    }
}
