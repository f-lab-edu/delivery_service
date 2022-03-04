package user.delivery.dto.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class PaymentDto {

    public enum PayState{
        CARD, NAVER_PAY, TOSS_PAY
    }

    @NonNull
    private String order_id;

    @NonNull
    private String partner_name;

    @NonNull
    private String store_name;

    @NonNull
    private PayState payState;

    @NonNull
    private String menu;

    @NonNull
    private Long menu_count;

    @NonNull
    private Long price;

    @NonNull
    private String order_status;
}
