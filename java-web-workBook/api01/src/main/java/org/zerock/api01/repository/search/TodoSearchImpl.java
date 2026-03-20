package org.zerock.api01.repository.search;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;
import org.zerock.api01.domain.QTodo;
import org.zerock.api01.domain.Todo;
import org.zerock.api01.dto.PageRequestDTO;
import org.zerock.api01.dto.TodoDTO;

import java.util.List;

@Log4j2
@Repository
@RequiredArgsConstructor
public class TodoSearchImpl implements TodoSearch {

    private final JPAQueryFactory queryFactory;

    @Override
    public Page<TodoDTO> list(PageRequestDTO pageRequestDTO) {

        QTodo todo = QTodo.todo;

        BooleanBuilder builder = new BooleanBuilder();

        if (pageRequestDTO.getFrom() != null && pageRequestDTO.getTo() != null) {
            builder.and(todo.dueDate.goe(pageRequestDTO.getFrom()));
            builder.and(todo.dueDate.loe(pageRequestDTO.getTo()));
        }

        if (pageRequestDTO.getCompleted() != null) {
            builder.and(todo.complete.eq(pageRequestDTO.getCompleted()));
        }

        if (pageRequestDTO.getKeyword() != null) {
            builder.and(todo.title.contains(pageRequestDTO.getKeyword()));
        }

        List<TodoDTO> list = queryFactory
                .select(Projections.bean(
                        TodoDTO.class,
                        todo.tno,
                        todo.title,
                        todo.dueDate,
                        todo.complete,
                        todo.writer
                ))
                .from(todo)
                .where(builder)
                .fetch();

        long count = queryFactory
                .select(todo.count())
                .from(todo)
                .where(builder)
                .fetchOne();

        return new PageImpl<>(list, pageRequestDTO.getPagealbe("tno"), count);
    }
}
