package user.delivery.dto.menu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@AllArgsConstructor
public class OptionGroupDto {

    public enum State {
        SHOW,HIDING,SOLDOUT
    }

    @NonNull
    private Long id;

    @NonNull
    private Long menu_id;

    @NonNull
    private String name;

    private List<OptionDto> optionDtoList;
}
