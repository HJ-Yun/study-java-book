package org.zerock.demo.todo.dto;

import java.time.LocalDate;

public class TodoDTO {
    private Long tno;
    private String tittle;
    private LocalDate dueDate;
    private boolean finished;

    public Long getTno() {
        return tno;
    }

    public void setTno(Long tno) {
        this.tno = tno;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "TodoDTO {" +
                "tno = " + tno +
                ", tittle = '" + tittle + "'" +
                ", dueDate = " + dueDate +
                ", finished = " + finished +
                "}";
    }
}
