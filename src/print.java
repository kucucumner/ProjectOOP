public class print {
    public String delimiter = ""; // main 이라는 메소드 안에 delimiter 라는 변수가 없기 때문에 이 클래스 소속인 delimiter가 변수가 된다.
    public print(String delimiter) {
        this.delimiter = delimiter; // this 는 내가 생성한 인스턴스를 가르키는 이름이다.
    }
    public void A() {
        System.out.println(this.delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public void B() {
        System.out.println(this.delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
