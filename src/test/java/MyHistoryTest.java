import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MyHistoryTest {

    @Test
    void read() {
        MyHistory h = new MyHistory("src/abceda.txt");

        assertThrows(IOException.class, () -> h.read());

    }

    @Test
    void readRight() throws IOException  {
        MyHistory h = new MyHistory("src/abc.txt");
        h.addLine("novy radek!");
        h.save();

    }

    @Test
    void addLine() throws IOException {
        MyHistory h = new MyHistory("src/abcedarek.txt");
        h.addLine("hmm");


    }

    @Test
    void addLine3() throws IOException {
        MyHistory h = new MyHistory("src/abc.txt");
        h.addLine("radek1");
        h.addLine("radek 2");
        h.addLine("radek 3");
        h.save();
    }
    @Test
    void duplicity() throws IOException {
        MyHistory h = new MyHistory("src/abc.txt");
        h.addLine("radek1");
        h.addLine("radek 2");
        h.addLine("radek 2");
        assertEquals("radek1\nradek 2",h.toString());
    }

}