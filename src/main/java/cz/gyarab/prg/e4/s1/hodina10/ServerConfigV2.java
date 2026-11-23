package cz.gyarab.prg.e4.s1.hodina10;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class ServerConfigV2 {
    private final String host;      // povinny
    private final int port;         // povinny

    @Builder.Default
    private final int timeoutMs = 5000;    // volitelny

    @Builder.Default
    private final boolean useSsl = false;
}
