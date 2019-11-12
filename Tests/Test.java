import com.company.*;
import com.company.Hobbyes.Fishing;
import com.company.Hobbyes.Football;
import com.company.enums.*;

public class Test {
    public static void main(String[] args) {
        Hobby[] hobby = new Hobby[2];
        hobby[0] = new Football("Football", Complexity.HARD, 200,"big", WorkFoot.RIGHT );
        hobby[1] = new Fishing("Fishing", Complexity.NORMAL, 100, 15.2f,2.5f );
        for (Hobby hobb:hobby) {
            System.out.println(hobb.toString());
        }
    }
}
