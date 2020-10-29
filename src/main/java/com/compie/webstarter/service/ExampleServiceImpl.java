package com.compie.webstarter.service;
import com.compie.webstarter.model.domain.Example;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service()
public class ExampleServiceImpl implements ExampleService {
    @Override
    public String getExample() {
        log.info("getting example");
        return "hello from the implementation of user service";
    }

    @Override
    public Example createNew(Example example) {
        log.info("creating new example");
        return null;
    }
}
