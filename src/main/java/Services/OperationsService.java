package Services;

import org.springframework.stereotype.Repository;

@Repository
public class OperationsService {

    public int sum(int... params){
        int result=0;
        for (int param: params) {
            result += param;
        }
        return result;
    }

    public int rest(int... params){
        int result = 0;
        for (int i = 0; i < params.length; i++){
            if (i == 0)
                result = params[0];
            else
                result -= params[i];
        }
        return result;
    }
}
