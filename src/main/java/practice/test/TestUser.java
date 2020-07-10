package practice.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TestUser {

    @NotBlank
    private String userName;

    private Optional<@NotBlank String> nickName;

    private Optional<Integer> age;

    private LocalDate birth;

}
