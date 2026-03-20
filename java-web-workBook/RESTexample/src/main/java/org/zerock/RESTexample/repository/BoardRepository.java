package org.zerock.RESTexample.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.zerock.RESTexample.domain.Board;
import org.zerock.RESTexample.repository.search.BoardSearch;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {

    @Query(value = "select now()", nativeQuery = true)
    String getTime();

    @EntityGraph(attributePaths = {"imageSet"})
    @Query(value = "select b from Board b where b.bno = :bno")
    Optional<Board> findByIdWithImages(Long bno);
}
