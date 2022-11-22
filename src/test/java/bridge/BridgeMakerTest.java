package bridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BridgeMakerTest {

    @DisplayName("랜덤 넘버 반환 형식 확인")
    @Test
    void makeBridge() {
        BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
        int generate = bridgeRandomNumberGenerator.generate();
        System.out.println("generate = " + generate); // 0 또는 1을 뽑아줌
    }
    @DisplayName("다리 생성 확인")
    @Test
    void makeBridge2() {
        BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
        BridgeMaker bridgeMaker = new BridgeMaker(bridgeRandomNumberGenerator);
        List<String> bridge = bridgeMaker.makeBridge(4);
        System.out.println("bridge = " + bridge);
    }
}