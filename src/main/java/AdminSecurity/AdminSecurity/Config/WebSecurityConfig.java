//package AdminSecurity.AdminSecurity.Config;
//
//import AdminSecurity.AdminSecurity.Service.PrincipalOauth2UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig {
//
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .oauth2Login()
//                .authorizationEndpoint()
//                .baseUri("/login");
//
//
//        return http.build();
//    }
//
//
//}
