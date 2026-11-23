package cz.gyarab.prg.e4.s2.hodina10;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class ServerConfigV2 {
    private final String host;

    @Builder.Default
    private final int port = 8080;         // povinne

    @Builder.Default
    private final int timeoutMs = 5000;

    @Builder.Default
    private final boolean useSsl = false;
}
