package user.delivery.domain.partner;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import user.delivery.domain.Address;

public class PartnerCommand {

    @Getter
    @ToString
    public static class JoinPartnerRequest {
        private final String partnerId;
        private final String password;
        private final String email;
        private final String nickname;
        private final String phone;
        private final Address address;

        @Builder
        public JoinPartnerRequest(String partnerId, String password,
                               String nickname, String email,
                               String phone, Address address) {

            this.partnerId = partnerId;
            this.email = email;
            this.nickname = nickname;
            this.password = password;
            this.phone = phone;
            this.address = address;
        }

        public Partner convert() {
            return Partner.builder()
                    .partnerId(this.partnerId)
                    .password(this.password)
                    .nickname(this.nickname)
                    .email(this.email)
                    .phone(this.phone)
                    .address(this.address)
                    .build();
        }

    }

    @Getter
    @ToString
    public static class UpdatePartnerRequest {
        private final String partnerId;
        private final String password;
        private final String nickname;
        private final String phone;

        @Builder
        public UpdatePartnerRequest(String partnerId,
                                 String password,
                                 String nickname,
                                 String phone) {
            this.partnerId = partnerId;
            this.nickname = nickname;
            this.password = password;
            this.phone = phone;
        }

        public Partner convert() {
            return Partner.builder()
                    .partnerId(this.partnerId)
                    .password(this.password)
                    .nickname(this.nickname)
                    .phone(this.phone)
                    .build();
        }

    }


    @Getter
    @ToString
    public static class UpdatePartnerPasswordRequest {
        private final String partnerId;
        private final String passwordBefore;
        private final String passwordAfter;

        @Builder
        public UpdatePartnerPasswordRequest(String partnerId,
                                         String passwordBefore,
                                         String passwordAfter) {
            this.partnerId = partnerId;
            this.passwordBefore = passwordBefore;
            this.passwordAfter = passwordAfter;
        }

        public Partner convert() {
            return Partner.builder()
                    .partnerId(this.partnerId)
                    .password(this.passwordAfter)
                    .build();
        }
    }

    @Getter
    @ToString
    public static class ApplyForStoreRequest {
        private final String phone;
        private final String license;
        private final String licenseNum;
        private final String name;
        private final String account;
        private final String state;
        private final Address address;

        @Builder
        public ApplyForStoreRequest(String phone,
                                    String license, String licenseNum,
                                    String name, String account,
                                    String state, Address address) {

            this.phone = phone;
            this.license = license;
            this.licenseNum = licenseNum;
            this.name = name;
            this.account = account;
            this.state = state;
            this.address = address;
        }

        public PartnerOption convert() {
            return PartnerOption.builder()
                    .phone(this.phone)
                    .license(this.license)
                    .licenseNum(this.licenseNum)
                    .name(this.name)
                    .account(this.account)
                    .state(PartnerOption.State.valueOf(this.state))
                    .address(this.address)
                    .build();
        }

    }

    @Getter
    @ToString
    public static class ExpiredForStoreRequest {
    }
}
