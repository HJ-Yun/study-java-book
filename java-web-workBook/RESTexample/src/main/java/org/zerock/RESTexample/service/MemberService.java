package org.zerock.RESTexample.service;

import org.zerock.RESTexample.dto.MemberJoinDTO;

public interface MemberService {

    static class MidExistException extends Exception{

    }

    void join(MemberJoinDTO memberJoinDTO) throws MidExistException;

}
