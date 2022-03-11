package user.delivery.domain.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import user.delivery.domain.partner.Store;
import user.delivery.domain.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "order")
@Getter
@Setter
@NoArgsConstructor
public class Order {

    public enum OrderState {
        INIT, PAYMENT_COMPLETE, ORDER_COMPLETE,
        IN_DELIVERY, DELIVERY_COMPLETE, ORDER_CANCEL
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;
    private LocalDateTime completeDate;
    private Long deliveryPrice;
    private OrderState orderState;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private OrderOption orderOption;

}
