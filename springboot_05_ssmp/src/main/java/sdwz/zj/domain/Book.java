package sdwz.zj.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//添加get、set、toString、hashCode方法
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
