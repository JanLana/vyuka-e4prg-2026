package cz.gyarab.prg.e4.s2.hodina10;

public class Main {
    static void main() {

        /*
        ServerConfig.Builder b = new ServerConfig.Builder("gyarab.ddns.net");
        b.timeoutMs(50);
        b.useSsl(true);
        ServerConfig c = b.build();
         */

        ServerConfigV2 c2 = ServerConfigV2.builder()
                .host("gyarab.ddns.net")
                .timeoutMs(50)
                .useSsl(true)
                .build();


        System.out.println(c2);
    }
}
