package user.delivery.domain.menu;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import user.delivery.domain.order.OrderOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "menu")
@Getter
@Setter
@NoArgsConstructor
public class Menu {

    public enum REGISTER {
        REGISTER, DELELTE
    }

    public enum State {
        SHOW, HIDING, SOLDOUT
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String StoreId;
    private String menu;
    private String menuInfo;
    private State state;
    private REGISTER delete;
    private Long price;
    private String img;


    @OneToMany(mappedBy = "menu")
    private List<MenuOptionGroup> optionList = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_option_id")
    private OrderOption orderOption;

}
