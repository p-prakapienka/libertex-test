package by.prakapienka.libertex.entity;

import javax.persistence.*;

@Entity
public class User {

    @Version
    private long version;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public User() {
    }

    public User(final String name) {
        this.name = name;
    }

    public User(final Integer id, final String name) {
        this.id = id;
        this.name = name;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "version=" + version +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
