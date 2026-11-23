package cz.gyarab.prg.e4.s2.hodina10;

public class ServerConfig {
    private final String host;      // povinne
    private final int port;         // povinne
    private final int timeoutMs;    // volitelny, default 5000
    private final boolean useSsl;   // volitelny, default false

    private ServerConfig(Builder b) {
        host = b.host;
        port = b.port;
        timeoutMs = b.timeoutMs;
        useSsl = b.useSsl;
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
        private final String host;      // povinne
        private int port = 8080;         // volitelny
        private int timeoutMs = 5000;    // volitelny
        private boolean useSsl = false;   // volitelny, default false

        public Builder(String host) {
            this.host = host;
        }

        public Builder port(int port) {
            this.port = port;
            return this;
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

    /*
    public ServerConfig(String host, int port, int timeoutMs, boolean useSsl) {
        this.host = host;
        this.port = port;
        this.timeoutMs = timeoutMs;
        this.useSsl = useSsl;
    }

    public ServerConfig(String host, int port) {
        this.host = host;
        this.port = port;
    }
    */

}
