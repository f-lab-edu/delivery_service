package user.delivery.domain.pay;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import user.delivery.domain.order.Order;

import javax.persistence.*;

@Entity
@Table(name = "payment")
@Getter
@Setter
@NoArgsConstructor
public class Payment {

    public enum PayState{
        CARD, NAVER_PAY, TOSS_PAY
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String order_id;
    private String partner_name;
    private PayState payState;
    private Long price;
    private String order_status;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

}
