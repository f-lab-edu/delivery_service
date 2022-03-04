package user.delivery.dto.menu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@AllArgsConstructor
public class MenuDto {

    public enum REGISTER {
        REGISTER, DELELTE
    }


    public enum State {
        SHOW, HIDING, SOLDOUT
    }

    @NonNull
    private Long id;

    @NonNull
    private String menu;

    @NonNull
    private String menu_info;

    @NonNull
    private State state;

    @NonNull
    private REGISTER delete;

    @NonNull
    private Long price;

    @NonNull
    private Long count;

    private String img;

    private List<OptionGroupDto> optionList;

    public long sumPrice() {
        this.price = optionList.stream().mapToLong(option -> {
            return (option.getOptionDtoList().stream().mapToLong(detail -> detail.getPrice()).sum()) * this.getCount();
        }).sum();
        return price;
    }
}
