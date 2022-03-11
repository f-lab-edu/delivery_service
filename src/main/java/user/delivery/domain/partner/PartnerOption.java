package user.delivery.domain.partner;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Id;
import user.delivery.domain.Address;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "partner_option")
@Getter
@Setter
@NoArgsConstructor
public class PartnerOption {

    public enum State{
        INSPECT, ENTER, CLOSING, BLOCK
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phone;
    private String license;
    private String licenseNum;
    private String name;
    private String account;
    private State state;

    @CreationTimestamp
    private LocalDateTime applyDate;
    @UpdateTimestamp
    private LocalDateTime enterDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "partner_id")
    private Partner partner;

    @Embedded
    private Address address;

    @Builder
    public PartnerOption(Long id,
                         String phone,
                         String license,
                         String licenseNum,
                         String name,
                         String account,
                         State state,
                         Partner partner,
                         Address address) {
        this.id = id;
        this.phone = phone;
        this.license = license;
        this.licenseNum = licenseNum;
        this.name = name;
        this.account = account;
        this.state = state;
        this.partner = partner;
        this.address = address;
    }
}
