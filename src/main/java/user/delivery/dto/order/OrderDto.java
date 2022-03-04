package user.delivery.dto.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import user.delivery.dto.menu.MenuDto;
import user.delivery.dto.store.StoreDto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    public enum OrderState {
        INIT, PAYMENT_COMPLETE, ORDER_COMPLETE,
        IN_DELIVERY, DELIVERY_COMPLETE, ORDER_CANCEL
    }

    @NonNull
    private String id;

    @NonNull
    private Store store;

    @NonNull
    private BillDto bill;

    @NonNull
    private LocalDateTime order_date;

    private LocalDateTime delivery_date;

    private LocalDateTime complete_date;

    private long delivery_price;

    private OrderState orderState;


    public long deliveryPrice() {
        long deliveryPrice;
        if (bill.getMenu_price() > 20000L)
            deliveryPrice = 0;

        else
            deliveryPrice = store.delivery_price;

        this.delivery_price = deliveryPrice;

        return delivery_price;
    }


    @Data
    @AllArgsConstructor
    public static class Store {

        @NonNull
        private String id;
        @NonNull
        private String name;
        @NonNull
        private String address;
        @NonNull
        private String phone;
        @NonNull
        private Long delivery_price;

    }
}
