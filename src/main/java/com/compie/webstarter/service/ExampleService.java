package com.compie.webstarter.service;

import com.compie.webstarter.model.domain.Example;

public interface ExampleService {
  String getExample();
  Example createNew(Example example);
}
