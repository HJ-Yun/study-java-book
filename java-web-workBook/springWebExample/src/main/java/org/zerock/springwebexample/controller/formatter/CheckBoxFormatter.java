package org.zerock.springwebexample.controller.formatter;

import org.apache.logging.log4j.core.tools.picocli.CommandLine;
import org.springframework.format.Formatter;

import java.util.Locale;

public class CheckBoxFormatter implements Formatter<Boolean> {

    @Override
    public Boolean parse(String text, Locale locale) throws CommandLine.ParameterException {
        if (text == null){
            return false;
        }
        return text.equals("on");
    }

    @Override
    public String print(Boolean object, Locale locale){
        return object.toString();
    }

}
