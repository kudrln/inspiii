@Entity
@Table(name = "viewer")
public class Viewer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(name = "birth_date", nullable = false)
    private java.sql.Date birthDate;

    @Column(name = "registration_date")
    private java.sql.Date registrationDate;

    @ManyToMany(mappedBy = "viewer")
    private List<Website> website;

    public Viewer() {
    }

    public Viewer(String name, String surname, String nickname, java.sql.Date birthDate, java.sql.Date registrationDate) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.birthDate = birthDate;
        this.registrationDate = registrationDate;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public java.sql.Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(java.sql.Date birthDate) {
        this.birthDate = birthDate;
    }

    public java.sql.Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(java.sql.Date hireDate) {
        this.hireDate = hireDate;
    }

    public List<Viewer> getViewer() {
        return viewer;
    }

    public void setViewer(List<Viewer> viewer) {
        this.viewer = users;
    }
}
