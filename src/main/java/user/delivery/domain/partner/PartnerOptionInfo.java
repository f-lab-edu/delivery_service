package user.delivery.domain.partner;

import user.delivery.domain.Address;

import javax.persistence.Embedded;
import java.time.LocalDateTime;

@SuppressWarnings("FieldCanBeLocal")
public class PartnerOptionInfo {
    private final Long id;
    private final String phone;
    private final String license;
    private final String licenseNum;
    private final String name;
    private final String account;
    private final Partner partner;
    private final String state;
    private final Address address;


    public PartnerOptionInfo(Long id, String phone,
                             String license, String licenseNum,
                             String name, String account,
                             Partner partner, String state,
                             Address address) {
        this.id = id;
        this.phone = phone;
        this.license = license;
        this.licenseNum = licenseNum;
        this.name = name;
        this.account = account;
        this.partner = partner;
        this.state = state;
        this.address = address;
    }

}
