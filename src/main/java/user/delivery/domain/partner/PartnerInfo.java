package user.delivery.domain.partner;

import user.delivery.domain.Address;

import javax.persistence.Embedded;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("FieldCanBeLocal")
public class PartnerInfo {
    private final Long id;
    private final String partnerId;
    private final String password;
    private final String nickname;
    private final String email;
    private final String phone;

    @Embedded
    private final Address address;

    private final List<PartnerOption> business;

    public PartnerInfo(Long id, String partnerId, String password, String nickname, String email, String phone, Address address, List<PartnerOption> business) {
        this.id = id;
        this.partnerId = partnerId;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.business = business;
    }

}
