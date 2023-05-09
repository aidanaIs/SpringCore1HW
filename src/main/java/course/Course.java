package course;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Course {
    private List<prg_lang> prgLangs;
    private int duration;
    private int price;
}
