package course;

import lombok.ToString;

@ToString
public class BalletDancer implements Movements {
    @Override
    public void getDanceType() {
        System.out.println("This dancer dances ballet.");
    }
}
