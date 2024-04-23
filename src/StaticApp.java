class Foo{
    public static String classVar = "I class Var";
    public String instanceVar = "I instance Var";
    public static void classMethod(){
        System.out.println(classVar); // 클래스 메소드 안에서는 클래스 변수에는 접근이 가능하다
        //System.out.println(instanceVar); // 인스턴스 변수에는 접근을 할 수 없다.
    }
    public void instanceMethod(){
        System.out.println(classVar); // 인스턴스 메소드 안에서 클래스 변수에 접근 가능
        System.out.println(instanceVar); // 인스턴스 메소드에서는 인스턴스 변수에 접근
    }
}
public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classVar); // 클래스를 통해서는 당연히 클래스 변수에 접근이 가능
        //System.out.println(Foo.instanceVar); // 인스턴스는 인스턴스를 통해서 사용할 수 있는 변수
        Foo.classMethod();
        //Foo.instanceMethod(); // 인스턴스 메소드는 인스턴트 소속이기 때문에 클래스를 통해서 접근하는 것은 금지

        Foo f1 = new Foo(); // 인스턴트 생성
        Foo f2 = new Foo();

        System.out.println(f1.classVar);
        System.out.println(f1.instanceVar);

        f1.classVar = "Changed by f1";
        System.out.println(Foo.classVar);
        System.out.println(f2.classVar);

        f1.instanceVar = "Changed by f1";
        System.out.println(f1.instanceVar);
        System.out.println(f2.instanceVar);
    }
}
