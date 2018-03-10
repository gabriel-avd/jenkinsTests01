package Controllers;

import Services.OperationsService;
import javax.inject.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationsController {

    @Inject
    OperationsService operationsService;

    @RequestMapping("/")
    public String index() {
        return Integer.toString(operationsService.sum(new int[]{1,2,3,4,5,6}));
    }

}
