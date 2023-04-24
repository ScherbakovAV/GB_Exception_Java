package Seminar3;

import java.io.IOException;

public class Ex2_Counter implements AutoCloseable {
    private Integer value = 0;
    public void add() throws IOException {
        if (isClose()) {
            throw new IOException("Ресурс закрыт");
        }
        value += 1;
    }
    public Integer getValue() throws IOException {
        if (isClose()) {
            throw new IOException("Ресурс закрыт");
        }
        return value;
    }
    @Override
    public void close() throws Exception {
        value = null;
    }
    public boolean isClose() {
        return value == null;
    }
}
