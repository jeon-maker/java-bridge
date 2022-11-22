package bridge.Service;

import bridge.controller.BridgeGame;

import java.util.Arrays;
import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    public static BridgeGame bridgeGame = new BridgeGame();

    public static List<String> bridge = bridgeGame.bridge;

    public static int size = bridge.size();

    private List<String> UpBridge;
    private List<String> DownBridge;

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(int step,int val, int size) { // step : 진행 단계 / val : 성공으로 넘어왔는지 - 0, 실패로 넘어왔는지 -1
        if(size == 1){
            print1stepBridge(step,val);
        }



    }

    public void print1stepBridge(int step, int val){

    }

    public void makePrintBridgeWall(){
        this.UpBridge= Arrays.asList("[","]");
        this.DownBridge= Arrays.asList("[","]");
        for(int i=0;i<size-1;i++){
            UpBridge.add(1,"|");
            DownBridge.add(1,"|");
        }
    }

    public void makePrintBridgeUpValue(){ // 2n +1 번 인덱스에 넣어주면 됨
        for(int i=0;i<size;i++){
            String val = bridge.get(i);
            if(val == "U"){
                UpBridge.add((2*i+1),val);
            }
        }
    }
    public void makePrintBridgeDownValue(){ // 2n +1 번 인덱스에 넣어주면 됨
        for(int i=0;i<size;i++){
            String val = bridge.get(i);
            if(val == "D"){
                DownBridge.add((2*i+1),val);
            }
        }
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult() {
    }
}
