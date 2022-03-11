package user.delivery.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Getter
@Embeddable
@NoArgsConstructor
public class Address {
    private String address;
    private String addressDetail;

    @Builder
    public Address(String address, String addressDetail) {
        this.address = address;
        this.addressDetail = addressDetail;
    }
}
