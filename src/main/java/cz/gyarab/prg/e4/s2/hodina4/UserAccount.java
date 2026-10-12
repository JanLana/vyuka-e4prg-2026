package cz.gyarab.prg.e4.s2.hodina4;

import java.util.List;

public class UserAccount {
    private final int id;
    private final String jméno;
    private final List<String> role;

    public UserAccount(int id, String jméno, List<String> role) {
        this.id = id;
        this.jméno = jméno;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getJméno() {
        return jméno;
    }

    public List<String> getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "id=" + id +
                ", jméno='" + jméno + '\'' +
                ", role=" + role +
                '}';
    }
}
