package user.delivery.dto.menu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class OptionDto {

    @NonNull
    private Long id;

    @NonNull
    private Long option_id;

    @NonNull
    private String name;

    @NonNull
    private Long price;

}
