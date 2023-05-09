package course;

import lombok.*;

import java.util.List;

@Getter
@ToString
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dancer {
    private List<Movements> list;
    private int age;
    private int yearsDancing;
}
