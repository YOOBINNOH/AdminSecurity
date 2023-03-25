//package AdminSecurity.AdminSecurity.Service;
//
//import AdminSecurity.AdminSecurity.Domain.Member;
//import AdminSecurity.AdminSecurity.Repository.MemberRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
//import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
//import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class PrincipalOauth2UserService extends DefaultOAuth2UserService {
//
//    @Autowired MemberRepository memberRepository;
//
//
//    @Override
//    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException{
//
//        OAuth2User oAuth2User = super.loadUser(userRequest);
//
//        // 구글 아이디로 로그인 시도 시
//        if (userRequest.getClientRegistration().getRegistrationId().equals("google")){
//
//            String name =  oAuth2User.getAttribute("name");
//            String password = oAuth2User.getAttribute("sub");
//            String site = "google";
//            Member member = new Member(name,password,site);
//
//
//            memberRepository.save(member);
//        }
//
//        // 깃허브 아이디로 로그인 시도 시
//        else{
//            String name =  oAuth2User.getAttribute("login");
//            String password = oAuth2User.getAttribute("id").toString();
//
//
//
//            String site = "github";
//            Member member = new Member(name,password,site);
//
//
//            memberRepository.save(member);
//        }
//
//
//        return super.loadUser(userRequest);
//    }
//}
