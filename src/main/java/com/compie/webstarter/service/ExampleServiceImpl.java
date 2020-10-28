package com.compie.webstarter.service;
import com.compie.webstarter.model.domain.Example;
import org.springframework.stereotype.Service;

@Service()
public class ExampleServiceImpl implements ExampleService {
    @Override
    public String getExample() {
        return "hello from the implementation of user service";
    }

    @Override
    public Example createNew(Example example) {
        return null;
    }
}
