package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    static int Bridgesize;
    static String Input;

    static int size;

    static String Level ; // 위 , 아래
    Constant constant;

    /**
     * 다리의 길이를 입력받는다.
     */
    public void readBridgeSize() {
        this.Input = Console.readLine();
        CheckInputBridgeSize checkInputBridgeSize = new CheckInputBridgeSize(Input);
        try {
            this.size = checkInputBridgeSize.checkBridgeSize();
        }catch (IllegalArgumentException e){
            System.out.println(constant.ERROR);
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        this.Level = Console.readLine();
        new CheckInputBridgeLevel(Level);
        return Level;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
