package com.appsdeveloperblog.app.ws.mobileappws.serviceImpl;

import com.appsdeveloperblog.app.ws.mobileappws.OTP.OTP;
import com.appsdeveloperblog.app.ws.mobileappws.Utils.Error;
import com.appsdeveloperblog.app.ws.mobileappws.Utils.UtilsClass;
import com.appsdeveloperblog.app.ws.mobileappws.dto.request.*;
import com.appsdeveloperblog.app.ws.mobileappws.dto.response.MessageResponse;
import com.appsdeveloperblog.app.ws.mobileappws.exception.UserException;
import com.appsdeveloperblog.app.ws.mobileappws.model.User;
import com.appsdeveloperblog.app.ws.mobileappws.Repository.UserRepository;
import com.appsdeveloperblog.app.ws.mobileappws.service.UnauthenticatedUserService;
import com.appsdeveloperblog.app.ws.mobileappws.service.UserService;
import com.appsdeveloperblog.app.ws.mobileappws.email.EmailSender;
import com.appsdeveloperblog.app.ws.mobileappws.email.EmailService;
import com.appsdeveloperblog.app.ws.mobileappws.OTP.OTPService;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
@RequiredArgsConstructor
public class UnauthenticatedUserImpl implements UnauthenticatedUserService{

   private final UserService userService;

   private final EmailService emailService;

  private final OTPService otpService;

   private final EmailSender emailSender;

  private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public MessageResponse signup(SignupRequest signupRequest) throws MessagingException{
        boolean emailExists = userRepository
                .findByEmailIgnoreCase(signupRequest.getEmailAddress())
                .isPresent();
        if(emailExists)throw new UserException(Error.EMAIL_ALREADY_EXIST);

        if(!signupRequest.getPassword().equals(signupRequest.getConfirmPassword()))
            throw new UserException(Error.PASSWORD_DO_NOT_MATCH);

        User user = User.builder()
                        .firstName(signupRequest.getFirstName().toLowerCase())
                        .lastName(signupRequest.getLastName().toLowerCase())
                        .email(signupRequest.getEmailAddress().toLowerCase())
                        .password(passwordEncoder.encode(signupRequest.getPassword()))
                        .build();


                try{
                    userRepository.save(user);
                }

        OTP otp = UtilsClass.generateOtp();
                userService.generateToken(user);
        emailSender.send(signupRequest.getEmailAddress(),
                buildEmail(signupRequest.getFirstName(), token));

        return MessageResponse.builder().message("Sign-up successful").build();
    }

    @Override
    public String login(LoginRequest loginRequest){
        var user = userRepository.findByEmailIgnoreCase(loginRequest.getEmailAddress())
                .orElseThrow(()-> new UserException(Error.USER_NOT_FOUND));

        if(!BCrypt.checkpw(loginRequest.getPassword(),user.getPassword())){
            throw new UserException(Error.INVALID_LOGIN_DETAILS);
        }

        if (!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword()))
            throw new UserException(Error.INVALID_LOGIN_DETAILS);

        if(user.getIsVerified().equals(false)) throw new UserException(Error.UNVERIFIED_USER);

        return "Login Successful";
    }


    @Override
    public MessageResponse otpConfirmation(OtpConfirmationRequest confirmationRequest){
        var foundOtp = otpService.getConfirmationOtp(confirmationRequest.getOtp())
                .orElseThrow(()-> new UserException("Invalid OTP"));
if(foundOtp.getExpiredAt().isBefore(LocalDateTime.now())){
    throw new UserException(Error.OTP_EXPIRED);
}
otpService.setOtpConfirmationAt(foundOtp.getOtp());
userService.enableUser(confirmationRequest.getEmail());
        return
                MessageResponse.builder()
                        .message("User has been confirmed successfully")
                        .build();


    }



    @Override
    public String resendOtp(ResendOtpRequest resendOtpRequest){
        var foundUser = userRepository.findByEmailIgnoreCase(resendOtpRequest.getEmail())
                .orElseThrow(()-> new UserException(Error.USER_NOT_FOUND));

        String otp = userService.generateToken(foundUser);
        emailService.send(resendOtpRequest.getEmail(), buildEmail(foundUser.getFirstName(), otp));
        return "OTP has been sent successfully ";
    }

    private String buildEmail(String firstName,String token){
        return  "<div style=\"font-family:Helvetica,Arial,sans-serif;font-size:16px;margin:0;color:#0b0c0c\">\n" +
                "\n" +
                "<span style=\"display:none;font-size:1px;color:#fff;max-height:0\"></span>\n" +
                "\n" +
                "  <table role=\"presentation\" width=\"100%\" style=\"border-collapse:collapse;min-width:100%;width:100%!important\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "    <tbody><tr>\n" +
                "      <td width=\"100%\" height=\"53\" bgcolor=\"#0b0c0c\">\n" +
                "        \n" +
                "        <table role=\"presentation\" width=\"100%\" style=\"border-collapse:collapse;max-width:580px\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\">\n" +
                "          <tbody><tr>\n" +
                "            <td width=\"70\" bgcolor=\"#0b0c0c\" valign=\"middle\">\n" +
                "                <table role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse\">\n" +
                "                  <tbody><tr>\n" +
                "                    <td style=\"padding-left:10px\">\n" +
                "                  \n" +
                "                    </td>\n" +
                "                    <td style=\"font-size:28px;line-height:1.315789474;Margin-top:4px;padding-left:10px\">\n" +
                "                      <span style=\"font-family:Helvetica,Arial,sans-serif;font-weight:700;color:#ffffff;text-decoration:none;vertical-align:top;display:inline-block\">Confirm your email</span>\n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                </tbody></table>\n" +
                "              </a>\n" +
                "            </td>\n" +
                "          </tr>\n" +
                "        </tbody></table>\n" +
                "        \n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody></table>\n" +
                "  <table role=\"presentation\" class=\"m_-6186904992287805515content\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse;max-width:580px;width:100%!important\" width=\"100%\">\n" +
                "    <tbody><tr>\n" +
                "      <td width=\"10\" height=\"10\" valign=\"middle\"></td>\n" +
                "      <td>\n" +
                "        \n" +
                "                <table role=\"presentation\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse\">\n" +
                "                  <tbody><tr>\n" +
                "                    <td bgcolor=\"#1D70B8\" width=\"100%\" height=\"10\"></td>\n" +
                "                  </tr>\n" +
                "                </tbody></table>\n" +
                "        \n" +
                "      </td>\n" +
                "      <td width=\"10\" valign=\"middle\" height=\"10\"></td>\n" +
                "    </tr>\n" +
                "  </tbody></table>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  <table role=\"presentation\" class=\"m_-6186904992287805515content\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse;max-width:580px;width:100%!important\" width=\"100%\">\n" +
                "    <tbody><tr>\n" +
                "      <td height=\"30\"><br></td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "      <td width=\"10\" valign=\"middle\"><br></td>\n" +
                "      <td style=\"font-family:Helvetica,Arial,sans-serif;font-size:19px;line-height:1.315789474;max-width:560px\">\n" +
                "        \n" +
                "            <p style=\"Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#0b0c0c\">Hi " + firstName + ",</p><p style=\"Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#0b0c0c\"> Thank you for registering. Please click on the below link to activate your account: </p><blockquote style=\"Margin:0 0 20px 0;border-left:10px solid #b1b4b6;padding:15px 0 0.1px 15px;font-size:19px;line-height:25px\"><p style=\"Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#0b0c0c\">" + token + "</p></blockquote>\n Link will expire in 10 minutes. <p>See you soon</p>" +
                "        \n" +
                "      </td>\n" +
                "      <td width=\"10\" valign=\"middle\"><br></td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "      <td height=\"30\"><br></td>\n" +
                "    </tr>\n" +
                "  </tbody></table><div class=\"yj6qo\"></div><div class=\"adL\">\n" +
                "\n" +
                "</div></div>";

    }

}
