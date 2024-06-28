package learn.mapexample;

class Person {
    String id; String pw;
    String email; String description;

    // new Person 사용했을 때 사용되는 메소드다.
    public Person(String id, String pw, String email, String description) {
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.description = description;
    }

    // 기능 생성. getId 를 사용하면 id를 보여라.

    public String getId() { return id; }
}