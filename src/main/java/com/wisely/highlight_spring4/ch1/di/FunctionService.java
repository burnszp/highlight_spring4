package com.wisely.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;

/**
 * 编写功能类的Bean.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " +word+" !";
    }
}
