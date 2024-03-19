package programmerzamannow.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
/*
ketika @Data maka akan semuanya tergenerate:
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
 */

@RequiredArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"price"})
public class Product {

    private final String id;

    private String name;

    private Long price;
}
