import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    private static final FastScanner fs = new FastScanner();
    private static final PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        // Start coding here for contest problems.
        // Example:
        // int t = fs.nextInt();
        // while (t-- > 0) {
        //     solve();
        // }

        out.flush();
    }

    private static void solve() throws Exception {
        // Write one test case here.
    }

    private static final class FastScanner {
        private final BufferedInputStream in = new BufferedInputStream(System.in);
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) {
                    return -1;
                }
            }
            return buffer[ptr++];
        }

        String next() throws IOException {
            int c;
            while ((c = read()) != -1 && c <= ' ') {
                // Skip whitespace.
            }
            if (c == -1) {
                return null;
            }

            StringBuilder sb = new StringBuilder();
            do {
                sb.append((char) c);
                c = read();
            } while (c > ' ');
            return sb.toString();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}
