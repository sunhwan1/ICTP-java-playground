package org.example;

public class DefaultObject {
    void defaultmethod() {} // 같은 패키지 안에서만 가능
    private void privatmethod(){}
    public void publicmethod(){} // 어디서든 사용 가능
    protected void protectedmethod(){} // 다른 패키지에서라도 상속이 되어있으면 가능하다.

}