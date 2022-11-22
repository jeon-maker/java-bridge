package bridge.domain;

import bridge.BridgeNumberGenerator;
import bridge.BridgeRandomNumberGenerator;
import bridge.Service.BridgeMaker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheckMoveTest {
    private static BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
    private static BridgeMaker bridgeMaker = new BridgeMaker(bridgeNumberGenerator);
    private static InputView inputView;
    public static List<String> bridge = bridgeMaker.makeBridge(3);

    @DisplayName("다리와 일치하는지 확인")
    @Test
    void checkMovable() {
        int step = 0;
        String level = "U";
        System.out.println("bridge = " + CheckMoveTest.bridge);
        // 스텝을 입력받음
        if(CheckMoveTest.bridge.get(step) == level){
            System.out.println("correct");
        }
        System.out.println("XXX");
        }
    }
