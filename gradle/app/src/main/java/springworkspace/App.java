package springworkspace;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
// @NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor //파이널만 생성자 만들어줌
@Builder
class Person {
    private final String name;
    private int age;
}

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Person person = new Person("홍길동", 20);

        person = new Person("고길동");
        person = Person.builder().name("홍길동").age(20).build();
    
    }
}
