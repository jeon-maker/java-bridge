package bridge.domain;

import bridge.BridgeNumberGenerator;
import bridge.BridgeRandomNumberGenerator;
import bridge.Service.BridgeMaker;

import java.util.List;

public class CheckMove {


    public int checkMovable (List<String> bridge,String level,int step){ // 스텝을 입력받음
        if(bridge.get(step) == level){
            return 0; // 맞으면 0
        }
        return 1; //틀리면 1
    }
}
