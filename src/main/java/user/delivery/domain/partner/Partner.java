package user.delivery.domain.partner;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import user.delivery.domain.Address;
import user.delivery.domain.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "partner")
@Getter
@Setter
@NoArgsConstructor
public class Partner extends BaseEntity {

    public enum State{
       USE, LEAVE, BLOCK
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String partnerId;
    private String password;
    private String nickname;
    private String email;
    private String phone;
    private State state;

    @OneToMany(mappedBy = "partner")
    private List<PartnerOption> business = new ArrayList<>();

    @Embedded
    private Address address;

    @Builder
    public Partner(String partnerId,
                String password,
                String nickname,
                String email,
                String phone,
                State state,
                Address address) {
        this.partnerId = partnerId;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.phone = phone;
        this.state = state;
        this.address = address;
    }


}
