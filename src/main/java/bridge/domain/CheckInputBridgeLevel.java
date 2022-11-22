package bridge.domain;

import bridge.Service.Constant;

public class CheckInputBridgeLevel {

    private final String level ;

    static Constant constant;

    public CheckInputBridgeLevel(String level){
        this.level = level;
        checkLevel();
    }
    public void checkLevel(){
        try {
            if(!constant.Levels.contains(level)){
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException e){
            System.out.println(constant.ERROR);
            System.out.println("올바른 입력이 필요합니다.");
        }
    }
}
