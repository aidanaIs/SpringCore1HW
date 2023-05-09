package course;

import lombok.ToString;

@ToString
public class BreakDancer implements Movements{
    @Override
    public void getDanceType() {
        System.out.println("This dancer dances break dance.");
    }
}
