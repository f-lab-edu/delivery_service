package user.delivery.domain.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import user.delivery.domain.menu.Menu;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "order_option")
@Getter
@Setter
@NoArgsConstructor
public class OrderOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "orderOption")
    private List<Menu> menuList = new ArrayList<>();

    private Long count;
    private Long totalPrice;
}
