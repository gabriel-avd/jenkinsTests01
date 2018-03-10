package Services;
import main.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.*;

import javax.inject.Inject;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class OperationsTest {

    @Inject OperationsService operationsService;

    @Test
    public void sumTest(){
        int result = operationsService.sum(new int[]{1,2,3});
        Assert.assertThat(result, is(6));
    }

    @Test
    public void restTest(){
        int result = operationsService.rest(new int[]{10,2,3});
        Assert.assertThat(result, is(5));
    }
}
