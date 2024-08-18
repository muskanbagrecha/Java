package src.designpatterns.decorator.javaiopractice;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in){
        super(in);
    }

    @Override
    public int read() throws IOException {
        return super.read();
    }
}
