package user.delivery.dto.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

//입점신청시 사용되는 DTO
@Data
@AllArgsConstructor
public class PartnerDto {

    @NonNull
    private String phone;

    @NonNull
    private String license;

    @NonNull
    private String business_id;

    @NonNull
    private String name;

    @NonNull
    private String address;

    @NonNull
    private String business_account;
}
