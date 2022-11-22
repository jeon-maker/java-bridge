package bridge.domain;

import bridge.Service.Constant;

public class CheckInputBridgeSize {
    Constant constant;
    private String size;

    private int size_;

    public CheckInputBridgeSize(String size) {
        this.size = size;
    }

    public int checkBridgeSize() {
        try {
            this.size_ = Integer.parseInt(size);
            checkBridgeSizeRange(size_);
        } catch (NumberFormatException n) {
            System.out.println(constant.ERROR);
            System.out.println("숫자를 입력하세요");
        }
        return size_;
    }

    public void checkBridgeSizeRange(int size_) {
        try {
            if (constant.Min_BridgeSize > size_ || size_ > constant.Max_BridgeSize) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(constant.ERROR);
            System.out.println("범위 오류");
        }
    }

}