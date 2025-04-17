public abstract class demo {
   abstract void motive();
} 
class Make extends demo{
  public void motive(){
    System.out.println("hi");
  }
}
class DoSomething{
  public static void main(String[] args) {
    Make m=new Make();
    m.motive();
  }
    
}
