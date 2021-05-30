package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean(name = "taskList")
    @Scope("prototype")
    public TaskList getTasks() {
        return new TaskList();
    }


    @Bean
    Board getBoard() {
        return new Board(getTasks(), getTasks(), getTasks());
    }

}
