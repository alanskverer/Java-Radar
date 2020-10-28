package com.compie.webstarter.provider;

import com.compie.webstarter.model.domain.Example;
import com.compie.webstarter.service.ExampleService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component()
@RequiredArgsConstructor
public class ExampleProvider {
    private final ExampleService exampleService;

    public String getExample(){
       return exampleService.getExample();
    }

    public Example createNew(Example example){
        return  exampleService.createNew(example);
    }
}
