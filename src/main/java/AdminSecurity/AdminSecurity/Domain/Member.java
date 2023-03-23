package AdminSecurity.AdminSecurity.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public class Member {

    @Id @GeneratedValue
    Long id;

    String name;

    String password;

    String site;

    public Member(String name, String password, String site){
        this.name = name;
        this.password = password;
        this.site = site;
    }


    public Member() {

    }
}
