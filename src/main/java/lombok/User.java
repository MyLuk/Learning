package lombok;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;


@Getter @Setter @NoArgsConstructor // <--- THIS is it
public class User implements Serializable {

//    private @Id Long id; // will be set when persisting

    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

//    @SneakyThrows(UnsupportedEncodingException.class)
//    public String utf8ToString(byte[] bytes) {
//        return new String(bytes);
//    }
}
