package bridge;

import camp.nextstep.edu.missionutils.Console;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {

    static int Bridgesize;

    static String Input;



    Constant constant;

    @DisplayName("올바른 숫자가 들어가면 동작한다")
    @Test
    void readBridgeSize() {
        Input = "3";
        CheckInput checkInput = new CheckInput(Input);
        System.out.println("Input = " + Input);
        try {
            checkInput.checkBridgeSize();
        }catch (IllegalArgumentException e){
            System.out.println(constant.ERROR);
        }
        System.out.println(Integer.parseInt(Input));
    }

    @DisplayName("문자 입력시 에러 발생")
    @Test
    void readBridgeSize2() {
        Input = "abc";
        CheckInput checkInput = new CheckInput(Input);
        System.out.println("Input = " + Input);
        int size = 0;
        try {
            size = checkInput.checkBridgeSize();
        }catch (IllegalArgumentException e){
            System.out.println(constant.ERROR);
        }
        System.out.println("size = " + size);
    }

    @DisplayName("범위에 안맞는 입력시 에러 발생")
    @Test
    void readBridgeSize3() {
        Input = "400";
        CheckInput checkInput = new CheckInput(Input);
        System.out.println("Input = " + Input);
        int size = 0;
        try {
            checkInput.checkBridgeSize();
        }catch (IllegalArgumentException e){
            System.out.println(constant.ERROR);
        }
        System.out.println("size = " + size);
    }

    @Test
    void readMoving() {
    }

    @Test
    void readGameCommand() {
    }
}