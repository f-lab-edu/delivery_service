package user.delivery.dto.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import user.delivery.dto.menu.MenuDto;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class BillDto {
    private List<MenuDto> menuList;

    private long menu_price;

    public long sumPrice() {
        this.menu_price = menuList.stream().mapToLong(MenuDto::getPrice).sum();
        return menu_price;
    }



}
