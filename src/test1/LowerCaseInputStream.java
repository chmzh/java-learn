package test1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return super.read(b, off, len);
	}
}
