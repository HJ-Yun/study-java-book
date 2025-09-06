package org.zerock.springwebexample.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Class for convert between DTO and VO

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper getMapper(){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)  // No need getter/setter
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)  // private value
                .setMatchingStrategy(MatchingStrategies.STRICT);    // need exact same column name

        return modelMapper;
    }

}