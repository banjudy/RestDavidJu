package progmat.BanJu.RestDavidJu.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class HoffInfo {

    private String type;
    private String info;

    @Override
    public String toString() {
        return info;
    }
}
