package cz.gyarab.prg.e4.s1.hodina10;

public class ServerConfig {
    private final String host;      // povinny
    private final int port;         // povinny
    private final int timeoutMs;    // volitelny
    private final boolean useSsl;   // volitelny

    private ServerConfig(Builder builder) {
        host = builder.host;
        port = builder.port;
        timeoutMs = builder.timeoutMs;
        useSsl = builder.useSsl;
    }

    @Override
    public String toString() {
        return "ServerConfig{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", timeoutMs=" + timeoutMs +
                ", useSsl=" + useSsl +
                '}';
    }

    public static class Builder {
        private final String host;      // povinny
        private final int port;         // povinny
        private int timeoutMs = 2000;    // volitelny
        private boolean useSsl = false;  // volitelny

        public Builder(String host, int port) {
            this.host = host;
            this.port = port;
        }

        public Builder timeoutMs(int timeoutMs) {
            this.timeoutMs = timeoutMs;
            return this;
        }

        public Builder useSsl(boolean useSsl) {
            this.useSsl = useSsl;
            return this;
        }

        public ServerConfig build() {

            return new ServerConfig(this);
        }
    }
}
