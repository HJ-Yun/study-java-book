package org.zerock.springwebexample.mapper;

import org.zerock.springwebexample.domain.TodoVO;
import java.util.List;

public interface TodoMapper {

    String getTime();

    void insert(TodoVO todoVO);

    List<TodoVO> selectAll();

    TodoVO selectOne(Long tno);

    void deleteOne(Long tno);

    void updateOne(TodoVO todoVO);

}
