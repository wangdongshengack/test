package java9.观察者模式;
//被观察者接口
public interface BasketBallInterface {
    //新增
    public void add(SayComputerGame sayComputerGame);
    //删除
    public void remove(SayComputerGame sayComputerGame);
    //推送
    public void push();
}
