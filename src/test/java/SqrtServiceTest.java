import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SqrtService;

;

public class SqrtServiceTest {

    @Test
    public void testReturnNumberSqr() {
        SqrtService service = new SqrtService();

        int actual = service.calcSqrt(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);


    }
}
