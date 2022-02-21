package practice.Java.study.nio.sticky;

import lombok.Data;

@Data
public class MessageProtocol {
    private int len;
    private byte[] content;
}
