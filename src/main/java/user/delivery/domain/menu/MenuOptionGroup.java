package user.delivery.domain.menu;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "menu_option_group")
@Getter
@Setter
@NoArgsConstructor
public class MenuOptionGroup {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long menuId;
    private String name;

    @OneToMany(mappedBy = "menuOptionGroup")
    private List<MenuOption> optionList = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_option_group_id")
    private Menu menu;
}

