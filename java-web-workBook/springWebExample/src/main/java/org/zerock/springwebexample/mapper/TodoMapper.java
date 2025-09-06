package org.zerock.springwebexample.mapper;

import org.zerock.springwebexample.domain.TodoVO;

public interface TodoMapper {

    String getTime();

    void insert(TodoVO todoVO);
}
