package user.delivery.dto.store;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class StoreDto {

    public enum State{
        OPEN, CLOSE
    }

    @NonNull
    private String id;

    @NonNull
    private String category;

    @NonNull
    private String name;

    @NonNull
    private State state;

    private String business_id;

    private String address;

    private String phone;

    private String info;

    private Long delivery_price;
}
