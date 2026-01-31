package org.zerock.RESTexample.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import org.zerock.RESTexample.domain.Member;
import org.zerock.RESTexample.domain.MemberRole;
import org.zerock.RESTexample.repository.MemberRepository;
import org.zerock.RESTexample.security.dto.MemberSecurityDTO;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Log4j2
@Service
@RequiredArgsConstructor
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest request) throws OAuth2AuthenticationException {
        log.info("userRequest------------");
        log.info(request);

        log.info("oauth2 user...........");

        ClientRegistration clientRegistration = request.getClientRegistration();
        String clientName = clientRegistration.getClientName();
        log.info("clientName = " + clientName);

        OAuth2User oAuth2User = super.loadUser(request);
        Map<String, Object> paramMap = oAuth2User.getAttributes();

        paramMap.forEach( (k,v) ->{
            log.info("---------------------------");
            log.info(k + " : " + v);
        });

        String email = null;

        switch (clientName){
            case "kakao":
                email = getNickName(paramMap);
                break;
        }

        log.info("==================================");
        log.info(email);
        log.info("==================================");

        return generateDTO(email, paramMap);
    }

    private MemberSecurityDTO generateDTO (String email, Map<String, Object> params){

        Optional<Member> result = memberRepository.findByEmail(email);

        if (result.isEmpty()){
            Member member = Member.builder()
                    .mid(email)
                    .mpw(passwordEncoder.encode("1111"))
                    .email(email)
                    .social(true)
                    .build();
            member.addRole(MemberRole.USER);
            memberRepository.save(member);

            MemberSecurityDTO memberSecurityDTO = new MemberSecurityDTO(email,"1111",email,false,true, Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
            memberSecurityDTO.setProp(params);

            return memberSecurityDTO;
        } else {
            Member member = result.get();
            MemberSecurityDTO memberSecurityDTO = new MemberSecurityDTO(
                    member.getMid(),
                    member.getMpw(),
                    member.getEmail(),
                    member.isDel(),
                    member.isSocial(),
                    member.getRoleSet()
                            .stream().map(memberRole -> new SimpleGrantedAuthority("ROLE_" + memberRole.name()))
                            .collect(Collectors.toList())
            );

            return memberSecurityDTO;
        }

    }

    private String getNickName(Map<String, Object> paramMap){
        log.info("KAKAO-------------------");

        Object value = paramMap.get("kakao_account");
        log.info("KAKAO-------------------value");
        log.info(value);

        LinkedHashMap accountMap = (LinkedHashMap) value;

        LinkedHashMap profile = (LinkedHashMap) accountMap.get("profile");
        log.info("KAKAO-------------------profile");
        log.info(profile);

        String nickName = (String) profile.get("nickname");
        log.info("nickName : " + nickName);

        return nickName;
    }


}
