package bridge.controller;

import bridge.BridgeNumberGenerator;
import bridge.BridgeRandomNumberGenerator;
import bridge.Service.BridgeMaker;
import bridge.domain.CheckMove;
import bridge.domain.InputView;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private static BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
    private static BridgeMaker bridgeMaker = new BridgeMaker(bridgeNumberGenerator);

    private static int size;

    public static List<String> bridge ;

    private static CheckMove checkMove;

    private static InputView inputView;

    static int keepGoing = 1;

    static int cnt;

    public BridgeGame(){
        start();
    }
    public void start(){
        this.size = inputView.readBridgeSize();
        this.bridge = bridgeMaker.makeBridge(size);

        while(keepGoing == 0){
            keepGoing = move();
        }
    }



    /// 여기서 다 넘겨주는걸로 합쳐보자.
    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public int move() {
        String moveWhere = inputView.readMoving();
        for(int i=0; i<size; i++){
            int val = checkMove.checkMovable(bridge, moveWhere, i);
            if(val==1){
                retry();
                break;
            }
        }

    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
    }
}
