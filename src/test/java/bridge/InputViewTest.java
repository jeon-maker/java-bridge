package bridge;

import bridge.Service.Constant;
import bridge.domain.CheckInputBridgeLevel;
import bridge.domain.CheckInputBridgeSize;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputViewTest {

    static int Bridgesize;

    static String Input;


    Constant constant;

    @DisplayName("올바른 숫자가 들어가면 동작한다")
    @Test
    void readBridgeSize() {
        Input = "3";
        CheckInputBridgeSize checkInputBridgeSize = new CheckInputBridgeSize(Input);
        System.out.println("Input = " + Input);
        try {
            checkInputBridgeSize.checkBridgeSize();
        }catch (IllegalArgumentException e){
            System.out.println(constant.ERROR);
        }
        System.out.println(Integer.parseInt(Input));
    }

    @DisplayName("문자 입력시 에러 발생")
    @Test
    void readBridgeSize2() {
        Input = "abc";
        CheckInputBridgeSize checkInputBridgeSize = new CheckInputBridgeSize(Input);
        System.out.println("Input = " + Input);
        int size = 0;
        try {
            size = checkInputBridgeSize.checkBridgeSize();
        }catch (IllegalArgumentException e){
            System.out.println(constant.ERROR);
        }
        System.out.println("size = " + size);
    }

    @DisplayName("범위에 안맞는 입력시 에러 발생")
    @Test
    void readBridgeSize3() {
        Input = "400";
        CheckInputBridgeSize checkInputBridgeSize = new CheckInputBridgeSize(Input);
        System.out.println("Input = " + Input);
        int size = 0;
        try {
            checkInputBridgeSize.checkBridgeSize();
        }catch (IllegalArgumentException e){
            System.out.println(constant.ERROR);
        }
        System.out.println("size = " + size);
    }

    @DisplayName("사용자가 이동할 칸에 대해서 올바른 값을 입력하는지 확인")
    @Test
    void readMoving() {
        String Level = "o";

        new CheckInputBridgeLevel(Level);

        System.out.println("Level = " + Level);

    }

    @Test
    void readGameCommand() {
    }
}