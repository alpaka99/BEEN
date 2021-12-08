package com.been.beenbackend.Service;

import io.jsonwebtoken.lang.Assert;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmailConfirmationService {
//    private final ConfirmationTokenRepository confirmationTokenRepository;
    private final EmailSenderService emailSenderService;
    /**
     * 이메일 인증 토큰 생성
     * @return
     */
    public void createEmailConfirmation(int id, String email){
        String userId = Integer.toString(id);
        Assert.hasText(userId,"아이디 입력은 필수 입니다.");
        Assert.hasText(email,"수신자 이메일 입력은 필수 입니다.");

//        ConfirmationToken emailConfirmationToken = ConfirmationToken.createEmailConfirmationToken(userId);
//        confirmationTokenRepository.save(emailConfirmationToken);

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(email);
        mailMessage.setSubject("회원가입 이메일 인증");
        mailMessage.setText("http://localhost:8080/user/confirmEmail?id="+email);
        emailSenderService.sendEmail(mailMessage);

//        return emailConfirmationToken.getId();
    }

//    /**
//     * 유효한 토큰 가져오기
//     * @param confirmationTokenId
//     */
//    public ConfirmationToken findByIdAndExpirationDateAfterAndExpired(String confirmationTokenId){
//        Optional<ConfirmationToken> confirmationToken = confirmationTokenRepository.findByIdAndExpirationDateAfterAndExpired(confirmationTokenId, LocalDateTime.now(),false);
//        return confirmationToken.orElseThrow(()-> new BadRequestException(ValidationConstant.TOKEN_NOT_FOUND));
//    };

}
